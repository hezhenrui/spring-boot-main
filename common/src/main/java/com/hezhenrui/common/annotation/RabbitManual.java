package com.hezhenrui.common.annotation;

import java.lang.annotation.*;

/**
 * rabbit 手动应答
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Documented
public @interface RabbitManual {
}
