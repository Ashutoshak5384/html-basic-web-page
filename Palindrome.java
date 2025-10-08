// PalindromeDemo.java
import java.util.Scanner;

public class PalindromeDemo {

    public static boolean isPalindromeString(String s) {
        if (s == null) return false;
        int i = 0, j = s.length() - 1;
        while (i < j) {
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) i++;
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) j--;
            char ci = Character.toLowerCase(s.charAt(i));
            char cj = Character.toLowerCase(s.charAt(j));
            if (ci != cj) return false;
            i++; j--;
        }
        return true;
    }

    public static boolean isPalindromeNumber(int x) {
        if (x < 0) return false;             
        if (x >= 0 && x < 10) return true;   

        int num = x;
        long reverted = 0; 

        while (num > reverted) {
            reverted = reverted * 10 + (num % 10);
            num /= 10;
        }

        return (num == reverted) || (num == reverted / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== String palindrome test ===");
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.println("Is palindrome (ignore non-alnum, case-insensitive)? " + isPalindromeString(input));

        System.out.println("\n=== Integer palindrome test ===");
        System.out.print("Enter an integer: ");
        while (!sc.hasNextInt()) {
            System.out.print("Please enter a valid integer: ");
            sc.next();
        }
        int n = sc.nextInt();
        System.out.println("Is palindrome (numeric)? " + isPalindromeNumber(n));

        sc.close();
    }
}
