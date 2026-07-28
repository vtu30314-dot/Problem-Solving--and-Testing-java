import java.util.Scanner;
import java.util.function.BiFunction;

public class LastDigitSum {

    static int sumLastDigits(Integer a, Integer b) {
        return (a % 10) + (b % 10);
    }

    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> f = LastDigitSum::sumLastDigits;

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(f.apply(a, b));
    }
}