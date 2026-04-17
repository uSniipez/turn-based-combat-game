package com.game;
import java.util.Scanner;
import com.game.enemies.Grimbane;

public class GameEngine {
    ConsoleUI ui = new ConsoleUI();
    Player player = new Player();
    Grimbane grimbane = new Grimbane();
    // way for game to know what who the current enenmy is and what turn it is on
    

    public void chooseAction() {
    Scanner scanner = new Scanner(System.in);
    

    while (true) {
        String userInput = scanner.nextLine();

        if (userInput.equals("1")) {
            grimbane.takeDamage(player.playerAttackDamage);
            System.out.println("You attacked for " + player.playerAttackDamage);
            break; 
        } else if (userInput.equals("2")) {
            player.defend();
            System.out.println("You defended for " + player.playerDefend);
            break;
        } else {
            System.out.println("Invalid input, try again!");}
    }
    










    
    }
}
