import java.util.Scanner;

public class RemoveSpace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = scanner.nextLine();
        
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                result += ch;
            }
        }
        System.out.println("String without spaces: " + result);
        scanner.close();
    }
}
