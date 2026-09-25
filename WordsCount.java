import java.util.Scanner;
class WordsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' ) {
                count++;
            }
        }
        count = count + 1;
        System.out.println("Number of words in the string: " + count);  
        sc.close();
    }
}
