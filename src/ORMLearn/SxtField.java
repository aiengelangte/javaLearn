package ORMLearn;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by lemo on 2018/8/11.
 */
@Target(value = {ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface SxtField {
    String columnName();
    String type();
    int length();
    //是否为空 就是对应数据库的属性 列名 类型  长度
}
