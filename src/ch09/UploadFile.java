package ch09;

import java.io.*;
import java.util.Scanner;

/**
 * 模拟上传用户头像
 */
public class UploadFile {
    public static void main(String[] args) throws IOException {
        //1、定义一个方法，获得上传用户头像的路径
        File path = getPath();
        //2、判断头像是否已经讯在
        boolean flag = isExists(path.getName());
        if(flag){
            System.out.println("该用户头像已经存在，上传失败");
        }else{
            //3、上传头像
            uploadFile(path);
        }

    }



    /**
     * 用来获得上传的用户头像的路径
     * @return 路径
     */
    public static File getPath(){
        //1、提示用户录入要上传的用户头像路径
        Scanner sc = new Scanner(System.in);
        while(true){          //7、因为不知道用户录入多少次正确，while改进
            System.out.println("请输入上传的文件路径");
            String path = sc.nextLine();

            //2、判断该路径的后缀，.jpg,.png,.bmp
            //3、如果不是，就提示：您录入的不是图片，请重新录入
            if(!path.endsWith(".jpg") && !path.endsWith(".png") &&!path.endsWith(".bmp")){
                System.out.println("您录入的不是图片，请重新录入");
                continue;
            }

            //4、如果是就执行，判断路径是否存在，并且是否是文件
            File file = new File(path);
            if(file.exists() && file.isFile()){ //不存在且不是文件
                //6、如果是，就是想要的数据（图片文件），直接返回
                return file;
            }else{
                //5、如果不是，就提示：路径不合法
                System.out.println("输入路径不合法");
            }
        }




    }

    //看文件是否存在
    public static boolean isExists(String path){
        File file = new File("src/ch09");
        String[] names = file.list();

        for (String name : names) {
            if(name.equals(path)){
                return true;
            }
        }
        return false;
    }

    //上传具体的用户头像
    public static void uploadFile(File path) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/ch09/"+path.getName()));

        int len;
        while ((len = bis.read()) != -1){
            bos.write(len);
        }
        bis.close();
        bos.close();

        System.out.println("上传完毕");
    }
}
