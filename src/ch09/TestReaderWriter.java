package ch09;

import java.io.*;

/**
 * reader.read():
 *      读取数据,如果文件中的内容读完了就返回-1
 *      int read();             读一个字符，返回该字符的ASCII码的值，读不到返回-1
 *      int read(char[] chs):   一次读一个字符数组，将读取到的内容存入到数组中
 *                              并返回读取到的有效字符数，读不到返回-1
 *
 * 字符流写数据：
 *      Writer类中的方法：
 *          void write(int ch)                          一次写一个字符
 *          void write(char[] chs,int index,int len)    一次写一个指定的字符数组
 *          void write(String str)                      一次写一个字符串
 *      FileWriter类的构造方法
 *          public FileWriter(String pathname)
 *
 * 拷贝：
 *      如果目的地文件不存在，可以自动创建
 */
public class TestReaderWriter {
    public static void main(String[] args) throws IOException {
        //通过字符流读取数据
        //1、创建字符输入流对象
        Reader reader = new FileReader("src/ch09/1.txt");
        //2、读取数据,如果文件中的内容读完了就返回-1
        int ch1 = reader.read();
        System.out.println(ch1);
        //优化方法：用循环改进
        int ch;
        while((ch = reader.read())!=-1){
            System.out.println(ch);
        }
        //3、释放数据
        reader.close();


        System.out.println("-----------------------------");
        //需求：通过字符流读取文件,一次读取一个字符数组
        Reader reader1 = new FileReader("src/ch09/1.txt");
        char[] chs = new char[3];
        /*int len1 = reader1.read(chs);
        System.out.println(chs); //a,b,c,自动将字符拼接成字符串，这里是覆盖，如果只剩下一个d，这里d就覆盖掉a，变成d,b,c,len就变成了1
        System.out.println(len1); //3*/
        //定义变量，记录读取到的有效字符数
        int len;
        while((len=reader1.read(chs)) != -1){
            //将读取到的内容转换成字符串，然后打印
            /*
            * chs表示操作的数组
            * 0，表示起始索引
            * len:表示操作的字符个数
            * */
            String s = new String(chs,0,len);
            System.out.println(s);
        }
        reader1.close();



        //writer()
        //需求：通过字符流写数据
        System.out.println("-------------------------");
        Writer writer = new FileWriter("src/ch09/2.txt");
        //2、写数据
        //1、一次写一个数字
        //writer.write("好");
        //2、一次写一个指定的字符数组
        /*char[] chs1 = {'黑','白','灰'};
        writer.write(chs1,0,2);*/
        //3、一次写一个字符串
        writer.write("大家好");
        writer.close();


        //拷贝文件里的字符
        /*
        I/O流拷贝文件核心6步：
            1、创建字符输入流对象，关联数据源文件
            2、创建字符输出流对象，关联目的地文件
            3、定义变量，记录读取到的内容
            4、循环读取，满足条件就一直读，并将读取到的内容赋值给变量
            5、将读取到的数据写入到目的地问家中
            6、释放资源
         */
        FileReader fr = new FileReader("src/ch09/1.txt");
        FileWriter fw = new FileWriter("src/ch09/2.txt"); //如果目的地文件不存在，可以自动创建
        int lenCopy;
        //1、方法一，一个一个字符拷贝
        /*while((lenCopy = fr.read())!=-1){
            fw.write(lenCopy);
        }*/
        //2、一次读写一个字符数组
        char[] chs1 = new char[1024];
        while ((lenCopy = fr.read(chs1)) != -1){
            fw.write(chs1,0,lenCopy);
        }
        fr.close();
        fw.close();
    }
}
