#!/bin/sh

./gradlew clean build bootRun -x test

read -n 1 -s -r -p "Press any key to continue..."
