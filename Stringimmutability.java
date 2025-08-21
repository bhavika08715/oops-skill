package oopskill;
import java.util.Scanner;
public class Stringimmutability {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        String s2 = s1;
        System.out.print("Enter text to concatenate with first string: ");
        String toConcat1 = sc.nextLine();
        s1 = s1.concat(toConcat1);

        System.out.println("After concatenation, s1: " + s1);
        System.out.println("s2 still refers to original: " + s2);

        System.out.print("Enter second string: ");
        String s3 = sc.nextLine();

        System.out.print("Enter text to concatenate with second string: ");
        String toConcat2 = sc.nextLine();
        s3.concat(toConcat2);

        System.out.println("Immutability demonstration: " + s3);

        sc.close();
    }
}
