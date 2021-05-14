package ch08;

import java.util.*;

public class SendPokerTest {
    public static void main(String[] args) {
        //1、买牌
        //1.1定义一个双列集合，键：表示牌的编号，规则：编号越小，牌越小
        Map<Integer,String> pokers = new HashMap<>();
        //1.2定义一个单列集合,存取所有的牌的编号
        List<Integer> list = new ArrayList();
        //1.3具体的买牌动作
        //普通牌
        String[] colors = {"♠","♥","♣","♦"};
        String[] numbers = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        int num = 0; //表示牌编号
        //循环嵌套
        for (String number : numbers) { //点数
            for (String color : colors) {//花色
                String poker = color+number;
                //将牌的编号，具体的牌放到双列集合中
                pokers.put(num,poker);
                //将牌的编号放到单列集合中
                list.add(num);
                num++;
            }
        }
        //大小王
        pokers.put(num,"小王");
        list.add(num++);//先操作再自增
        pokers.put(num,"大王");
        list.add(num);
        System.out.println("所有的牌:"+pokers);
        System.out.println("所有序号："+list);


        //2、洗牌
        Collections.shuffle(list);
        System.out.println("洗好牌后："+list);

        //发牌
        //3.1定义四个集合，分别表示3个玩家和底牌
        List<Integer> zhou = new ArrayList<>();
        List<Integer> bai = new ArrayList<>();
        List<Integer> sisi = new ArrayList<>();
        List<Integer> dipai = new ArrayList<>();
        //3.2将索引和3取模，决定发给谁
        for (int i = 0; i < list.size(); i++) {
            Integer pokerNum = list.get(i);
            if(i>=list.size()-3){
                //底牌
                dipai.add(pokerNum);
            }else if(i % 3 ==0){
                zhou.add(pokerNum);
            }else if(i % 3 ==1){
                bai.add(pokerNum);
            }else if(i % 3 ==2){
                sisi.add(pokerNum);
            }
        }

        //3.3查看玩家底牌

        /*
            4、定义一个方法用来看牌
            方法名：printPoker
            参数列表：List<Integer>,Map
            返回值：String
        */
        System.out.println("zhou:"+printPoker(zhou, pokers));
        System.out.println("bai:"+printPoker(bai, pokers));
        System.out.println("sisi:"+printPoker(sisi, pokers));
        System.out.println("dipai:"+printPoker(dipai, pokers));

    }
    public static String printPoker(List<Integer> nums, Map<Integer,String> pokers){
        //1、对牌编号升序
        Collections.sort(nums);
        //2、遍历集合，获得每一个编号
        StringBuilder sb = new StringBuilder();
        for (Integer num : nums) {
            //3、拿到具体的牌
            String poker = pokers.get(num);
            sb.append(poker+" ");
        }
        String str = sb.toString();
        return str.trim();
    }
}
