package com.bst.configuration;


import com.bst.configuration.sections.Config;
import org.springframework.context.ApplicationContext;

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
