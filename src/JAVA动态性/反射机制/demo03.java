package JAVA动态性.反射机制;

import ORMLearn.SxtStudent;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by lemo on 2018/8/12.
 */
public class demo03 {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        String path = "ORMLearn.SxtStudent";
        //对象是封装的数据 一个类加载后jvm会创建一个类的结构信息到对象的class对象中
        //这个类就像镜子一样，可以看到类的所有信息,就是个图纸
        Class clazz = Class.forName(path);//一个类只对应一个class信息 一个类只会被加载一次
        System.out.println(clazz.hashCode());

        SxtStudent s = (SxtStudent) clazz.newInstance();
        //反射必须需要一个无参的构造函数
        //调用有参数的构造方法
        Constructor<SxtStudent> c =clazz.getConstructor(int.class, String.class, int.class);
        SxtStudent s2= c.newInstance(1,"ss",12);

        System.out.println(s2.getStudentName());
        //调用有参方法
        Method method =clazz.getDeclaredMethod("setStudentName", String.class);
        method.invoke(s2,"sd");

        //通过反射操作属性
        Field f =clazz.getDeclaredField("studentName");
        f.setAccessible(true);//这个属性不需要做安全检查，可以直接访问
        f.set(f,"sdsds");


    }
}
