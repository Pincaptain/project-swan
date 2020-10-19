package org.akatosh.converter;

public interface IJsonConverter {
    <T> T jsonToObject(String json, Class<T> type);

    String objectToJson(Object object);
}
