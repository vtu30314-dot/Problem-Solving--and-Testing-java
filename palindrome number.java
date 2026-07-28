import java.util.Scanner;
import java.util.function.Predicate;

public class Palindrome {

    static boolean isPalindrome(Integer n) {
        int temp = n;
        int rev = 0;

        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }

        return rev == n;
    }

    public static void main(String[] args) {

        Predicate<Integer> p = Palindrome::isPalindrome;

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(p.test(n));
    }
}