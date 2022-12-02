import java.util.Scanner;

import static java.lang.Math.abs;

public class NumberGuessing {
    public static void main(String[] args) {
        //Made by Oscar
        Scanner scanner = new Scanner(System.in);
        int userChoice;
        int cpuChoice = (int) (Math.random()*10 + 1);
        int chances = 3;
        boolean correctType = false;

        System.out.println("""
                Hello and welcome to the number guessing game!
                You have 3 chances to guess the number, if you guess it you win, if you don't you lose!
                GOOD LUCK!""");
       //Game
        do {
            System.out.println(cpuChoice);
            System.out.println("Guess a number from 1-10");
            correctType = scanner.hasNextInt();
            //Error Control
            if (!correctType){
                System.out.println("ERROR: You have to type a whole number");
                scanner.nextLine();
            }else {
                userChoice = scanner.nextInt();
                if (userChoice > 10 || userChoice < 1){
                    System.out.println("ERROR: You have to type a number between 1-10");
                    correctType = false;
                }else {
                    //Comparing cpuChoice with userChoice
                    if (cpuChoice == userChoice){ //Win
                        System.out.println("HOORAY You guessed it! The number was " + cpuChoice);
                    }else {
                        chances--;
                        if (chances == 0){ //Lose
                            System.out.println("You have 0 chances left! The number was " + cpuChoice +
                                    "\n See you next time");
                        }else {//Loses 1 chance and tries again
                            if (abs(userChoice - cpuChoice) >= 5){
                                System.out.println("AW! You're far away from the number! " + chances + " left");
                                correctType = false;
                            }else {
                                System.out.println("AW! You're close from the number, you can do this! "
                                        + chances + " left");
                                correctType = false;
                            }

                        }
                    }
                }
            }
        }while (!correctType);
    }
}