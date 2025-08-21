package oopskill;
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int original = num;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;              
            reversed = reversed * 10 + digit;  
            num = num / 10;                    
        }

        if (original == reversed) {
            System.out.println(original + " is a palindrome — a perfect loop of digits.");
        } else {
            System.out.println(original + " is not a palindrome — the spell breaks.");
        }

        scanner.close();
    }
}
