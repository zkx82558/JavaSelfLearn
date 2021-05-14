package ch09;

import java.io.*;
import java.nio.Buffer;

/**
 * 字符缓冲流： 即使没有手动定义字符数组，底层也会按照字符数组读写
 *      分类：
 *          BufferedReader:字符缓冲输入流，也叫高效字符输入流
 *              构造方法：
 *                  public BufferedReader(Reader reader)
 *              成员方法：
 *                  public String newLine()   一次读一行数据并返回读取到的内容，读不到返回null
 *
 *
 *         BufferedWriter:字符缓冲输出流，也叫高效字符输出流
 *              构造方法：
 *                  public BufferedWriter(Writer writer)
 *              成员方法：
 *                  public void newLine();  根据当前操作系统给出对应的换行符
 *                                          window /r/n
 *                                          mac     /r
 *                                          unix    /n
 *      特点：
 *          字符缓冲流自带缓冲区，大小为8192个字符，就是16kB
 *      注意：
 *          字符流只能拷贝纯文本文件，就是.txt文件
 *
 *
 */
public class TestBuffered {
    public static void main(String[] args) throws IOException {
        //1、创建字符缓冲输入流对象，关联数据源文件
        FileReader fr = new FileReader("src/ch09/1.txt"); //用来关联数据源文件
        BufferedReader br = new BufferedReader(fr);
        //2、创建字符缓冲输出流，关联目的地对象
        FileWriter fw = new FileWriter("src/ch09/2.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        //1)方法一。字符数组读写，默认缓冲区是16KB
        int len;
        while((len = br.read()) != -1){ //底层按照字符数组去读写的,传的是数组
            bw.write(len);
        }

        //2)方法二，字符串一行一行的读写
        String str;
        while ((str = br.readLine()) != null){
            bw.write(str);
            //注意换行符
            bw.newLine(); //根据操作系统给出换行符
        }
        br.close();
        bw.close();
    }
}
