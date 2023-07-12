package day01.java1;

import java.lang.annotation.*;
import static java.lang.annotation.ElementType.*;

/**
 * DATE: 2022/11/16
 * Author: yjy --- BUPT
 */
@Inherited
@Repeatable(MyAnnotations.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE,TYPE_PARAMETER,TYPE_USE})
public @interface MyAnnotation {

    String value() default "hello";
}

