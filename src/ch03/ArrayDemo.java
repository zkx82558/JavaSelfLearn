package ch03;

/**
 * 数组的定义：
 *      1、数据类型[] 数组名 = new 数据类型[长度]； 动态初始化：指定长度，由系统给出默认值
 *      2、数据类型[] 数组名 = new 数据类型[]{值1，值2，值3，，，}； 静态初始化给出初始化值，系统决定长度
 *      3、数据类型[] 数组名 = {值1，值2，值3，，，}；
 *
 * 注意：
 *      1、arr.length
 *      2、直接输出数组，得到的是数组的内存地址值，再指向空间中的对象数组
 *      3、变量名(int[] arr)再栈中，new int[5]在堆中开辟空间(有一个地址值)
 *      4、数组类型属于引用类型
 *
 * 异常：
 *      1、数组索引越界异常
 *      2、空指针异常 比如arr1=null
 *
 * 结论：
 *      1、基本类型的变量作为参数传递，传递的是值，比如int a
 *      2、引用类型作为参数，传递的是地址值，比如数组 int[] arr
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr1 = new int[3]; //
        int[] arr2 = new int[]{1, 2, 3}; //具体存储的数字是1，2，3
        int[] arr3 = {1, 2, 3};

        System.out.println(arr3[2]);

        //将数组中第一个元素的值改为10，然后输出
        arr3[0] = 10;
        System.out.println(arr3[0]);

        //定义一个长度为5的int元素，前三个为1，2，3，通过for循环打印数字中的元素
        int[] arr4 = new int[5];
        arr4[0] = 1;
        arr4[1] = 2;
        arr4[2] = 3;

        System.out.println(arr4); //直接输出数组，得到的是数组的内存地址值
        for(int i=0;i<arr4.length;i++){
            System.out.println(arr4[i]);
        }

        int[] arr5=arr4; //这里表示两个数组共用一份堆内存地址
        arr5[0]=100;
        System.out.println(arr4[0]);

        //找出最大值
        int[] arr6={1,2,3,4,5,7,5};
        int temp=arr6[0];
        for(int i=0;i<arr6.length;i++){
            if(arr6[i]>temp){
                temp=arr6[i];
            }
        }
        System.out.println("最大值为："+temp);

        printArray(arr6);//传递的是地址值

    }
    //关于数组的函数
    public static void printArray(int[] arr){ //引用类型作为形参是地址值，是把地址传递过去了
        for(int i=0;i<arr.length;i++){        //但如果这里传递的是int a,int b,那么只是传递的是值，并不是地址，那么在函数中改变本来的值也不会变
            System.out.println(arr[i]);
        }
    }
}
