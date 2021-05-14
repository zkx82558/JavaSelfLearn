package ch06;
//接口

/**
 * 接口中没有变量，只有常量public static final，所以常量不能修改，所有字母大写
 * 成员方法都是public abstract void method()
 * JDK8 以后有默认方法和静态方法，可以写public static void method(),或者public default void method()
 * JDK9 以后有私有方法，private void method()
 * 接口中没有构造方法，不能实例化，也没有需要初始化的成员 public Smoking(){}错误，没有这个方法
 */
public interface Smoking {
    //成员方法 接口中的成员方法会默认加上public abstract
    public abstract void smoke();
}
