package ch10;

/**
 * 获得Class对象（字节码文件对象）的三种方法
 *      1、Object类的getClass()方法
 *          Class clazz = 对象名.geClass()
 *      2、类的静态属性
 *          Class clazz = 类名.class;
 *      3、Class类的静态方法：
 *          Class clazz = Class.forName(”类的正名“)
 *          正名：包名+类型
 *
 *  注意：
 *      一个源文件.java对应一个字节码文件.class
 */
public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        //1、Object类的getClass()方法
        Student stu = new Student();
        Class clazz1 = stu.getClass();

        //2、类的静态属性
        Class clazz2 = Student.class;

        //3、Class类的静态方法：
        Class clazz3 = Class.forName("ch10.Student");

        //如何验证这三个class是同一个对象？
        System.out.println(clazz1==clazz2); //true
        System.out.println(clazz3==clazz1);
    }
}
