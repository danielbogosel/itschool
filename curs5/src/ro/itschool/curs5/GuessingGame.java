package ro.itschool.curs5;

import java.util.Scanner;
import java.util.Random;


class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int randomNumber = random.nextInt(100);

        System.out.println("Incearca sa ghicesti numarul ");
        int guessingTry = sc.nextInt();

        if (guessingTry != randomNumber) {

            do {
                hints(guessingTry, randomNumber);
                guessingTry = sc.nextInt();
            } while (guessingTry != randomNumber);

            System.out.println("You guessed it! Congratulations!");

        } else
            System.out.println("You guessed it! Congratulations!");

    }


    public static String hints(int compeNumber, int random) {
        if (compeNumber < random) {
            return "Sorry, you're too low. Try again";
        } else if (compeNumber > random) {
            return "Sorry, you're too high. Try again";
        }

    }




