package oopskill;
import java.util.Scanner;
public class Trimwhitespace {
	class TrimWhitespace {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string with spaces: ");
	        String s = scanner.nextLine();

	        System.out.println("Trimmed: [" + s.trim() + "]");
	        scanner.close();
	    }
	}
}
