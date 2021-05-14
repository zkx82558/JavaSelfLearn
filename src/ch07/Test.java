package ch07;

/**
 * 注意：
 *      java.lang下的类可以直接使用，不用导包
 */
public class Test {
    public static void main(String[] args) {
        //非静态方法的调用方式，通过对象名.的形式调用
        Object obj1 = new Object();
        Object obj2 = new Object();

        //测试方法
        //int hashcode(),返回对象哈希码,不同对象哈希码一般不同，是根据地址值计算出来的结果
        int code1 = obj1.hashCode();
        int code2 = obj2.hashCode();
        System.out.println(code1);
        System.out.println(code2);

        //class getClass(),返回调用者的字节码文件对象,一个类只有一个字节码文件对象
        Class clazz1 = obj1.getClass();
        Class clazz2 = obj2.getClass();
        System.out.println(clazz1);
        System.out.println(clazz2);//class java.lang.Object

        //String toString() 默认打印的是地址值，不同对象的地址值不同
        //                  地址值的组成：对象类的名称(全类名)+@+哈希码无符号十六进制
        String s2 = obj2.toString();
        String s1 = obj1.toString();
        System.out.println(s1);
        System.out.println(s2);//java.lang.Object@1540e19d,

        //boolean equals(),默认比较的是地址值，无意义，子类都会重写这个方法
        boolean b1 = obj1.equals(obj2);
        System.out.println(b1);

        Student student = new Student(1,"周",66);
        System.out.println(student); //直接输出就是默认调用toString方法
        Student student1 = new Student(1,"周",66);
        //判断
        boolean adjust = student.equals(student1);
        System.out.println(adjust);


    }
}
