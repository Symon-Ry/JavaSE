package com.atguigu.homework.test1;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

/**
 * @author Symon
 * @version 1.0
 * @className Test
 * @description TODO
 * @date 2020/8/11 21:11
 */
public class Test {
    public static void main(String[] args) {
        Collection coll = new ArrayList();
        for (int i = 0; i < 10; i++) {
            coll.add(new String(RandomChar.ranChar()));
        }
        Iterator iterator = coll.iterator();
        while (iterator.hasNext()) {
            System.out.println("随机验证码：" + iterator.next());
        }
    }
}

class RandomChar {
    public static char[] ranChar() {
        char[] chars = new char[6];
        Random random = new Random();
        for (int i = 0; i < chars.length; i++) {
            switch (random.nextInt(3)) {
                case 0:
                    chars[i] = (char) (random.nextInt(26) + 'a');
                    break;
                case 1:
                    chars[i] = (char) (random.nextInt(26) + 'A');
                    break;
                case 2:
                    chars[i] = (char) (random.nextInt(10) + '0');
                    break;
                default:
                    break;
            }
        }

        return chars;
    }
}
