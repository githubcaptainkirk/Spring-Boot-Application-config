package org.example.springBootApplicationConfig;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//Spring-Framework bekannt machen zum Laden
@Component
@ConfigurationProperties("applicatiion-properties")
public class NewProperties {

    private String testProperties = "New Properties";

    public String getTestProperties() {
        return testProperties;
    }

    public void setTestProperties(String testProperties) {
        this.testProperties = testProperties;
    }
}
