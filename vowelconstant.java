package oopskill;

import java.util.Scanner;

public class vowelconstant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an alphabet: ");
        char ch = scanner.next().toLowerCase().charAt(0);

        if (!Character.isLetter(ch)) {
            System.out.println("Not an alphabet, dear soul.");
        } else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a vowel, soft and melodious.");
        } else {
            System.out.println(ch + " is a consonant, strong and steady.");
        }

        scanner.close();
    }
}
