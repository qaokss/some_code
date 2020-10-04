package com.softmachine.training.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;

public class ConsoleReader {

    /**
     * Read user input to console date and return
     *
     * @return File path from user enter to console
     */
    public static LocalDate readConsoleCreationDate() throws IOException {
        String inputDate = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        LocalDate inputLocalDate = null;

        //waiting while user enter date in correct format
        while (inputDate == null || inputDate.equals("") || inputLocalDate == null) {
            System.out.println("---------------------------------------------------------------");
            System.out.println("Please write date to see organizations founded after this date:");
            System.out.println("Examples: «dd.MM.yyyy», «dd.ММ.yy», «dd/ММ/yyyy» и «dd/ММ/yy»");

            try {
                inputDate = reader.readLine();
            } catch (IOException e) {
                System.out.println("Error while reading input from console");
            }

            if (inputDate != null) {
                inputLocalDate = dateFormatValidator(inputDate);
            }
        }
        return inputLocalDate;
    }

    /**
     * Read user input to console currency and return
     *
     * @return File path from user enter to console
     */
    public static String readFromConsoleCurrencyCode() throws IOException {
        String currencyCode = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //waiting while user enter date in correct format
        while (currencyCode == null || currencyCode.equals("")) {
            System.out.println("---------------------------------------------------------------");
            System.out.println("Please write currency code to see securities with it:");
            System.out.println("Examples: EU, USD, RUB");

            try {
                currencyCode = reader.readLine();
            } catch (IOException e) {
                System.out.println("Error while reading input from console");
            }
        }

        return currencyCode;
    }

    /**
     * method checks whether the entered date is correct
     * and returns it in LocalDate type if the date can be parsed
     *
     * @param inputDate
     * @return LocalDate (if the date can be parsed) or null with error message
     */
    public static LocalDate dateFormatValidator(String inputDate) {

        DateTimeFormatter parserOne = new DateTimeFormatterBuilder()
                .append(DateTimeFormatter.ofPattern("dd/MM/"))
                .appendValueReduced(ChronoField.YEAR, 2, 4, 1980)
                .toFormatter();

        DateTimeFormatter parserTwo = new DateTimeFormatterBuilder()
                .append(DateTimeFormatter.ofPattern("dd.MM."))
                .appendValueReduced(ChronoField.YEAR, 2, 4, 1980)
                .toFormatter();

        try {
            if (inputDate.contains("/")) {
                return LocalDate.parse(inputDate, parserOne);
            }
            return LocalDate.parse(inputDate, parserTwo);
        } catch (DateTimeException e) {
            System.err.println(e.getMessage());
            return null;
        }

    }
}

