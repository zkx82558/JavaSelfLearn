package ch06;
//smoking的实现类
public class SmokingClass implements Smoking {

    @Override
    public void smoke() {
        System.out.println("抽烟有害健康");
    }
}
