package org.example;


import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scnr = new Scanner(System.in);



        System.out.println("What is your age?");
        int age = scnr.nextInt();

        String statement = age <= 15 ? "You are not old enough to legally drive": "You are old enough to legally drive";
        System.out.println(statement);
    }
}
/*if(age <= 15)
        {
            System.out.println("You are not old enough to legally drive.");

        }
        else {
            System.out.println("You are old enough to legally drive");

        }*/