package com.abhisheksingh.classwork.arrays;

import com.abhisheksingh.classwork.Executor;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor(onConstructor_ = @Autowired)
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class MinMaxArrayExecutor implements Executor {

    MinMaxAverageSortedAndRemoveElemInArray component;

    @Override
    public void execute() {
        performCall();
    }

    private void performCall() {
        System.out.println("Min: " + component.min());
        System.out.println("Max: " + component.max());
        System.out.println("Average: " + component.average());
        System.out.println(
                "Sorted Array: "
                        + IntStream.of(component.sortedArray())
                                .mapToObj(String::valueOf)
                                .collect(Collectors.joining(",")));
        System.out.println(
                "Remove elements from the array: "
                        + IntStream.of(component.removeStuff())
                                .mapToObj(String::valueOf)
                                .collect(Collectors.joining(",")));
    }
}
