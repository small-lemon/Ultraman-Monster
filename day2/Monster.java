package com.hopu.day2;

public class Monster {
    private String name;
    private int attackPower;
    int HP;

    Monster(String name, int attackPower, int HP) {
        this.name = name;
        this.attackPower = attackPower;
        this.HP = HP;
    }

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

    void ruin(Monster self){
        System.out.printf("%s在城市奔跑肆意破坏\n",this.name);
    }
    void strongAttack(Ultraman enemy){
        System.out.printf("%s使用蛮力冲撞攻击了%s\n",this.name,enemy.getName());
    }
    void attack(Ultraman enemy){
        System.out.printf("怪兽%s攻击了奥特曼%s! %n",this.name,enemy.getName());
        //敌人掉血
        enemy.setHP(enemy.getHP() - this.attackPower);
        System.out.printf("奥特曼%s剩余血量%d!%n",enemy.getName(),enemy.getHP());
    }
}

