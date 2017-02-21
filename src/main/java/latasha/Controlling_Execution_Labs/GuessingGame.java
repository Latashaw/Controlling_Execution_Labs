package latasha.Controlling_Execution_Labs;
import java.util.InputMismatchException;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

/**
 * Created by latashawatson on 2/16/17.
 */
public class GuessingGame {
    Scanner input = new Scanner(System.in);
    int guesses=1;

    public int getRandomNumber(){
        return ThreadLocalRandom.current().nextInt(1,  21);
    }

    public int guess(int secretNumber, int guessNumber){
        while(!(secretNumber==guessNumber)){
            int previousGuess=0;
            if(!(guessNumber==previousGuess)){
                guesses++;
            }
            if(guessNumber>secretNumber){
                System.out.println("You're too high");
            }
            if(guessNumber<secretNumber){
                System.out.println("You're too low");
            }

            guessNumber=input.nextInt();
        }
        System.out.println("you got it in " + guesses + " guesses");
        return guesses;
    }

    public int Value(int nextInt){
        try{

        }catch(InputMismatchException e){
            nextInt = input.nextInt();
            Value(nextInt);
        }
        return nextInt;
    }


    public static void main(String[] args) {
        GuessingGame gg = new GuessingGame();
        Scanner scan = new Scanner(System.in);
        System.out.println("Pick a number between 1 and 20");
        int inputNumber = scan.nextInt();
        gg.Value(inputNumber);
        gg.guess(gg.getRandomNumber(),inputNumber);

    }
}
