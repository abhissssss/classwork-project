package com.abhisheksingh.classwork.phoneclass;

import javax.validation.constraints.NotNull;

public interface PhoneCommand {
    void receiveCall(@NotNull final Phone phone);
}
