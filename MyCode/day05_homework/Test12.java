package cn.atguigu.day05homework;

import java.util.Random;

/**
 * @author Symon
 */
public class Test12 {
    public static String getRandomString(int length){
        Random random=new Random();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<length;i++){
            int number=random.nextInt(3);
            long result=0;
            switch(number){
                case 0:
                    result=Math.round(Math.random()*25+65);
                    sb.append((char)result);
                    break;
                case 1:
                    result=Math.round(Math.random()*25+97);
                    sb.append((char)result);
                    break;
                case 2:
                    sb.append(new Random().nextInt(10));
                    break;
            }

        }
        return sb.toString();
    }
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("随机验证码："+getRandomString(6));
        }
    }
}
