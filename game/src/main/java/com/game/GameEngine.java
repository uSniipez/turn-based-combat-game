package com.game;
import java.util.Scanner;
import com.game.enemies.Grimbane;

public class GameEngine {
    ConsoleUI consoleUI = new ConsoleUI();
    Player player = new Player();
    Grimbane grimbane = new Grimbane();
    Scanner scanner = new Scanner(System.in);

    public void startGame() {
        // add a way for game to know what who the current enenmy is and what turn it is on
        
        while (true) {
            consoleUI.chooseAction();
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
                System.out.println("Invalid input, try again!" + "\n");
            }
        }

        grimbane.randomTurn();
    }
}
