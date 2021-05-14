package ch09;

import java.io.File;
import java.io.IOException;

/**
 * I/O：输入输出流，Java中传输数据的方式
 * 输入流：读数据，读取数据从文件输入到内存；
 * 输出流：写数据，从内存输出到文件
 *
 * 操作方式：
 *      字节流：以字节为单位,图片
 *          InputStream：字节输入流的顶层抽象类
 *                  FileInputStream(普通的),
 *                  BufferedInputStream(高效的字节输入流) 也叫缓冲字节输入流
 *          OutputStream:字节输出流的顶层抽象类
 *                  FileOutputStream,
 *                  BufferedOutputStream 缓冲字节输出流
 *      字符流：抽象类，要用子类，以字符为单位，文档
 *          Reader：字符输入流的顶层抽象类
 *                  FileReader, 普通字符输入流
 *                  BufferedReader 字符缓冲输出流
 *          Writer：字符输出流的顶层抽象类
 *                  FileWriter(普通的),
 *                  BufferedWriter(高效的)
 *
 * 绝对路径：写死的路径 getAbsolutePath()
 * 相对路径：相对于当前项目的路径来讲 getPath()
 */
public class TestIOFile {
    public static void main(String[] args) throws IOException {
        //1、需求：将E:\my_idea_java\test\src\ch09\1.txt封装成对象
        //方式一
        //File file1 = new File("E:\\my_idea_java\\test\\src\\ch09\\1.txt");
        File file1 = new File("E:/my_idea_java/test/src/ch09/1.txt");
        System.out.println("file1:"+file1);
        //方式二，根据字符串形式的父目录以及子目录创建File对象
        File file2 = new File("E:/my_idea_java/test/src/ch09/","1.txt");

        //方式三，根据父目录对象，以及字符串形式的子目录来获得File对象
        File file3 = new File("E:/my_idea_java/test/src/ch09/");
        File file4 = new File("file3","1.txt");
        System.out.println(file4);


        //2、创建目录，如果不存在就创建，返回true,否则有就返回False
        File file5 = new File("E:/my_idea_java/test/src/ch09/2.txt");
        boolean flag1 = file5.createNewFile(); //这里创建时候需要抛出异常
        System.out.println("flag1:"+flag1);

        //创建a文件夹,创建单级目录
        File file6 = new File("E:/my_idea_java/test/src/ch09/a");
        boolean mkdir = file6.mkdir();  //make directory
        System.out.println("mkdir:"+mkdir);

        //创建多级文件夹,也可以创建单级目录
        File file7 = new File("E:/my_idea_java/test/src/ch09/a/b/c");
        boolean mkdirs = file7.mkdirs();
        System.out.println("mkdirs:"+mkdirs);


        //3、测试判断功能
        File file8 = new File("E:/my_idea_java/test/src/ch09/a/b");
        System.out.println("测试是否是文件夹："+file8.isDirectory());
        System.out.println("测试是否是文件："+file8.isFile());
        System.out.println("测试是否是存在："+file8.exists());


        //4、
        File file9 = new File("ch09/1.txt");
        String path1 = file9.getAbsolutePath();
        System.out.println("绝对路径："+path1); //E:\my_idea_java\test\ch09\1.txt
        String path2 = file9.getPath();
        System.out.println("相对路径："+path2); //ch09\1.txt
        //获得文件名
        String name = file9.getName();
        System.out.println("文件名："+name);

        //获得指定目录下所有文件(夹)名称数组；名称数组String[],file10.list()
        File file10 = new File("src/ch09");
        String[] names = file10.list();
        for (String s : names) {
            System.out.println(s);
        }
        System.out.println("--------------------------------");

        //获得所有的File对象数组，File[],file10.listFiles(),可以调用file对象的方法
        File[] files = file10.listFiles();
        for (File file : files) {
            System.out.println(file);
        }

    }
}
