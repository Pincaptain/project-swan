package org.akatosh.converter;

import com.google.gson.Gson;

public class JsonConverter implements IJsonConverter {
    public <T> T jsonToObject(String json, Class<T> type) {
        Gson gson = new Gson();

        return gson.fromJson(json, type);
    }

    public String objectToJson(Object object) {
        Gson gson = new Gson();

        return gson.toJson(object);
    }
}
