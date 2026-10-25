import java.util.Scanner;

public class Task15 {
    static boolean isPalindrome(int n) {
        int original = n;
        int reversed = 0;

        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (isPalindrome(n)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}