package ua.lviv.lgs.lesson21.lecture;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface UserSocial {
     String value() default "UserSocialAnnotation";
}
