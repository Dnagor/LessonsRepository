package ua.lviv.lgs.lesson21.homework;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Attack {
    String choice() default("Yes");
    int power() default(0);
}
