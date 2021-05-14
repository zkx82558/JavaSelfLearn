package ch08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * 集合：
 *      用来存储多个元素的容器，
 * 集合和数组区别：
 *      元素类型
 *          集合：引用类型（存储基本类型时候自动装箱）
 *          数组：基本类型，引用类型
 *      元素个数：
 *          集合：不固定，可任意扩容
 *          数组：长度固定，不能改变容量
 *      集合的好处：
 *          长度不受限制
 *          提供了大量操作元素的方法
 *
 * Java集合体系：都是接口
 *      单列集合（collection）:
 *          List:ArrayList()
 *          Set: HashSet()
 *      双列集合：(Map)
 *          Map:HashMap()
 *
 * List:
 *      List list = new ArrayList();
 *      可存取重复元素，有序(存取顺序相同) List list = new ArrayList()
 * 使用集合的步骤：
 *      1、创建集合对象
 *      2、创建元素对象
 *      3、将元素对下个添加到集合对象中
 *      4、遍历集合
 *
 * 增强for:
 *      增强for循环：快捷键iter-回车
 *      注意：增强for的底层依赖迭代器
 *
 * 通过迭代器：
 *      对过程重复成为迭代
 *      使用步骤：
 *          1、通过集合对象获取对象的迭代器对象
 *          2、判断迭代器是否有对象
 *          3、如果有就获取元素
 *      列表迭代器，可以对集合遍历的同时进行删除增加的功能,但要使用列表迭代器中的方法，普通迭代器不可以
 *      普通迭代器：Iterator it = list3.iterator();
 *      列表迭代器：ListIterator it = list3.listIterator();
 */
public class TestListForIterator {
    public static void main(String[] args) {
        //1、创建集合对象
        List list = new ArrayList();

        //2、创建元素对象
        Student s1 = new Student("乔峰",41);
        Student s2 = new Student("乔峰",41);
        Student s3 = new Student("拜拜",38);

        //3、将元素对下个添加到集合对象中
        //boolean b1 = list.add(s1); //添加成功就是ture
        list.add(s1);
        list.add(s2);
        list.add(s3);
        //直接打印
        System.out.println(list);
        //获得索引元素
        Object obj = list.get(2);
        System.out.println(obj);
        //获取集合元素个数
        System.out.println("集合长度："+list.size());

        //4、遍历集合
        //1、普通循环
        for (int i = 0; i < list.size(); i++) {
            Object obj2 = list.get(i);
            System.out.println("索引为"+i+"的元素是："+obj2);
        }

        List list1 = new ArrayList();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(50);
        //2、增强for循环：快捷键iter-回车
        for(Object obj2:list1){
            //obj是集合中的元素,但其本身应该是Integer类型的数据
            Integer ii = (Integer)obj2;
            System.out.println(ii);
            //System.out.println(obj2);
        }

        //3、迭代器实现
        List list3 = new ArrayList();
        list3.add("a");
        list3.add("b");
        list3.add("c");
        //1)通过集合对象获取对象的迭代器对象
        Iterator it = list1.iterator(); //普通股迭代器
        ListIterator lit = list3.listIterator(); //列表迭代器
        //2)判断迭代器是否有元素
        while(lit.hasNext()){  //如果有元素就一直迭代
            //3)如果有就获取元
            //Object obj3 = it.next();
            //或者也可以向下转型
            String s = (String)lit.next();
            //System.out.println(s);
            //需求：判断如果集合中有b，就在后面添加Java
            if("b".equals(s)){  //一般常量放在前面，应为如果s是null就会有空指针异常
                //list.add("java");//不能这样，一边删除，一边遍历元素，所以要用列表迭代器
                lit.add("Java");
            }
            System.out.println(s);
        }
        System.out.println(list3); //[a, b, Java, c]




    }
}
