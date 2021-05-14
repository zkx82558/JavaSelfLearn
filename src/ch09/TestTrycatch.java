package ch09;

/**
 * 异常：
 *      分类：
 *          顶层父类：Throwable
 *          子类：Error(错误，不需要我们处理)
 *          子类：Exception(异常，我们需要处理)
 *      处理：
 *          1、try....catch(Exception e){}，处理完异常后会继续执行
 *              先执行try中语句，看是否有异常
 *              有异常，先执行catch，再finally
 *              没有异常，直接执行finally
 *          2、throws Exception交给调用者处理
 */
public class TestTrycatch {
    public static void main(String[] args){
     /*   try{
            //尝试执行的代码
            int a = 10 / 10;
            System.out.println("a:"+a);
            return;
        }catch (Exception e){
            //出现问题后的代码
            System.out.println("被除数不能为0");
            return;
        }finally {
            //finally永远执行
            System.out.println("是否执行？");
        }*/

        //方案一：main函数也去抛出异常 throws Exception，抛出给了JVM，程序不正常，就会停止运行
        //方案二，采用try...catch,结束后程序继续执行
        try{
            show();
        }catch (Exception e){
            System.out.println("代码出问题了");
        }


    }

    //定义一个方法，已经抛出了一个异常
    public static void show() throws Exception{
        int a = 10 / 0;
        System.out.println("a:"+a);
    }
}
