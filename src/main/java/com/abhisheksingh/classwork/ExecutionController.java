package com.abhisheksingh.classwork;

import com.abhisheksingh.classwork.arrays.MinMaxArrayExecutor;
import com.abhisheksingh.classwork.phoneclass.PhoneExecutor;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ExecutionController {
    MinMaxArrayExecutor minMaxArraysArrayExecutor;
    PhoneExecutor phoneExecutor;

    public Executor obtainExecutor(Assignments assignments) {
        return switch (assignments) {
            case MIN_MAX_ARRAYS -> minMaxArraysArrayExecutor;
            case PHONE -> phoneExecutor;
        };
    }
}
