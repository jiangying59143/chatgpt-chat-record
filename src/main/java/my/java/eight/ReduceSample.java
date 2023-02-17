package my.java.eight;

import java.util.Arrays;
import java.util.List;

public class ReduceSample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.parallelStream()
                .filter(n -> n % 2 == 0)
                .reduce(0, Integer::sum);
        System.out.println("Sum of even numbers: " + sum);
    }
}
