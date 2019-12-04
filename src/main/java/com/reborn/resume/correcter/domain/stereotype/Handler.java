package com.reborn.resume.correcter.domain.stereotype;

import com.reborn.resume.correcter.domain.constant.HandleType;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;


/**
 * <p>
 * 类说明：用来标注文件处理器类型（pdf、doc、pic）
 * <p>
 * 类名称: FileHandlerPostProcessor.java
 *
 * @author wu.yue
 * @version v1.0.0
 * @date 2019/11/3 21:10
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Component
public @interface Handler {
    String type();
}