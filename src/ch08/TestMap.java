package ch08;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Map集合：
 *      双列集合：元素由键值对的方式
 *      key--value
 *      注意：
 *          key（键）不能重复，value(值)可以重复
 *      应用：
 *          Map<T1,T2> map = new HashMap<>()
 *      成员方法：
 *          V.put(Key,Value):   添加元素
 *                              元素i第一次添加返回null
 *                              重复添加，会用新值覆盖旧值，并返回旧值
 *
 * 遍历集合：不能直接遍历集合，要先转换成单列
 *          1、获取多有键的集合： keySet()
 *          2、遍历所有的键，获得每一个键：    迭代器或增强for
 *          3、根据键获得指定值          get()
 */
public class TestMap {
    public static void main(String[] args) {
        Map<Integer,Student> map = new HashMap<>();

        Student s1 = new Student("乔峰",41);
        Student s2 = new Student("拜拜",38);
        Student s3 = new Student("虚竹",38);
        Student s4 = new Student("乔峰",41);

        //添加到集合内部
        Student stu1 = map.put(1, s1);
        System.out.println("stu1:"+stu1); //null

        Student stu2 = map.put(1, s2);
        System.out.println("stu2:"+stu2); //返回旧值，之前添加的

        //实际添加的时候：
        map.put(1,s1);
        map.put(2,s2);
        map.put(3,s3);
        map.put(4,s4);

        System.out.println(map);

        //根据键获得值：
        Student stu3 = map.get(2);
        System.out.println("key:"+2+",value:"+stu3);
        System.out.println("-----------------------------");

        //遍历集合：不能直接遍历集合，要先转换成单列
        //迭代器方式实现
        Set<Integer> keys = map.keySet(); //应为所有的key是不可重复的，所以用set集合做接收
        Iterator<Integer> it = keys.iterator();
        while (it.hasNext()){
            Integer key = it.next();
            Student value = map.get(key);
            System.out.println("key:"+key+",value:"+value);
        }
        System.out.println("-----------------------------");

        //增强for实现
        Set<Integer> keys1 = map.keySet();
        for (Integer key : keys1) {
            //key就是双列结合中的每一个键
            Student value = map.get(key);
            System.out.println("key:"+key+",value:"+value);
        }
    }
}
