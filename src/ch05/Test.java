package ch05;

/**
 * 继承优点：
 *      1、功能复用
 *      2、便于扩展新功能
 *      3、结构清晰，简化认识
 *      4、易维护性
 * 缺点：
 *      1、打破了封装性
 *      2、高耦合性，多个模块会互相依赖
 * （程序设计的追求：低耦合高内聚）
 *
 * java中使用变量的原则：
 *      遵循就近原则，局部位置有就有；
 *      没有区本类成员位置找；
 *      再去父类的成员位置找
 *
 * 调用父类的方法：super.()
 * 子类重写方法就是直接覆盖掉父类的方法(就是说方法名，参数列表，返回值类型都一样)
 * 子类所有构造方法第一行都有默认super()，用来访问父类的无参构造
 *
 * private只能在本类使用：强调给自己使用
 * 默认可以在本类、本包其他类使用：强调给同包类使用
 * protected可以在本类，本包，不同包下的子类son使用：强调给子类使用
 * public本类，本包，子类，不同包下的其他类：强调所有类使用
 *
 *               重载Overload             重写Override
 * 方法名：         相同                      相同
 * 参数列表：      不同(个数或对应位置类型)       相同
 * 返回值类型：      无关                      相同
 * 修饰符：         无关                  访问权限不能小于被重写方法
 * 定义位置：       同一个类                  子父类中
 *
 * Java继承的特点：
 *      1、只支持类单继承，但可以多重继承，支持接口的多继承：A extends 接口B，接口C
 *      2、父类的私有成员不能继承
 *      3、构造方法不能继承，只能初始化本类对象
 */

public class Test {
    //main函数是程序的主入口
    public static void main(String[] args) {
        Child c = new Child();
        c.setName("zhou");
        System.out.println(c.getName());
        c.showAge();
        /*
        Java中，子类只能继承父类的非私有成员:包括变量和方法
         */
    }
}
