package ch10;

import java.lang.reflect.Constructor;

/**
 * Class类： 构造类对象
 *      成员方法：
 *          public Constructor getConstructor (Class... params)     返回一个Constructor对象，仅公共参数
 *          public Constructor getDeclaredConstructor(Class... params)    可以获得私有构造函数
 *          public Constructors[] getConstructors()                   返回所有（不含私有）构造函数的数组
 *
 *      Constructor类：构造器类,主要是通过反射构造类对象
 *          概述：属于java.base模块下的java.lang.reflect包下的类
 *
 *          成员方法：
 *              public String getName() 获取构造函数名
 *              public T newInstances(Object... params)     根据此构造函数和指定参数创建对象
 */
public class ReflectConstructor {
    public static void main(String[] args) throws Exception  {
        //1、获得Student类的字节码文件
        Class clazz = Class.forName("ch10.Student");

        //2、通过字节码文件对象获得构造器对象，创建学生对象
        //获取公共的无参构造
        Constructor con = clazz.getConstructor();
        System.out.println(con);

        //获取公共的有参构造
        Constructor con2 = clazz.getConstructor(String.class);
        System.out.println(con2);

        //获取私有的有参构造
        Constructor con3 = clazz.getDeclaredConstructor(int.class);
        System.out.println(con3);

        //获取Student所有公共构造函数
        System.out.println("----------------------");
        Constructor[] cons = clazz.getConstructors();
        for (Constructor constructor : cons) {
            System.out.println(constructor);
        }

        //获取构造器的名字，看看是哪个类构造
        String name = con2.getName();
        System.out.println(name);

        //根据构造器对象和参数，创建对应的Student对象
        System.out.println("-------------------------");
        Student stu = (Student)con2.newInstance("张三"); //要向下转型，应为返回值是Object
        System.out.println(stu);

    }
}
