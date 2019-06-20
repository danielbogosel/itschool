package ro.itschool.curs5;

import java.util.Scanner;

public class AgeOptions {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();


        if (age < 16) {
            System.out.println("You can't drive.");
        } else if (age >= 16 && age <= 17) {
            System.out.println("You can drive but not vote");
        } else if (age > 17 && age <=25){
            System.out.println("You can vote but not rent a car.");
        } else if(age >= 25){
            System.out.println("You can do prety much anything");
        }
    }
}

