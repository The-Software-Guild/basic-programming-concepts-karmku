/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.ifs.luckysevens;

import java.util.Scanner;

/**
 *
 * @author Toshiba
 */
public class HealthyHearts {
    public static void main(String[] args){
        float age;
        String stringAge;
        
        //declare and initialize scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your age?");
        stringAge = sc.nextLine();
        age = Float.parseFloat(stringAge);
        
        //printing the results
        System.out.println("Your maximum heart rate should be "+(220-age)+" beats per minute");
        System.out.println("Your target HR Zone is 85 - "+(220-age-85)+" beats per minute.");
    }
}
