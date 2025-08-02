package oopskill;
import java.util.Scanner;
public class Conversion {
class ConversionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();

        char[] chars = s.toCharArray();
        System.out.print("Characters: ");
        for (char c : chars) System.out.print(c + " ");
        System.out.println();

        byte[] bytes = s.getBytes();
        System.out.print("Bytes: ");
        for (byte b : bytes) System.out.print(b + " ");
        scanner.close();
    }
}

}
