package org.example.vikins;

import org.example.soldier.Soldier;

public class Vikings extends Soldier {
    String name;
    int health;
    int strength;
    String msg;

    public Vikings(String name, int health, int strength) {
        super(health, strength);
        this.name = name;
        this.health = health;
        this.strength = strength;
    }

    @Override
    public int attack() {
        return this.strength;
    }

    public int receiveDamage(int damage) {
        return this.health -= damage;
    }

    public String getMsg() {
        if (this.health <= 0) {
            return this.msg = this.name + " has died in combat";
        } else {
            return this.msg = this.name + " has received "+ this.strength + " points of damage";
        }
    }
}
