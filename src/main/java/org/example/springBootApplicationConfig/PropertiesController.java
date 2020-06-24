package org.example.springBootApplicationConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PropertiesController {


    @RequestMapping("/properties")
    public List controllerProperties(){

        List props = new ArrayList<String>();

        props.add("Erste Nachricht");
        props.add("Zweite Nachricht");
        props.add("Dritte Nachricht");

       return props;
    }

}
