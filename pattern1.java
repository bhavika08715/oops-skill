package oopskill;
import java.util.Scanner;

public class pattern1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(j + " ");
            }
            System.out.println(); 
        }

        scanner.close();
    }
}
