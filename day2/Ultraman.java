package com.hopu.day2;

public class Ultraman {
    private String name;
    private int attackPower;
    int HP;

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    int getHP() {
        return HP;
    }

    void setHP(int HP) {
        this.HP = HP;
    }

    Ultraman(String name, int attackPower, int HP) {
        this.name = name;
        this.attackPower = attackPower;
        this.HP = HP;

    }
    void lightAttack(Monster enemy){
        System.out.printf("%s使用光线冲击波攻击了%s\n",this.name,enemy.getName());
    }

    void flySkill(Ultraman self) {
        System.out.printf("%s飞出一脚\n", this.name);
    }
    void flyBack(Ultraman self) {
        System.out.printf("%S飞走撤离了地球", this.name);
    }

    /**
     * 奥特曼打小怪兽
     */
    void attack(Monster enemy) {
        System.out.printf("奥特曼%s攻击了怪兽%s! %n", this.name, enemy.getName());
        //敌人掉血
        enemy.setHP(enemy.getHP() - this.attackPower);
        System.out.printf("怪兽%s剩余血量%d!%n", enemy.getName(), enemy.getHP());
    }

    /**
     *
     * 怪兽反弹攻击
     */

    void underattack(Ultraman self) {
        System.out.printf("奥特曼受到反弹攻击！！", this.name, self.getName());
        //反弹伤害
        self.setHP(self.getHP() - this.attackPower / 10);
        System.out.printf("奥特曼%s剩余血量%d %n", self.getName(), self.getHP());
    }


}
