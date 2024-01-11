package com.bst.configuration.sections;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.var;
import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.support.EncodedResource;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

public class JsonPropertiesLoader {

    public static Properties loadJsonProperties(File jsonFile) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode rootNode = objectMapper.readTree(jsonFile);

        Properties properties = new Properties();
        flattenJsonNode("", rootNode, properties);

        return properties;
    }

    private static void flattenJsonNode(String currentPath, JsonNode jsonNode, Properties properties) {
        if (jsonNode.isObject()) {
            jsonNode.fields().forEachRemaining(entry -> {
                String path = currentPath.isEmpty() ? entry.getKey() : currentPath + "." + entry.getKey();
                flattenJsonNode(path, entry.getValue(), properties);
            });
        } else if (jsonNode.isValueNode()) {
            properties.setProperty(currentPath, jsonNode.asText());
        }
    }
}

