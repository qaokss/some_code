package com.softmachine.training;

import com.softmachine.training.app.Mapper;
import com.softmachine.training.app.Representer;
import com.softmachine.training.models.Organization;


import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        List<Organization> organizations = Mapper.file();
        Representer.getAllOrganizations(organizations);

    }
}
