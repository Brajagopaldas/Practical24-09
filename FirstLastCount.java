mport java.util.Scanner;

public class FirstLastCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = scanner.nextLine();
        
            char firstChar = s.charAt(0);
            char lastChar = s.charAt(s.length() - 1);
            
            System.out.println("First character: " + firstChar);
            System.out.println("Last character: " + lastChar);
        
        
        scanner.close();
    }
}
