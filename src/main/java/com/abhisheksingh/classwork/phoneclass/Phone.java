package com.abhisheksingh.classwork.phoneclass;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Phone {
    public static record PhoneNumber(int countryCode, long number) {}

    public static record Model(String series, int number, String postfix) {}

    PhoneNumber number;
    Model model;
    Double weight;
}

// git push origin TAG-1 <- 1st time
// git push

// git checkout master (this master is tracking origin/master) | git pull
// master -> git checkout -b TAG-1_connect_database_to_database
// TAG-1: connect application to database
// code written
// code pushed (add ., commit -m, push)
// Pull request (request to  be merged with the source-of-truth branch)
// Code Review
// Changes requested
// okke -> merge approved
