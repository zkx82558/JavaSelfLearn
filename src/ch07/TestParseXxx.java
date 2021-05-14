package ch07;

/**
 * 包装类：
 *      基本类型对应的包装类（引用类型），八种基本类型
 *      int     Integer()
 *      char    Character()
 *      byte    Byte()
 *      long    Long()
 *      short   Short()
 *      float   Float()
 *      double  Double()
 *      boolean Boolean()
 *
 * 装箱：基本类型抓换为包装类(引用类型)
 * 拆箱：将包装类型转换为基本类型
 *
 * 成员方法：
 *      static 基本类型  parseXxx(String)
 *      static int parseInt(String)         字符串转化为整数
 *      注意除了Character之外，其他都有parseXxx方法
 *      如果字符串转换成char类型数据可以通过：String类中的toCharArray(),charAt();
 */
public class TestParseXxx {
    public static void main(String[] args) {
        int a = 10;
        //将基本类型的数据转化成引用类型，装箱
        Integer i1 = new Integer(a);
        int b = i1.intValue(); //拆箱，引用数据变成基本类型

        //Jdk5具有自动拆装箱
        Integer i2 = 30; //对应装箱
        int c = i2;  //对应拆箱

        //需求：将字符串类型的10转换成int的10
        String s = "10";
        int num = Integer.parseInt(s);
        System.out.println(num);
    }
}
