package com.game.enemies;

public class Grimbane {
    public int grimbaneHP = 50;
    public int grimbaneShield = 0;
    public int grimbaneAttackDamage = 5;
    public int grimbaneDefend = 7;


    // for later use (min/max hp, damage uses shield first, etc)
    public int getGrimbaneHP() {return grimbaneHP;}
    public int getGrimbaneShield() {return grimbaneShield;}
    public int getGrimbaneAttackDamage() {return grimbaneAttackDamage;}
    public int getGrimbaneDefend() {return grimbaneDefend;}


    public void takeDamage(int damageSource) {
        int damage = damageSource;

        if (grimbaneShield > 0) { 
            damage = (damage - grimbaneShield);
            grimbaneShield = (grimbaneShield - damageSource);
            if (grimbaneShield < 0) {grimbaneShield = 0;}
        }
        
        if (grimbaneHP - damage <= 0) {
            System.out.println("Game Over: You died");
            System.exit(0);
        }
            
        grimbaneHP = (grimbaneHP - damage);
        System.out.println(grimbaneHP);    
    }

    public void defend () {
        grimbaneShield = (grimbaneShield + grimbaneDefend);
    }

}
