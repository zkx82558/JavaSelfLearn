package ch04;

/**
 * 定义一个手机类
 * 构造方法：
 *      new开辟空间，通过构造器初始化
 *      要求：
 *          1、方法名与类名相同
 *          2、没有返回值，但可以写return
 *          3、没有返回值类型，void也无
 *       注意：
 *          1、未提供构造方法，系统默认无参构造
 *          2、若已经提供任何构造方法，系统不再提供无参构造
 *          3、构造方法可以重载
 */
public class Phone {
    //构造方法,没有返回值，但可以写return
    //无参构造
    public Phone(){ }

    //带参构造
    public Phone(String name,int age){
        this.name = name;
        this.age = age;
    }

    //成员变量：
    String brand;
    String model;
    private String name;
    private int age;

    public void call() {
        String name = "小黑";//局部变量
        System.out.println("给" + name + "打电话");
    }

    public void sendMessage() {
        System.out.println("发短信");
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    //提供公共的访问方式，分别数值值和获取值
    public void setAge(int age) {
        //这里一般不用，从前端传递过来的代码大多已经校验过的合法数据
        /*if (a > 200 || a < 0) {
            age = 1;
        }*/
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void study() {
        System.out.println(this.name + "正在学习");
    }

    public void show() {
        int age = 10;
        System.out.println(age); //10
        System.out.println(this.age);//23
    }
}
