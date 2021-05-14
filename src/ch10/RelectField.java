package ch10;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * Class类： 类变量
 *      成员方法：
 *          public Field getField(String name)  返回一个Field对象，仅公共成员变量
 *          public Field getDeclaredField(String name)  返回Field对象，可获得私有成员变量
 *          public Field[] getDeclaredFields()  返回此类所有包括私有的成员变量的数组
 *
 *      成员方法：
 *          public void setAccessible(boolean flag)      开启暴力反射，私有方法，flag=true
 *          public void set(Object obj,Object value)     指定obj对象的指定属性值为value
 */
public class RelectField {
    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("ch10.Student");
        Constructor con = clazz.getConstructor();
        Student stu = (Student) clazz.getConstructor().newInstance();

        //设置姓名
        Field field1 = clazz.getField("name");
        field1.set(stu,"张三");
        //设置年龄
        Field field2 = clazz.getDeclaredField("age");
        //暴力反射
        field2.setAccessible(true);
        field2.set(stu,30);

        System.out.println(stu);
    }
}
