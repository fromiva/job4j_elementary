package ru.job4j.condition;

public class Cinema {

    public static void access(int ageOfTheCustomer) {

        int ageOfMajority = 18;

        System.out.println("The age of the customer: " + ageOfTheCustomer);

        if (ageOfTheCustomer >= ageOfMajority) {
            System.out.println("Welcome to the cinema.");
        } else {
            System.out.println("It is not for you.");
        }
    }

    public static void main(String[] args) {
        Cinema.access(21);
        Cinema.access(18);
        Cinema.access(16);
    }
}
