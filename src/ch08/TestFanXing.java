package ch08;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型：
 *      泛指任意类型，又叫做参数化类型，对具体函数起到辅助作用，集合里面只能是一种类型元素
 *
 * 好处：
 *      类型安全
 *      避免了类型转换
 *
 * 总结:
 *      泛型只和集合类使用
 *      JDK5后才有泛型
 *      List<String> list2 = new ArrayList<>(); JDK7后不用在后面写<>String<>
 */
public class TestFanXing {
    public static void main(String[] args) {
        List list1 = new ArrayList();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        //list1.add(10);//会包类型转化异常

        for (Object obj : list1) {
            String s = (String) obj;
            System.out.println(s);
        }

        //泛型，让代码更加安全，里面只能添加String类型
        //List<String> list2 = new ArrayList<String>();
        List<String> list2 = new ArrayList<>();
        list2.add("abc");
        list2.add("bcd");
        list2.add("acd");
        //list2.add(10);
        for (String s : list2) {
            System.out.println(s);
        }
    }
}
