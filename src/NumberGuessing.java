import java.util.Scanner;

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
            System.out.println("Guess a number from 1-10, you have " + chances + " chances left");
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
                        System.out.println("HOORAY You guessed it the number was " + cpuChoice);
                    }else {
                        chances--;
                        if (chances == 0){ //Lose
                            System.out.println("You have 0 chances left! See you next time!");
                        }else {//Loses 1 chance and tries again
                            System.out.println("AW! You missed, you have now " + chances + " chances left");
                            correctType = false;
                        }
                    }
                }
            }
        }while (!correctType);
    }
}