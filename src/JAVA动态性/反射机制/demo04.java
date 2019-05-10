package JAVA动态性.反射机制;

import ORMLearn.SxtStudent;

import java.awt.*;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/**
 * Created by lemo on 2018/8/12.
 */
public class demo04 {

    public void test01(Map<String, SxtStudent> map , List<SxtStudent> list){
        System.out.println("demo04.test01()");;
    }

    public  Map<Integer,SxtStudent> test02(){
        System.out.println("demo4.test02");
        return null;
    }

    public  static  void main(String[] args) throws NoSuchMethodException {
        //获得指定方法的泛型信息
        Method method=demo04.class.getMethod("test01", Map.class, List.class);
        Type[] t=method.getGenericParameterTypes();//获得带泛型参数类型
        for (Type paramtype:t){
            System.out.println("#"+paramtype);
            if (paramtype instanceof ParameterizedType){
                Type[] genericTypes =((ParameterizedType)paramtype).getActualTypeArguments();
                for (Type geType:genericTypes){
                    System.out.println("泛型类型："+genericTypes);
                }
            }
        }

        //获得指定方法返回值得泛型参数类型
        Method m2 =demo04.class.getMethod("test02",null);
        Type returnType =m2.getGenericReturnType();

        if (returnType instanceof ParameterizedType){
            Type[] genericTypes =((ParameterizedType)returnType).getActualTypeArguments();
            for (Type geType:genericTypes){
                System.out.println("泛型类型："+genericTypes);
            }
        }


    }
}
