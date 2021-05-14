/**
 * 关于循环
 */
package ch02;

public class CircualDemo {
    public static void main(String[] args) {
        for (int i = 1, c = 5; i <= 5 && c >= 1; i++, c--) {
            System.out.println("此时循环第" + i + "次");
            System.out.println(c);
        }
        int i = 1;
        while (i <= 5) {
            System.out.println("Helloworld");
            i++;
        }

        //do while必须先执行一次循环体
        i = 1;
        do {
            System.out.println(i);
            System.out.println("此时循环第" + i + "次");
            i++;
        } while (i <= 5);

        //死循环类型
        /**
         * for(;;)
         * while(true)
         */

        //带标号的循环结束
        //标号
        Lable_class: for (int a = 1; a < 4; a++) {
            for (int b = 1; b < 11; b++) {
                System.out.println("正在查找第" + a + "个班级第" + b + "个学生");
                if (a == 2 && b == 5) {
                    System.out.println("找到了");
                    break Lable_class; //结束指定的循环
                }
            }
            System.out.println();
        }

    }
}
