package ch06;

public class Developer {
    //成员变量
    String name;
    String work;
    //公共静态常量一般使用public final static
    public final static String DEPARTMENT_NAME = "研发部";

    public void selfInterduction(){
        System.out.println("我是"+DEPARTMENT_NAME+"的"+name+",我的工作内容是"+work);
    }

    int num1 = 10;
    static int num2 = 20;
    public static void show(){
        System.out.println(num2);//这里只能是传递num2，应为静态函数只能用静态方法
    }
}
