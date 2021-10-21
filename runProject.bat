@echo off

call gradlew.bat clean build bootRun -x test
pause
