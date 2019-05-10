package 动态编译;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

/**
 * Created by lemo on 2018/8/12.
 */
public class demo1 {

    public  static  void main(String[] args){
        //通过io流操作，把字符串存储为临时文件()hi.java。然后调用动态编译方法
        String string="public class hi{public static void main(String[] args){System.out.println('hello')}}";
        //动态编译
        JavaCompiler compiler =ToolProvider.getSystemJavaCompiler();
        int result=  compiler.run(null,null,null,"D:/myjava/HelloWorld.java");
        System.out.println(result==0?"编译成功":"编译失败");


    }

    public  static int compile(String sourceFile){
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        //int result =compiler.run(null,null,sourceFile);

        return 1;
    }
}
