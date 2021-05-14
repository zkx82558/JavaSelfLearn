package ch09;

import java.io.*;

/**
 *
 * InputStream：字节输入流的顶层抽象类
 *                  FileInputStream(普通的),
 *                  BufferedInputStream(高效的字节输入流) 也叫缓冲字节输入流
 * OutputStream:字节输出流的顶层抽象类
 *                  FileOutputStream,
 *                  BufferedOutputStream 缓冲字节输出流
 * 字节流： 关于图片
 *      FileInputStream:    普通的字节输入流，用来读取数据
 *          构造方法：
 *              public FileInputStream(String pathname);
 *           成员方法：
 *              public int read(); 一次读取一个字节，返回独到的内容，读不到返回-1
 *              public int read(byte[] bys):    一次读取一个字节数组，独到的内容存在数组内，
 *                                              返回读取到的有效字节数，读不到返回1
 *      FileOutputStream:   普通的字节输出流，写数据
 *          构造方法：
 *              public FileOutputStream(String pathname);
 *          成员方法：
 *              public void write(int len); 一次写入一个字节
 *              public void write(byte[] bys, int index, int len)   一次写入一个指定的字节数组
 *
 *
 *       BufferedInputStream:字节缓冲输入流，高效字节输入流
 *           构造方法：
 *              public BufferedInputStream(InputStream is)
 *           成员方法：
 *              public int read()   一次读取一个字节，并返回读取内容，读不到返回-1
 *      BufferedOutputStream
 *           构造方法
 *              public BufferedOutputStream(OutputStream os)
 *           成员方法：
 *              public void write(int len) 一次写入一个字节
 *
 *      特点：
 *          字符缓冲流有字节的缓冲区，8192个字节，8KB
 *
 *      总结：
 *          拷贝纯文本文件用字符流，拷贝其他如图片，音频，视频用字节流
 */
public class TestStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src/ch09/a.jpg");
        FileOutputStream fos = new FileOutputStream("src/ch09/b.jpg");

        int len; //记录读取到的数据
        byte[] bys = new byte[1024]; //最好写1024整数倍
       /* while((len = fis.read()) != -1){
            fos.write(len);
        }*/

        while((len = fis.read(bys)) != -1){
            fos.write(bys,0,len); //bys操作的数组，len,有效字节数，0起始
        }
        fis.close();
        fos.close();



        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/ch09/a.jpg"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/ch09/b.jpg"));

        int len1;
        while ((len1 = bis.read(bys)) != -1){
            bos.write(len1);
        }
        bos.close();
        bis.close();
    }
}
