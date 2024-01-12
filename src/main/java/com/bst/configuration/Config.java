package com.bst.configuration;

import com.bst.configuration.sections.DriverDetails;
import com.bst.configuration.sections.Environment;
import com.bst.configuration.sections.Timeout;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
// uncomment this if you want to have possibility to select configuration file
//@PropertySource(
//    value = "classpath:config/${config.file}.json",
//    factory = PropertySourceFactory.class)



 @PropertySource(value = "classpath:config/qatesttt.json", factory =
 PropertySourceFactory.class)
@Data
public class Config {

  @Bean
  @ConfigurationProperties(prefix = "driver-details")
  public DriverDetails driverDetails() {
    return new DriverDetails();
  }

  @Bean
  @ConfigurationProperties(prefix = "environment")
  public Environment environment() {
    return new Environment();
  }

  @Bean
  @ConfigurationProperties(prefix = "timeout")
  public Timeout timeout() {
    return new Timeout();
  }
}
