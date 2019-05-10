package JAVA动态性.反射机制;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by lemo on 2018/8/12.
 */
public class demo2 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {

        String path = "ORMLearn.SxtStudent";
        //对象是封装的数据 一个类加载后jvm会创建一个类的结构信息到对象的class对象中
        //这个类就像镜子一样，可以看到类的所有信息,就是个图纸
        Class clazz = Class.forName(path);//一个类只对应一个class信息 一个类只会被加载一次
        System.out.println(clazz.hashCode());

        Class clazz2 = Class.forName(path);
        System.out.println(clazz2.hashCode());

        Class strclass =String.class;
        Class strclass2=path.getClass();
        //不同长度的一维数组是一样的
        //一维数组与二维数据不一样

        //获得属性或者构造器
        Field[] fields = clazz.getFields();//获得public属性
        Field f = clazz.getDeclaredField("studentName");

        for (Field temp:fields){
            System.out.println("属性:"+temp);
        }
        Method[]  methods =clazz.getMethods();
        Method m0 =clazz.getMethod("getStudentName",null);
        Method m1=clazz.getMethod("setStudentName", String.class);

        for (Method temp:methods){
            System.out.println(temp);
        }
        //获得构造方法
        Constructor[] constructors =clazz.getDeclaredConstructors();
        for (Constructor c:constructors) {
            System.out.println("构造器："+c);
        }
        Constructor c=clazz.getConstructor(null);


    }
}
