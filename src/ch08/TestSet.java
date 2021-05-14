package ch08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Set集合：
 *      不可重复，无序(跟加入的先后顺序无关)，
 *      注意：
 *          set保证唯一性依赖于equals()和hashCode()
 */
public class TestSet {
    public static void main(String[] args) {
        //往set中添加5个学生对象
        Set<Student> set = new HashSet<>();

        Student s1 = new Student("乔峰",41);
        Student s2 = new Student("乔峰",41);
        Student s3 = new Student("拜拜",38);
        Student s4 = new Student("虚竹",38);

        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);

        System.out.println(set);
        /*
        为什么set没有去重？
            应为set集合保证元素唯一性依赖equals()和hashCode(),
            所以默认调用object()类的方法，比较的是地址值是否相同，而这些元素地址值不一样，所以没有去重
        解决方法：
            所以需要在类中重写这两个方法
         */

        //通过迭代器遍历集合
        Iterator<Student> it = set.iterator();
        while (it.hasNext()){
            Student s = it.next();
            System.out.println(s);
        }

        //增强for实现
        for (Student student : set) {
            System.out.println(student);

        }
    }
}
