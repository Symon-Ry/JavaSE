package cn.atguigu.test;

public class ControlWindowsConsole {
            // 参数一 "/k"保留窗口"/c"关闭窗口
            // 参数二 "cls"或者du其他命令zhi
        public static void console(String state, String con) {
            try {
                new ProcessBuilder("cmd", state, con).inheritIO().start().waitFor();
            } catch (Exception exception) {
                System.out.println("出错了!");
            }
        }

}

