/*
 *  UCF COP3330 Fall 2021 Assignment 15 Solution
 *  Copyright 2021 Christine Hawkins
 */
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //password:abc$123

        System.out.println("What is your username? ");
        String username= input.next();

        System.out.println("What is the password? ");
        String password = input.next();


        if(password.equals("abc$123"))
        {
            System.out.printf("Welcome!");

        }else
            System.out.printf("I don't know you!");

    }
}
