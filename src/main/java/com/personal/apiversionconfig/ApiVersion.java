package com.personal.apiversionconfig;

import org.springframework.web.bind.annotation.Mapping;

import java.lang.annotation.*;

@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Mapping
public @interface ApiVersion {
    /**
     * version
     *
     * @return
     */
    int value();
}
