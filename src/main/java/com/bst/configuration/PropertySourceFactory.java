package com.bst.configuration;

import lombok.var;
import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.support.EncodedResource;

import java.util.Objects;
import java.util.Properties;

public class PropertySourceFactory
    implements org.springframework.core.io.support.PropertySourceFactory {

  @Override
  public PropertySource<?> createPropertySource(String name, EncodedResource encodedResource) {
    var factory = new YamlPropertiesFactoryBean();
    factory.setResources(encodedResource.getResource());

    Properties properties = factory.getObject();

      assert properties != null;
      return new PropertiesPropertySource(Objects.requireNonNull(encodedResource.getResource().getFilename()), properties);
  }
}
