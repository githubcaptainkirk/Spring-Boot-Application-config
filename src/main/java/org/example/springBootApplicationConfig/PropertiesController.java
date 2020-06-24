package org.example.springBootApplicationConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertiesController {

    @Autowired
    private NewProperties props;

    @RequestMapping("/properties")
    public String controllerProperties(){
       return props.getTestProperties();
    }

}
