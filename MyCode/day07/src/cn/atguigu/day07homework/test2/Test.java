package cn.atguigu.day07homework.test2;

/**
 * @author Symon
 */
public class Test {
    public static void main(String[] args) {
        GraphicTools.printRectangle();
        GraphicTools.printRectangle(3, 4, "$");
        System.out.println("GraphicTools.getTriangleArea(10, 10) = " + GraphicTools.getTriangleArea(10, 10));
        System.out.println("GraphicTools.getTriangleArea(3,4,5) = " + GraphicTools.getTriangleArea(3, 4, 5));
    }
}
