import java.util.Scanner;
import java.util.function.BiFunction;

public class DigitSum {
    public static void main(String[] args) {

        BiFunction<Integer, Boolean, Integer> digitSum = (num, even) -> {
            int sum = 0;

            while (num > 0) {
                int d = num % 10;

                if (even && d % 2 == 0)
                    sum += d;

                if (!even && d % 2 != 0)
                    sum += d;

                num /= 10;
            }

            return sum;
        };

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String choice = sc.next();

        if (choice.equalsIgnoreCase("even"))
            System.out.println(digitSum.apply(num, true));
        else
            System.out.println(digitSum.apply(num, false));
    }
}