package oopskill;
import java.util.Scanner;

public class singledigitsum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int result = getSingleDigitSum(num);
        System.out.println("The single digit sum is: " + result);
    }

    public static int getSingleDigitSum(int number) {
        while (number >= 10) {
            int sum = 0;
            while (number > 0) {
                sum += number % 10; 
                number /= 10;       
            }
            number = sum;
        }
        return number;
    }
}
