package ch08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Collections:
 *      类中的成员方法大都是静态的方法
 *      方法：
 *          max()：min():最大最小
 *          reverse()：      反转
 *          shuffle():      随机置换
 *          sort():     按照元素顺序升序排列
 */
public class TestCollections {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(4);
        list.add(5);
        list.add(2);
        list.add(4);

        System.out.println("没操作前数据："+list);

        Integer max = Collections.max(list);
        System.out.println("最大值"+max);

        Collections.sort(list);
        System.out.println("排列顺序："+list);

        Collections.reverse(list);
        System.out.println("反转后的顺序："+list);

        //对集合进行降序
        Collections.sort(list);
        Collections.reverse(list);
        System.out.println("降序后的结果："+list);

        //随机置换
        Collections.shuffle(list);
        System.out.println("随机置换的结果为："+list);
    }
}
