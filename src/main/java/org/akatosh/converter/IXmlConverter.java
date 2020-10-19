package org.akatosh.converter;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.IOException;

public interface IXmlConverter {
    <T> T xmlToObject(String xml, Class<T> type) throws IOException;

    String objectToXml(Object object) throws JsonProcessingException;
}
