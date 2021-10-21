package com.abhisheksingh.classwork;

import java.util.List;
import java.util.function.Supplier;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class Driver implements CommandLineRunner {

    ExecutionController executionController;

    public static void main(String[] args) {
        SpringApplication.run(Driver.class, args);
    }

    @Override
    public void run(String... args) {
        runTasks();
    }

    private void runTasks() {
        final List<Supplier<Executor>> tasksList =
                List.of(
                        () -> executionController.obtainExecutor(Assignments.PHONE),
                        () -> executionController.obtainExecutor(Assignments.MIN_MAX_ARRAYS));
        runTasks(tasksList, () -> System.out.println("-----------------"));
    }

    private void runTasks(final List<Supplier<Executor>> tasks, Runnable invariantAction) {
        tasks.forEach(
                executorSupplier -> {
                    executorSupplier.get().execute();
                    invariantAction.run();
                });
    }
}
