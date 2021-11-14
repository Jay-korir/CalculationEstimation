package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("enter first name: ");
        String firstName = scanner.nextLine();
        System.out.println("enter last name: ");
        String lastName = scanner.nextLine();

        System.out.println("enter width: ");
        int width = scanner.nextInt();
        System.out.println("enter height: ");
        int height = scanner.nextInt();
        System.out.println("enter numberWalls: ");
        int numberWalls = scanner.nextInt();


        double surfaceAreaPainted = width * height * numberWalls;
        double areaToBePainted = surfaceAreaPainted;

        double costOfPainting = areaToBePainted * 20;


        double discount;
        if (areaToBePainted == 100) {
            discount = (1 / 100) * costOfPainting;
        } else if (areaToBePainted > 100 && areaToBePainted < 1000) {
            discount = (5 / 100) * (costOfPainting - 2000);
        } else if (areaToBePainted > 1000 && areaToBePainted < 5000) {
            discount = (7 / 100) * (costOfPainting - 20000);
        } else if (areaToBePainted > 5000) {
            discount = (10 / 100) * (costOfPainting - 100000);


            System.out.println("Valid customer name: " + firstName + " " + lastName);
            System.out.println("Entered height/width: "+ width + "" + height);
            System.out.println("Entered no. of walls: "+ numberWalls);
            System.out.println("The area to be painted: "+String.format("%.2f", surfaceAreaPainted));
            System.out.println("The cost of painting: " + String.format("%.2f", costOfPainting));
            System.out.println("Discount on painting: "+ discount);
            System.out.println("Your transaction: " + lastName + "007-AWESOME-CSE174-" + firstName);


        }


    }
}






