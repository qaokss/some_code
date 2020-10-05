package com.softmachine.training.app;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import com.softmachine.training.models.Organization;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

public  class Mapper {

    public static List<Organization> file(String filepath) throws IOException {

        // need for deserialize String value to LocalDate value
        Gson gson = new GsonBuilder().registerTypeAdapter(LocalDate.class,
                (JsonDeserializer<LocalDate>) (json, type, jsonDeserializationContext)
                        -> LocalDate.parse(json.getAsJsonPrimitive().getAsString())).create();

        // need for crete List of Objects
        Type organizationType = new TypeToken<ArrayList<Organization>>(){}.getType();

        return gson.fromJson(new FileReader(filepath, StandardCharsets.UTF_8), organizationType);
    }

}
