package com.softmachine.training.app;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.softmachine.training.models.Organization;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public  class Mapper {

    public static List<Organization> file() throws IOException {
        String path = "D:\\java\\some_code\\third\\src\\main\\resources\\test.json";
        Gson gson = new Gson();

        Type organizationType = new TypeToken<ArrayList<Organization>>(){}.getType();

        return gson.fromJson(new FileReader(path, StandardCharsets.UTF_8), organizationType);
    }

}
