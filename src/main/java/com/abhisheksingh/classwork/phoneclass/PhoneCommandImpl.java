package com.abhisheksingh.classwork.phoneclass;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("primary")
public class PhoneCommandImpl implements PhoneCommand {
    @Override
    public void receiveCall(Phone phone) {
        System.out.printf(
                "%d-%d is calling%n", phone.getNumber().countryCode(), phone.getNumber().number());
    }
}
