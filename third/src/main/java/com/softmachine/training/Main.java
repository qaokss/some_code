package com.softmachine.training;

import com.softmachine.training.app.ConsoleReader;
import com.softmachine.training.app.Mapper;
import com.softmachine.training.app.Representer;
import com.softmachine.training.models.Organization;
import com.softmachine.training.models.Security;


import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        List<Organization> organizations = Mapper.file();
        Representer.getAllOrganizations(organizations);
        Representer.getExpiredSecurities(organizations);
        LocalDate date = ConsoleReader.readConsoleCreationDate();
        Representer.getOrganizationsFoundedFromDate(date, organizations);
    }
}
