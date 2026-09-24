import java.util.Scanner;

public class StringLength {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		
		String str = sc.nextLine();
		
		int len = str.length();
		System.out.println("Length of The String : " + len);
	}
}
