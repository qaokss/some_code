package com.softmachine.training.app;


import com.softmachine.training.models.Organization;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class Representer {

    public static void getAllOrganizations(List<Organization> organizations) throws UnsupportedEncodingException {

        for (Organization organization : organizations) {
            String responseBeforeEncoding = organization.getNameShort() + " - " + organization.getEgrulDate();
            String responseAfterEncoding = new String(responseBeforeEncoding.getBytes(StandardCharsets.UTF_8), "Cp1251");
            System.out.println(responseAfterEncoding);
        }
    }

    public static void getExpiredSecurities() {

    }
}
