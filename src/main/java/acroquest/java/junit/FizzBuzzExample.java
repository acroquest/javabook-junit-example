package acroquest.java.junit;

public class FizzBuzzExample {
    public static String fizzBuzz(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("0以上の整数を指定してください");
        }
        if (num % 15 == 0) {
            return "FizzBuzz";
        } else if (num % 3 == 0) {
            return "Fizz";
        } else if (num % 5 == 0) {
            return "Buzz";
        } else  {
            return Integer.toString(num);
        }
    }
}
