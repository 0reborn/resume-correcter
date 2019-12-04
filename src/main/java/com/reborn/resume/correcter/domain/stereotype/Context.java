package com.reborn.resume.correcter.domain.stereotype;

import java.lang.annotation.*;

/**
 * @author wu.yue
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface Context {
    Class<?> handler();
}
