package ch07;

/**
 * StringBuilder/StringBuffer
 *  内部中使用自动扩容的数组操作祖父穿数据
 *  String不可变，StringBuilder可以拼接
 */
public class TestStringBuilder {
    public static void main(String[] args) {

        //构造方法
        StringBuilder sb = new StringBuilder();

        //注意sb和sb2是同一个对象，返回的是自生，一般使用sb.append()
        StringBuilder sb2 = sb.append("abc");
        System.out.println(sb);
        System.out.println(sb2);

        //将String类型的“abc”转换成StringBuilder对象
        StringBuilder sb3 = new StringBuilder("abc");
        System.out.println(sb3); //abc

        //测试成员方法
        //将三个字符串拼接成一个字符串
        StringBuilder sb4 = new StringBuilder();
        sb4.append("学Java");
        sb4.append("好烦啊");
        System.out.println(sb4);
        String s = sb4.toString(); //调用toString变成String类
        System.out.println(s);
    }
}
