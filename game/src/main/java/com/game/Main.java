package com.game;
import java.util.Scanner;

import com.game.enemies.Grimbane;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConsoleUI ui = new ConsoleUI();
        Player player = new Player();
        Grimbane grimbane = new Grimbane();
        Combat combat = new Combat();
        

        ui.consoleUI();
       /*
        String userInput = scanner.nextLine();
        if (userInput.equals("1")) {
            grimbane.grimbaneHP = combat.attack(player.playerAttackDamage, grimbane.grimbaneHP);
            System.out.println("You attack Grimbane for 10 damage.");

            player.playerHP = combat.attack(grimbane.grimbaneAttackDamage, player.playerHP);
            System.out.println("Grimbane attacks for 5 damage.");

            System.out.println(grimbane.grimbaneHP);
            System.out.println(player.playerHP);
        }
        */
    
        System.out.println(player.playerHP + " before test");
        player.takeDamage(20);
        System.out.println(player.playerHP + " after test");

        System.out.println(grimbane.grimbaneHP + " before test");
        grimbane.takeDamage(player.playerAttackDamage);
        System.out.println(grimbane.grimbaneHP + " after test");

    }
}