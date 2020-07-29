package cn.atguigu.day07homework.test4;

/**
 * @author Symon
 */
public class PassParamDemo {
    public void  doubleNumber(int num) {//
        // 尝试将num变为原来的2倍大，看是否可以将给num赋值的实参变量值也扩大2倍，如果不能，请画图说明为什么？
        num *= 2;
    }

    public void toUpperCase(char letter){
        //：尝试将letter的小写字母转为大写字母，看是否可以将给letter赋值的实参变量值也转为大写，如果不能，请画图说明为什么？
        letter += ('A' - 'a');
    }

    public void expandCircle(Circle c, double times) {
        //：尝试将Circle的c对象的半径扩大为原来的times倍，看是否可以将给c赋值的实参对象的半径也扩大times倍，如果可以，请画图说明为什么？
        //可以
        c.radius *= 2;
    }

    public void sort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}
