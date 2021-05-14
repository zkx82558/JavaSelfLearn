package ch06;

/**
 * 本章有抽象类，多态
 * 多态模拟:  Animal an = new Dog();
 *      成员方法：编译看左(左边类型有没有这个成员,有程序就不报错)，
 *              运行看右(运行时具体用的时右边类中的该成员，子类中重写的方法)
 *      1、要有继承（或者实现,类和接口的关系）关系
 *      2、要有方法重写
 *      3、要有父类引用指向子类对象 is a关系
 *
 * 使用场景：
 *      父类型可以作为形参的数据类型，可以接受任意的子类对象 Animal an
 *
 * 成员变量：多态关系中成员变量是不涉及重写的；
 *          简单记忆：多态关系中使用成员变量，编译看左，运行看左
 *
 * 多态好处：
 *      1、可维护性
 *      2、可扩展性
 * 弊端：不能使用子类特有成员（如果要用，要类型转换）
 * 类型转换：
 *      1、向上转型：子类型准换成父类：Animal animal = new Dog()
 *      2、向下转型：父类姓转化成子类型：Dog dog = (Dog)animal
 *      注意事项：1、只能继承层次内进行转换
 *              2、父类转化为子类前，使用instanceof
 */
public class Test {
    public static void main(String[] args) {
        //Animal an = new Dog();  //Dog is an animal
        Dog d = new Dog();
        d.setName("哈士奇");
        //d.eat();//子类的成员方法被重写了，
        showAnimal(d);

        Mouse m = new Mouse();
        m.setName("老鼠");
        showAnimal(m);

        //多态方式测试对象
        Animal an = new Dog();
        System.out.println(an.othername); //Animal
        //普通方式创建对象
        System.out.println(d.othername);//Dog

        an.eat();
        //子类独有方法watch(),将an转化为Dog
        /*Dog dog = (Dog)an;
        dog.watch();*/
        //优化后方法
        if(an instanceof Dog){ //只有当an是Dog时候，才可以进行后续操作
            Dog dog = (Dog)an;
            dog.watch();
        }
        //抽象类不能实例化
        //Animal animal = new Animal(); 错误
        //        an.AGE=20; 错误常量值不能改变
        System.out.println(an.AGE);
    }

    //
    public static void showAnimal(Animal an){
        an.eat();
    }
}
