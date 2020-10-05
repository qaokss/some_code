package com.softmachine.training;

import com.softmachine.training.app.ConsoleReader;
import com.softmachine.training.app.Mapper;
import com.softmachine.training.app.Reader;
import com.softmachine.training.app.Representer;
import com.softmachine.training.models.Organization;
import com.softmachine.training.models.Security;


import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        // read file
        String filePath = Reader.readConsoleFilePath();
        List<Organization> organizations = Mapper.file(filePath);

        // output organizations
        Representer.getAllOrganizations(organizations);

        // output expired securities
        Representer.getExpiredSecurities(organizations);

        // output organizations with Foundation Date after user's input
        LocalDate date = ConsoleReader.readConsoleCreationDate();
        Representer.getOrganizationsFoundedFromDate(date, organizations);

        // output securities with currency from user's input
        String currency = ConsoleReader.readFromConsoleCurrencyCode();
        Representer.getSecuritiesWithSpecifiedCurrency(organizations, currency);
    }
}
