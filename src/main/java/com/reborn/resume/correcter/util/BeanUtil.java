package com.reborn.resume.correcter.util;

import lombok.AllArgsConstructor;
import org.reflections.Reflections;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ApplicationObjectSupport;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.util.Set;

/**
 * <p>
 * 类说明：SpringBean工具类
 * <p>
 * 类名称: BeanUtil.java
 *
 * @author wu.yue
 * @version v1.0.0
 * @date 2019/11/3 21:05
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 */
@Component
public class BeanUtil extends ApplicationObjectSupport implements ApplicationContextAware {
    static ApplicationContext context;
    private static ApplicationContext applicationContext = null;

    public BeanUtil getInstance() {
        return new BeanUtil();
    }

    @Override
    protected void initApplicationContext(ApplicationContext context) {
        super.initApplicationContext(context);
        if (applicationContext == null) {
            applicationContext = context;
        }
    }

    public static ApplicationContext getAppContext() {
        return applicationContext;
    }

    public static Object getBean(String name) {
        return getAppContext().getBean(name);
    }

    public static <T> T getBean(Class<T> clazz) {
        return getAppContext().getBean(clazz);
    }

    public static Set<Class<?>> scanClassesAnnotatedWith(String basePackagePath, Class<? extends Annotation> annotationClass) {
        Reflections reflections = new Reflections(basePackagePath);
        return reflections.getTypesAnnotatedWith(annotationClass);
    }

    public static <T> Set<Class<? extends T>> scanClassesSubTypesOf(String basePackagePath, Class<T> type) {
        Reflections reflections = new Reflections(basePackagePath);
        return reflections.getSubTypesOf(type);
    }

    public static Package scan(String basePackagePath) {
        return new Package(new Reflections(basePackagePath));
    }

    @AllArgsConstructor
    public static class Package {
        private Reflections reflections;

        public Set<Class<?>> annotatedWith(final Class<? extends Annotation> annotation) {
            return reflections.getTypesAnnotatedWith(annotation);
        }

        public <T> Set<Class<? extends T>> subClassOf(final Class<T> type) {
            return reflections.getSubTypesOf(type);
        }
    }
}
