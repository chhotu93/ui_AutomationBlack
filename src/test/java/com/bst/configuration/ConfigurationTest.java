package com.bst.configuration;

import com.bst.Application;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = Application.class)
public class ConfigurationTest {
//    @Autowired
    private Config config;
//    @Autowired
    private ApplicationContext context;
//    @Test

    public void whenFactoryProvidedThenYamlPropertiesInjected() {
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxx " + config.driverDetails().os);
    }
}
