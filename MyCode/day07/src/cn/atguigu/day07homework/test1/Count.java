package cn.atguigu.day07homework.test1;

public class Count {
    public long sum(int... nums) {
        int sums = 0;
        for (int i = 0; i < nums.length; i++) {
            sums += nums[i];
        }
        return sums;
    }

    public int max(int... others) {
        int imax = others[0];
        for (int i = 1; i < others.length; i++) {
            if (others[i] > imax) {
                imax = others[i];
            }
        }
        return imax;
    }

    public String concat(String... strings) {
        String iStrings="";
        for (int i = 0; i < strings.length; i++) {
            iStrings += strings[i];
        }
        return iStrings;
    }

    public boolean isEven(int... nums) {
        boolean flag = true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                flag = false;
                return flag;
            }
        }
        return flag;
    }
}
