
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Toshiba
 */
public class LuckySevens {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int currentMoney = 0;
        int totalRolls = 0;
        int maxMoneyRoll=0;
        //ask the user how many dollars to bet
        System.out.println("How many dollars do you have to bet?");
        currentMoney = sc.nextInt();
        sc.nextLine();
        int maxMoney = currentMoney;
        //role dice until all the money is gone
        while(currentMoney > 0){
            //roll 2 dice
            int diceTotal = rollDice() + rollDice();
            //tracks how many rolls total
            totalRolls++;
            //if total is 7, +$4
            if(diceTotal == 7){
               currentMoney += 4; 
               //track max money
               if(currentMoney  > maxMoney)
               maxMoney = currentMoney;
               //track what roll the player had max money
               maxMoneyRoll = totalRolls;
            }
            //otherwise -$1
            else{
                currentMoney -= 1;
            }
            System.out.println("current money: $"+ currentMoney + " value rolled: " + diceTotal);
        }
        System.out.println("You are broke after " + totalRolls + "rolls");
        // You should have quit after 47 rolls when you had $113.
        System.out.println("You should have quit after" + maxMoneyRoll + "rolls when you had $" + maxMoney);
    }
    public static int rollDice(){
        Random rng = new Random();
        return rng.nextInt(6) + 1;
    }
        
}
