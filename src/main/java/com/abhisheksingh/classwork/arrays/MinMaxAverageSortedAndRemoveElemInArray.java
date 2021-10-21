package com.abhisheksingh.classwork.arrays;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.springframework.stereotype.Component;

@Component
public class MinMaxAverageSortedAndRemoveElemInArray {
    private static final int LOWER_BOUND_INCLUSIVE = 10;
    private static final int UPPER_BOUND_EXCLUSIVE = 21;

    private final transient int[] ARRAY =
            ThreadLocalRandom.current()
                    .ints(30L, LOWER_BOUND_INCLUSIVE, UPPER_BOUND_EXCLUSIVE)
                    .toArray();

    public int min() {
        return IntStream.of(ARRAY).min().orElse(Integer.MAX_VALUE);
    }

    public int max() {
        return IntStream.of(ARRAY).max().orElse(Integer.MIN_VALUE);
    }

    public double average() {
        return IntStream.of(ARRAY).average().orElse(Double.NaN);
    }

    public int[] sortedArray() {
        return IntStream.of(ARRAY).sorted().toArray();
    }

    public int[] removeStuff() {
        final var removeNumbersList =
                ThreadLocalRandom.current()
                        .ints(2L, LOWER_BOUND_INCLUSIVE, UPPER_BOUND_EXCLUSIVE)
                        .sorted()
                        .boxed()
                        .collect(Collectors.toList());
        System.out.println(
                "Elements to Remove: "
                        + removeNumbersList.stream()
                                .map(String::valueOf)
                                .collect(Collectors.joining(",")));
        return IntStream.of(ARRAY)
                .sorted()
                .filter(value -> !removeNumbersList.contains(value))
                .toArray();
    }
}
