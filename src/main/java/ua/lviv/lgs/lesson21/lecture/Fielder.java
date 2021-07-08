package ua.lviv.lgs.lesson21.lecture;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Fielder {
    String params() default "private annotation";
}
