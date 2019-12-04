package com.reborn.resume.correcter.bean;

import com.reborn.resume.correcter.util.BeanUtil;
import lombok.AllArgsConstructor;

import java.util.Map;

/**
 * @author wu.yue
 */
@AllArgsConstructor
public abstract class AbstractHandlerContext<T> {
    private Map<String, Class<T>> handlerMap;

    public T getHandler(String name) {
        Class<T> clazz = handlerMap.get(name);
        if (clazz == null) {
            throw new IllegalArgumentException("Unknown handler name: " + name);
        }
        return BeanUtil.getBean(clazz);
    }
}
