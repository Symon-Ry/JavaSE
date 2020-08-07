package atguigu.day10homework.test3;


/**
 * @author Symon
 * @version 1.0
 * @className Player
 * @description TODO
 * @date 2020/8/4 23:00
 */
public class Player {
    public static FightAble select(String str) {
        System.out.println("选择:" + str);
        if ("法力角色".equals(str)) {
            return new Soldier();
        }
        if ("武力角色".equals(str)) {
            return new Mage();
        }

        return null;
    }

    public static void main(String[] args) {
        FightAble fl = Player.select("法力角色");
        fl.specialFight();
        fl.comminFight();
        System.out.println("==============");

        FightAble wl = Player.select("武力角色");
        wl.specialFight();
        wl.comminFight();
    }
}
