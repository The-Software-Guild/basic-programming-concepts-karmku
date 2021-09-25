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
public class dogGenetics {
    public static void main(String[] args){
        String name;
        Scanner sc = new Scanner(System.in);
        
        //ask the user for dog's name
        System.out.println("What is your dog's name?");
        name = sc.nextLine();
        System.out.println(" then, I have this highly reliable report of "+name+"'s prestigious background right here.");
       
        //generatting random numbers
        Random random = new Random();
        int sum=0;
        int a=0, b=0, c=0, d=0, e=0;
        while(sum!=100){
            a = random.nextInt(100);
            b = random.nextInt(100-a);
            c = random.nextInt(100-b);
            d = random.nextInt(100-c);
            e = random.nextInt(100-d);
            sum = a+b+c+d+e;
        }
        
        //printing the result of report
        System.out.println(a+"% St. Bernard");
        System.out.println(b+"% Chihuahua");
        System.out.println(c+"% Dramatic RedNosed Asian Pug");
        System.out.println(d+"% Common Cur");
        System.out.println(e+"% King Doberman");
        System.out.println("Wow, that's QUITE the dog!");    
    }
}
