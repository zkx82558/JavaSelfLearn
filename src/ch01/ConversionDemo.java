/**
 * 数据转换
 * 隐式转换：
 *      小转大的关系
 *      范围大小如下：byte,short,char计算直接转换为int(默认)，>long>float>double
 *      布尔类型不参与比较
 *
 * 强制类型转换：大转小的关系
 *      目标类型：变量名=（目标类型）更换的值
 */
package ch01;

public class ConversionDemo {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println(a+b);

        int aa=10;
        short bb=20;
        //不可以用Byte接收数据：byte cc=aa+bb;
        byte cc=(byte)(aa+bb); //强制类型转换
        System.out.println(cc);

        double d1=3.14;
        int a1=(int)d1;
        System.out.println(a1); //3 注意精度的缺损

    }
}
