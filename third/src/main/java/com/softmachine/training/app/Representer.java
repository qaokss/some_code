package com.softmachine.training.app;


import com.softmachine.training.models.Organization;
import com.softmachine.training.models.Security;

import java.io.UnsupportedEncodingException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Representer {
    /**
     * Display all existing companies in the format "Short name" – "date of Foundation 17/01/98»
     *
     * @param organizations - List of Organizations
     * @throws UnsupportedEncodingException
     */
    public static void getAllOrganizations(List<Organization> organizations) throws UnsupportedEncodingException {
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
     * @param organizations
     */
    public static void getExpiredSecurities(List<Organization> organizations) {
        Map<String, Security> securityMap = new HashMap<>();
        organizations.forEach(o -> o.getSecurities().stream()
                .filter(s -> s.getDateTo().isBefore(LocalDate.now()))
                .forEach(security -> securityMap.put(o.getNameFull(), security)));

        System.out.println("\nThere are " + securityMap.size() + " overdue securities on the current day: ");

        securityMap.forEach((key, value) -> System.out.println
                (value.getCode() + " - " + value.getDateTo() + " - " + key));


    }
}
