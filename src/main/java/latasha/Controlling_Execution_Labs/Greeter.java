package latasha.Controlling_Execution_Labs;

import java.util.Scanner;

/**
 * Created by latashawatson on 2/16/17.
 */
public class Greeter {

    public String greet(String input){
        if(input.equalsIgnoreCase("alice")||input.equalsIgnoreCase("bob")){
            System.out.println("hi " + input + "!");
            return "hi " + input + "!";
        }
        return "";
    }

    public static void main(String[] args) {
        Greeter g = new Greeter();
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name");
        String input = scanner.nextLine();
        g.greet(input);
    }
}
