package cn.atguigu.day07homework.test3;

/**
 * @author Symon
 * 声明一个数组工具类MyArrays，包含如下方法：
 *
 * 1、int  binarySearch(int[]  arr,  int  value)：使用二分查找法在arr数组中查找value的下标，如果value不存在，就返回-1，如果数组arr不是有序的，结果将不一定正确
 *
 * 2、int  binarySearch(char[]  arr,  char  value)：使用二分查找法在arr数组中查找value的下标，如果value不存在，就返回-1，如果数组arr不是有序的，结果将不一定正确
 *
 * 3、int  binarySearch(double[]  arr,  double  value)：使用二分查找法在arr数组中查找value的下标，如果value不存在，就返回-1，如果数组arr不是有序的，结果将不一定正确
 *
 * 4、int[]  copy(int[] arr , int length)：从指定的arr数组的arr[0]开始复制得到一个新数组，新数组的长度为length。
 *
 * 5、double[]  copy(double[] arr , int length)：从指定的arr数组的arr[0]开始复制得到一个新数组，新数组的长度为length。
 *
 * 6、char[]  copy(char[] arr , int length)：从指定的arr数组的arr[0]开始复制得到一个新数组，新数组的长度为length。
 *
 * 7、void sort(int[] arr)：可以给arr数组从小到大排序，用冒泡排序实现
 *
 * 8、void sort(char[] arr)：可以给arr数组从小到大排序，用冒泡排序实现
 *
 * 9、void sort(double[] arr)：可以给arr数组从小到大排序，用冒泡排序实现
 *
 * ​	声明Test03测试类，并在main方法中调用测试
 */
public class MyArrays {
    public static int  binarySearch(int[]  arr,  int  value) {
        int len = arr.length;
        int lowIndex = 0;
        int highIndex = len - 1;

        while (lowIndex < highIndex) {
            int midIndex = (lowIndex + highIndex) >> 1;
            if (arr[midIndex] == value) {
                return midIndex;
            } else if (arr[midIndex] >= value) {
                highIndex -= 1;
            } else {
                lowIndex += 1;
            }
        }
        return -1;
    }

    public static int  binarySearch(char[]  arr,  char  value) {
        int len = arr.length;
        int lowIndex = 0;
        int highIndex = len - 1;

        while (lowIndex < highIndex) {
            int midIndex = (lowIndex + highIndex) >> 1;
            if (arr[midIndex] == value) {
                return midIndex;
            } else if (arr[midIndex] >= value) {
                highIndex -= 1;
            } else {
                lowIndex += 1;
            }
        }
        return -1;
    }

    public static int  binarySearch(double[]  arr,  double  value) {
        int len = arr.length;
        int lowIndex = 0;
        int highIndex = len - 1;

        while (lowIndex < highIndex) {
            int midIndex = (lowIndex + highIndex) >> 1;
            if (arr[midIndex] == value) {
                return midIndex;
            } else if (arr[midIndex] >= value) {
                highIndex -= 1;
            } else {
                lowIndex += 1;
            }
        }
        return -1;
    }

    public static int[] copy(int[] arr , int length) {
        int[] ints = new int[length];
        for (int i = 0; i < arr.length; i++) {
            ints[i] = arr[i];
        }
        return ints;
    }

    public static double[] copy(double[] arr , int length) {
        double[] doubles = new double[length];
        for (int i = 0; i < arr.length; i++) {
            doubles[i] = arr[i];
        }
        return doubles;
    }

    public static char[] copy(char[] arr , int length) {
        char[] chars = new char[length];
        for (int i = 0; i < arr.length; i++) {
            chars[i] = arr[i];
        }
        return chars;
    }

    public static void sort(int[] arr) {
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

    public static void sort(char[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void sort(double[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j + 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}
