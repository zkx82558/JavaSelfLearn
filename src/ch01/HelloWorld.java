/**
 * 这是我的第一个java程序
 */
/**
 Java程序开发和运行原理：
 .java源文件，
 idea调用jdk中的javac.exe编译成.class的字节码文件,并存储到out目录下，
 再java.exe运行字节码文件，就可以得出控制台的结果
 */
//上面是文档注释
package ch01;

public class HelloWorld {
    public static void main(String[] args) {  //main方法的
        System.out.println("helloworld,你好");
    }
}


