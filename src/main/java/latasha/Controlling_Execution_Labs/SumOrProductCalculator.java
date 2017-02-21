package latasha.Controlling_Execution_Labs;

import java.util.Scanner;

/**
 * Created by latashawatson on 2/16/17.
 */
public class SumOrProductCalculator {


    public int sum(int input){
        int sum=0;
        for(int i = 1;i<=input;i++){
            sum += i;
        }
        System.out.println(sum);
        return sum;
    }

    public int product(int input){
        int product =1;
        for(int i = 1;i<=input;i++){
            product *= i;
        }
        System.out.println(product);
        return product;
    }

    public int choice(String input, int number){
        int answer=0;
        switch(input.toLowerCase()) {
            case "sum":  answer=sum(number);
            break;
            case "product": answer= product(number);
            break;
            default:
                System.out.println("Invalid entry");
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter a number");
                int secondNumber = scan.nextInt();
                scan.nextLine();
                System.out.println("sum or product");
                String secondInput = scan.nextLine();
                choice(secondInput, secondNumber);
                break;
        }
        return answer;
    }

    public static void main(String[] args) {
        SumOrProductCalculator sOPC = new SumOrProductCalculator();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scan.nextInt();
        scan.nextLine();
        System.out.println("sum or product");
        String input = scan.nextLine();
        sOPC.choice(input, number);
    }
}
