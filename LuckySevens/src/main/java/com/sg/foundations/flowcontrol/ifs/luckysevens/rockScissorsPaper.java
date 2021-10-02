/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.ifs.luckysevens;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Toshiba
 */
public class rockScissorsPaper {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stringOption = "yes";
        while (!"NO".equals(stringOption)) {
            run();
            System.out.println("Do you want to play again? yes  or  no?");
            stringOption = sc.nextLine();
            stringOption = stringOption.toUpperCase();
        }
        System.out.print("Thank you for playing");
    }

    public static String run() {
        String stringRolls;
        int rolls;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many rounds you want to play? (Select from 1 - 10)");
        stringRolls = sc.nextLine();
        rolls = Integer.parseInt(stringRolls);
        int totalRolls = 0;

        int wins = 0, losses = 0, ties = 0;
        if ((rolls < 10) && (rolls > 0)) {

            //condition to execute the game
            while (totalRolls < rolls) {
                //ask user for input   
                System.out.println("Please choose any option:");
                System.out.println("Rock     Paper    Scissors");

                String playerMove = getPlayerMove();
                String computerMove = getComputerMove();

                //Rules of the Game Applied Below:
                //if both playerMove and computerMove produces the same formation, then 
                //Game is a tie
                if (playerMove.equals(computerMove)) {
                    System.out.println("It's a tie!");
                    ties++;
                } else if ((playerMove.equals("ROCK") && computerMove.equals("SCISSORS"))
                        || (playerMove.equals("SCISSORS") && computerMove.equals("PAPER"))
                        || (playerMove.equals("PAPER") && computerMove.equals("ROCK"))) {
                    System.out.println("You won!");
                    wins++;
                    System.out.println("You won " + wins + " times");
                } else {
                    System.out.println("You lost!");
                    losses++;
                    System.out.println("You lost " + losses + " times");
                }
                totalRolls++;
            }
        } else {
            System.out.println("invalid option");
        }
        System.out.println("Ties: " + ties + "  Wins: " + wins + "  Losses: " + losses);
        if (wins > losses) {
            System.out.println("You won!");
        } else if (losses > wins) {
            System.out.println("COmputer won!");
        }
        return "";
    }

    public static String getPlayerMove() {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        String playerMove = input.toUpperCase();
        if (!playerMove.equals("ROCK") && !playerMove.equals("PAPER") && !playerMove.equals("SCISSORS")) {
            System.out.println("Your move isn't valid!");
        } else {
            System.out.println("Player move is: " + playerMove);
        }
        return playerMove;
    }

    public static String getComputerMove() {
        String computerMove;
        Random my = new Random();
        int input = my.nextInt(3) + 1;
        switch (input) {
            case 1:
                computerMove = "ROCK";
                break;
            case 2:
                computerMove = "PAPER";
                break;
            default:
                computerMove = "SCISSORS";
                break;
        }
        System.out.println("Computer move is: " + computerMove);
        return computerMove;
    }
}
