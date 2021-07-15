package com.hopu.day2;

public class Fight {
    public static void main(String[] args) {


//创建奥特曼和怪兽对象
        Ultraman ultraman = new Ultraman("梦比优斯", 90, 1000);
        Monster monster = new Monster("哥斯拉", 50, 600);

        monster.ruin(monster);

        ultraman.flySkill(ultraman);

        monster.strongAttack(ultraman);

        //奥特曼攻击怪兽
        while (monster.HP > 0&&ultraman.HP>0) {
            //奥特曼攻击怪兽
            ultraman.attack(monster);
            //反弹攻击
            ultraman.underattack(ultraman);
            //怪兽攻击奥特曼
            monster.attack(ultraman);
        }
        if(monster.HP < 60) {

            ultraman.lightAttack(monster);
        }
        if (monster.HP <= 0) {
            System.out.println("怪兽死亡");
        }
        ultraman.flyBack(ultraman);
    }
}
