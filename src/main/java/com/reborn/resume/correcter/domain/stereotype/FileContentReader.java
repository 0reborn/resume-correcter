package com.reborn.resume.correcter.domain.stereotype;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * @author wu.yue
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Component
public @interface FileContentReader {
    String[] extensions();
}
