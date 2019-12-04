package com.reborn.resume.correcter.bean;

import com.google.common.collect.Maps;
import com.reborn.resume.correcter.domain.stereotype.Context;
import com.reborn.resume.correcter.domain.stereotype.Handler;
import com.reborn.resume.correcter.util.BeanUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Copyright: Copyright(c) 2019 iwhalecloud
 * <p>
 * 类说明：TODO
 * <p>
 * 类名称: HandlerContextPostProcessor.java
 *
 * @author wu.yue
 * @version v1.0.0
 * @date 2019/11/14 15:25
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 */
@Slf4j
@Component
public class HandlerContextPostProcessor implements BeanFactoryPostProcessor {

    /**
     * 包扫描路径(所有扩展Bean所在的包)
     */
    private static final String BASE_SCAN_PACKAGE = "com.reborn.resume.correcter.bean";

    /**
     * 扫描{@code Context}注解所标注的类，并将其注册到Spring容器中
     *
     * @param beanFactory Bean工厂
     * @return void
     * @author wu.yue
     * @date 2019/11/14 20:42
     */
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanUtil.scan(BASE_SCAN_PACKAGE)
                .annotatedWith(Context.class)
                .forEach(clazz -> registerHandlerContext(beanFactory, clazz));
    }

    /**
     * 将具有Context功能的Bean注册到Spring容器中
     *
     * @param beanFactory  Bean工厂
     * @param contextClass 具有Context功能的BeanClass
     * @return void
     * @author wu.yue
     * @date 2019/11/14 21:07
     */
    private void registerHandlerContext(ConfigurableListableBeanFactory beanFactory, Class<?> contextClass) {
        Class<?> handlerClass = contextClass.getAnnotation(Context.class).handler();
        Map<String, Class> handlerMap = Maps.newHashMap();
        BeanUtil.scan(BASE_SCAN_PACKAGE).subClassOf(handlerClass).forEach(clazz -> {
            Handler annotation = clazz.getAnnotation(Handler.class);
            if (annotation != null) {
                handlerMap.put(annotation.type(), clazz);
            } else {
                log.warn("Class " + clazz.getSimpleName() + " does not annotated with @Handler");
            }
        });
        try {
            AbstractHandlerContext context = (AbstractHandlerContext) contextClass.getConstructor(Map.class).newInstance(handlerMap);
            beanFactory.registerSingleton(context.getClass().getName(), context);
        } catch (Exception e) {
            throw new RuntimeException("Failed to register handler context: " + contextClass);
        }
    }
}
