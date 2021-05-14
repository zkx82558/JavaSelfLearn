package ch05;

/**
 * Child:子类，派生类
 * Parent:父类，基类，超类
 */
public class Child extends Parent {
    int price = 10;
    public Child(){
        super("小黑"); //用于初始化父类成员；
        System.out.println("child的空参构造");
    }

    public void showAge() {
        int price = 5;
        System.out.println(price);
        System.out.println(this.price); //子类的变量
        System.out.println(super.price); //父类的变量
    }

    @Override //override表示方法重写,子类方法的访问权限不能小于父类的访问权限
    public int getAge() {
        return super.getAge();
    }
}
