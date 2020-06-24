package org.example.springBootApplicationConfig;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

//Spring-Framework bekannt machen zum Laden
@Component
@ConfigurationProperties("applicatiion-properties")
public class NewProperties {

    List<String> listProperties;

    public List<String> getListProperties() {
        return listProperties;
    }

    public void setListProperties(List<String> listProperties) {
        this.listProperties = listProperties;
    }

}
