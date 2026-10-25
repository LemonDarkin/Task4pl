import java.util.Scanner;

public class TAsk12 {
    static int reverseNumber(int n) {
        int reversed = 0;

        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }

        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(reverseNumber(n));
    }
}