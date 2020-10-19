package org.akatosh.converter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.IOException;

public class XmlConverter implements IXmlConverter {
    public <T> T xmlToObject(String xml, Class<T> type) throws IOException {
        XmlMapper xmlMapper = new XmlMapper();

        return xmlMapper.readValue(xml, type);
    }

    public String objectToXml(Object object) throws JsonProcessingException {
        XmlMapper xmlMapper = new XmlMapper();

        return xmlMapper.writeValueAsString(object);
    }
}
