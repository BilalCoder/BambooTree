package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>10000) {
            System.out.println("Bamboo cannot grow more than 10000 feet");
            return;
        }
        if(a==0) {
            System.out.println("Bamboo height cannot be zero");
            return;
        }
        if(a<0) {
            System.out.println("Bamboo height cannot be negative");
            return;
        }
        int number = 3, i=0;
        while(a>=number){
            number*=2;
            if(number==a){
                break;
            }
            i++;
        }
        if(number>a) {
            System.out.println("Invalid Input");
            return;
        }
        else if(a==number) {
            System.out.println("It will take " + (i + 1) + " years for the Bamboo tree to reach a height " + a + " feet.");
        }
    }
}
