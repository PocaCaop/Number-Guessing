import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        //Made by Oscar
        Scanner scanner = new Scanner(System.in);
        int userChoice;
        int cpuChoice = (int) (Math.random()*10 + 1);
        int chances = 3;
        boolean correctType = false;

        System.out.println("Hello and welcome to the number guessing game!\n You have 3 chances to guess the number, " +
                "if you guess it you win, if you don't you lose!\n GOOD LUCK!");
        do {
            System.out.println(cpuChoice);
            System.out.println("Guess a number from 1-10, you have " + chances + " chances left");
            correctType = scanner.hasNextInt();
            if (!correctType){
                System.out.println("ERROR: You have to type a whole number");
                scanner.nextLine();
            }else {
                userChoice = scanner.nextInt();
                if (userChoice > 10 || userChoice < 1){
                    System.out.println("ERROR: You have to type a number between 1-10");
                    correctType = false;
                }
            }
        }while (!correctType);
    }
}