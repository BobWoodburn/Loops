
import java.util.Scanner;
public class SumNumbers {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Number to sum to (in increments of 1) = ");
        int SumMax = reader.nextInt();
        int Sum=0;

        int i = 0;
        do { i = i + 1;
            Sum=Sum+i;
            System.out.println("i= "+i+" Sum= "+Sum);
           }
        while (i < SumMax);
        System.out.print("Sum of all the positive integers to "+SumMax+" = "+Sum);
    }
}
