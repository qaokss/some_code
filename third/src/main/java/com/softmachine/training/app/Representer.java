package com.softmachine.training.app;


import com.softmachine.training.models.Organization;
import com.softmachine.training.models.Security;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Representer {
    /**
     * Display all existing companies in the format "Short name" – "date of Foundation 17/01/98»
     * @param organizations - List of Organizations
     * @throws UnsupportedEncodingException
     */
    public static void getAllOrganizations(List<Organization> organizations) throws UnsupportedEncodingException {
        for (Organization organization : organizations) {
            System.out.println(organization.getNameShort() + " - " + organization.getEgrulDate());
        }
    }

    public static void getExpiredSecurities(List<Security> securities) {
        securities.stream().filter(s -> s.getDateTo().isBefore(LocalDate.now()))
        .forEach(security -> System.out.println(security.getNameFull() + " - " + security.getDateTo()));

    }
}
