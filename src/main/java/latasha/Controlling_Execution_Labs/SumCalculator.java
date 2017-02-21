package latasha.Controlling_Execution_Labs;

import java.util.Scanner;

/**
 * Created by latashawatson on 2/16/17.
 */
public class SumCalculator {



    public int sum(int input){
        int sum=0;
        for(int i = 1;i<=input;i++){
            sum += i;
        }
        System.out.println(sum);
            return sum;
    }

    public static void main(String[] args) {
        SumCalculator c = new SumCalculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("pick a number");
        int input = scanner.nextInt();
        c.sum(input);


    }
}
