package com.abhisheksingh.classwork.phoneclass;

import com.abhisheksingh.classwork.Executor;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor(onConstructor_ = @Autowired)
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class PhoneExecutor implements Executor {
    @Qualifier("primary")
    PhoneCommand phoneCommand;

    @Override
    public void execute() {
        final var phone =
                Phone.builder()
                        .number(new Phone.PhoneNumber(91, 123_456_789))
                        .model(new Phone.Model("M", 12_345, "J"))
                        .weight(1.2)
                        .build();
        System.out.println("Executing Phone assignment");
        phoneCommand.receiveCall(phone);
        System.out.println("Finished execution of phone assignment");
    }
}
