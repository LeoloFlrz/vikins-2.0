package org.example.saxon;

import org.example.soldier.Soldier;

public class Saxon extends Soldier {
    int health;
    int strength;
    int damage;
    String msg;
    public Saxon(int health, int strength) {
        super(health, strength);
        this.health = health;
        this.strength = strength;
    }

    public int attack() {
        return this.strength;
    }

    public int receiveDamage(int damage) {
        return this.health -= damage;
    }

    public String getMsg() {
        if (this.health <= 0) {
            return this.msg = "A Saxon has died in combat";
        } else {
           return this.msg = "A Saxon has received " + this.strength + " points of damage";
        }
    }
}
