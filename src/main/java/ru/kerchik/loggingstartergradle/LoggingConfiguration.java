package ru.kerchik.loggingstartergradle;

public class LoggingConfiguration {
    public static void testLog(String string) {
        System.out.println("From gradle " + string);
    }
}
