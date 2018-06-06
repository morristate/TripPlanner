package com.learnjava.tripplanner;

import java.util.Scanner;

public class TripPlanner {
    public static void main(String[] args) {
        createScanner();
        greetUser();
        askUserInfo();
        askTimeDiff();
        askCountryArea();
    }

    public static void createScanner() {
        import java.util.Scanner;
        Scanner input = new Scanner(System.in);

    }

    public static void greetUser() {
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name?");
        String name = input.nextLine();
        System.out.println("Nice to meet you " + name +", Where are you travelling to?");
        String destination = input.nextLine();
        System.out.println("Great!" + destination + "sounds like a great trip");
    }

    public static void askUserInfo() {
        System.out.print("How many days are you going to spend travelling?");
        int days = input.nextInt();
        System.out.print("How much money, in USD, are you planning to spend on your trip?");
        int dollars = input.nextInt();
        System.out.println("What is the three letter currency symbol for your travel destination?");
        String currencySymbol = input.next();
        System.out.println("How many " + currencySymbol + " are there in 1 USD?");
        double exchRate = input.nextDouble();
        int travelHours;
        int travelminutes;
        double dailyRate;
        double totalBudget;
        System.out.println("If you are travelling for " + days + " that is the same as " + days*24 +"hours or " + days*1440 + " minutes");
        System.out.println("If you are going to spend $" + dollars + " USD that means per day you can spend up to $" + dollars/days +" USD");
        System.out.println("Your total budget in " + currencySymbol + " is" + dollars*exchRate +  currencySymbol);

    }
    public static void askTimeDiff() {
        System.out.println("What is the time difference, in hours, between your home and your destination?");
        int timediff;
        timediff = input.nextInt();
        System.out.println("That means that when it is midnight at home it will be " + (timediff+ 24)%24 + ":00 in your travel destination and when it is noon at home it will be " + (timediff+24)%24 + ":00");
    }

    public static void askCountryArea() {
        System.out.println("What is the square are of your destination country in km2?");
        double countryArea;
        countryArea = input.nextDouble();
        System.out.println("In miles2 that is " + countryArea*.3861);
    }

    }


}
