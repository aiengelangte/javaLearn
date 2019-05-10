package JAVA动态性.反射机制;

/**测试java lang class 类信息
 * Created by lemo on 2018/8/11.
 */
public class demo1 {

    public static void main(String[] args) throws ClassNotFoundException {
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
    }
}
