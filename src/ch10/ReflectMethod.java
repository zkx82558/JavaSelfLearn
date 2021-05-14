package ch10;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Class类： 类方法
 *      成员方法：
 *          public Method getMethod(String name, Class... params)
 *          返回一个method类，仅公共成员方法
 *
 *          public Method getDeclaredMethod(String , Class... params)
 *          返回一个method类，可获得私有成员方法
 *          public Method[] getMethods()
 *          返回此类所有（不含私有）的方法
 *
 *      Method:方法类，用来表示所有的成员方法（对象的）
 *          概述：属于java.base模块下的java.lang.reflect包下的类
 *
 *          成员方法：
 *              public String getName();    获得成员方法名
 *              public Object invoke(Object obj, Object... params)  调用指定方法
 *                                                                  Obj表示该类对象
 *                                                                  params表示调用方法所需参数
 *              public void setAccessible(boolean flag)      开启暴力反射，私有方法，flag=true
 *
 */
public class ReflectMethod {
    public static void main(String[] args) throws Exception {
        //1、获得Student类的字节码文件
        Class clazz = Class.forName("ch10.Student");

        //2、通过字节码文件对象获得构造器对象，创建学生对象
        Constructor con = clazz.getConstructor();
        Student stu = (Student) con.newInstance();
        
        //调用公共空参方法：
        Method method1 = clazz.getMethod("show1");
        System.out.println(method1);
        //打印方法名字
        System.out.println(method1.getName());
        //调用此方法
        method1.invoke(stu);
        System.out.println("---------------------");

        //调用公共带参方法
        Method method2 = clazz.getMethod("show2", int.class); //掉int类型的字节码文件
        //调用方法
        method2.invoke(stu,100);
        System.out.println("---------------------");

        //调用私有带参方法
        Method method3 = clazz.getDeclaredMethod("show3", int.class, int.class);
        //开启暴力反射,应为是私有的方法
        method3.setAccessible(true);
        int sum = (int)method3.invoke(stu,10,20); //返回值是Object类，所以要转型
        System.out.println("录入数据和："+sum);

        //获取所有的成员方法
        System.out.println("---------------------");
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method); //这里还有继承了Object类的方法
        }

    }
}
