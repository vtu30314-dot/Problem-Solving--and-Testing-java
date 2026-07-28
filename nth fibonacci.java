import java.util.Scanner;
import java.util.function.Function;

public class Fibonacci {

    static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {

        Function<Integer, Integer> f = x -> fib(x);

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(f.apply(n));
    }
}