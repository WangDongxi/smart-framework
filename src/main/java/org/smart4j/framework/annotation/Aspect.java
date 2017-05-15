package org.smart4j.framework.annotation;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2017/5/15.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Aspect {
    Class<? extends Annotation> value();
}
