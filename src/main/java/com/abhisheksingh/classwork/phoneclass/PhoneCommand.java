package com.abhisheksingh.classwork.phoneclass;

import javax.validation.constraints.NotNull;

/**
 * Command interface for all functionalities of a phone
 */
public interface PhoneCommand {
    void receiveCall(@NotNull final Phone phone);
}
