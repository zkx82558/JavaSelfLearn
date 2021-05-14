package ch07;

import java.util.Calendar;
import java.util.Date;

public class TestDateCalendar {
    public static void main(String[] args) {
        //日期,去当前默认事件
        Date date1 = new Date();
        System.out.println(date1);

        //获取毫秒值
        long time = date1.getTime();
        System.out.println("time:"+time);

        //创建一个指定时间 Date(long)
        Date date2 = new Date(1618040141852L);
        System.out.println("date2:"+date2);

        //Calendar类，是一个抽象类，不能new，日历类
        Calendar c = Calendar.getInstance();//获得当前环境的日历对象
        System.out.println(c);

        //获得年月日
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH); //Java中使用0-11表示月份，所以对应1-12月
        int date = c.get(Calendar.DATE);
        System.out.println(
                year+"年"+(month+1)+"月"+date+"日"
        );

        //设置指定时间为2022.2.2
        c.set(Calendar.YEAR,2022);
        c.set(Calendar.MONTH,1);
        //或者直接设定
        c.set(2022,1,2);
        System.out.println(
                year+"年"+(month+1)+"月"+date+"日"
        );
    }
}
