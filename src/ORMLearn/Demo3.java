package ORMLearn;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * Created by lemo on 2018/8/11.
 * 使用反射读取注解信息，模拟处理注解信息的流程
 * 第三方程序
 */
public class Demo3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class clazz =Class.forName("ORMLearn.SxtStudent");
        //获取类的所有注解
        Annotation[] annotations=clazz.getAnnotations();
        for (Annotation a:annotations){
            System.out.println(a);
        }
        //2
        SxTable st= (SxTable) clazz.getAnnotation(SxTable.class);
        System.out.println(st.value());

        //获取类指定的注解
        Field f =clazz.getDeclaredField("studentName");
        SxtField sxtField =f.getAnnotation(SxtField.class);
        System.out.println(sxtField.columnName()+" "+sxtField.type());

       //根据获得的表名，字段信息，拼出ddl语句，然后jsbc
        //执行这个sql，查询数据库中生成的相关表

        //反射机制
        //动态编译
        //动态执行javascript代码
        //动态字节码操作
    }
}
