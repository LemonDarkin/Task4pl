import java.util.Scanner;

public class Task14 {
    static long transformDigits(long n) {
        long result = 0;
        long place = 1;

        while (n > 0) {
            int digit = (int) (n % 10);

            if (digit % 2 == 0) {
                digit++;
            } else {
                digit--;
            }

            result += digit * place;
            place *= 10;
            n /= 10;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        System.out.println(transformDigits(n));
    }
}