package doyenify.sms.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testRestAPI {
    @GetMapping("/doyenify")
    public String helloWorld(){
    return "Welcome to Doyenify Academy!";
    }
}

