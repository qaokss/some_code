package com.softmachine.training.app;


import com.softmachine.training.models.Organization;
import com.softmachine.training.models.Security;

import java.io.UnsupportedEncodingException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Representer {
    /**
     * Display all existing companies in the format "Short name" – "date of Foundation 17/01/98»
     *
     * @param organizations List of Organizations
     * @throws UnsupportedEncodingException
     */
    public static void getAllOrganizations(List<Organization> organizations) throws UnsupportedEncodingException {
        System.out.println("---------------------------------------------------------------");
        System.out.println("There are all organizations: ");
        organizations.stream().map(organization -> organization.getNameShort() + " - "
                + organization.getEgrulDate().format(DateTimeFormatter.ofPattern("dd/MM/yy")))
                .forEach(System.out::println);
    }

    /**
     * Display all securities (their code, expiration date, and full name of the owner organization).
     * which are overdue for the current day
     * and calculate the total number of all such securities;
     *
     * @param organizations List of Organizations
     */
    public static void getExpiredSecurities(List<Organization> organizations) {
        Map<String, Security> securityMap = new HashMap<>();
        organizations.forEach(o -> o.getSecurities().stream()
                .filter(s -> s.getDateTo().isBefore(LocalDate.now()))
                .forEach(security -> securityMap.put(o.getNameFull(), security)));

        System.out.println("---------------------------------------------------------------");
        System.out.println("There are " + securityMap.size() + " overdue securities on the current day: ");

        securityMap.forEach((key, value) -> System.out.println
                (value.getCode() + " - " + value.getDateTo() + " - " + key));
    }

    /**
     * Method displays organizations with a Foundation date that is more than entered
     *
     * @param creationDate  date from user's console input
     * @param organizations List of Organizations
     */
    public static void getOrganizationsFoundedFromDate(LocalDate creationDate, List<Organization> organizations) {
        organizations.stream().filter(o -> o.getEgrulDate().isAfter(creationDate)).
                forEach(organization -> System.out.println(organization.getNameShort() +
                        " - " + organization.getEgrulDate()));

    }

    /**
     * Method output IDs and codes of securities by the specified currency
     *
     * @param organizations - List of Organizations
     * @param currency      currency code from user's console input
     */
    public static void getSecuritiesWithSpecifiedCurrency(List<Organization> organizations, String currency) {
        List<Security> filteredSecuritiesList = new ArrayList<>();

        // filtering the list of securities by the specified currency
        organizations.forEach(o -> o.getSecurities().stream()
                .filter(s -> s.getCurrency().getCode().equals(currency))
                .forEach(filteredSecuritiesList::add));

        // output a list of securities if there are securities for the specified currency
        if (filteredSecuritiesList.size() != 0) {
            filteredSecuritiesList.forEach(security -> System.out.println(
                    security.getId() + " - " + security.getCode() + " - " + security.getCurrency().getCode()));
        } else {
            System.out.println("There are no securities with inputted currency");
        }

        {

        }

    }


}
