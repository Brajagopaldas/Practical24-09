import java.util.Scanner;

public class UpperLowerCase {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A String");
		String str = sc.nextLine();
		
		String upper = str.toUpperCase();
		String lower = str.toLowerCase();
		
		System.out.println("\n UpperCase : " + upper);
		System.out.println("\n UpperCase : " + lower);
	}
}
