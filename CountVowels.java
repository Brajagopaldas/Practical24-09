import java.util.Scanner;

class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();

        int v = 0, c = 0, d = 0, sp = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
                v++;
            } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                c++;
            } else if (ch >= '0' && ch <= '9') {
                d++;
            } else if (ch == ' ') {
                sp++;
            }
        }

        System.out.println("Vowels: " + v);
        System.out.println("Consonants: " + c);
        System.out.println("Digits: " + d);
        System.out.println("Spaces: " + sp);
    }
}
