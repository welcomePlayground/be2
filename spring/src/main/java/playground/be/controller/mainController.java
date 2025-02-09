package playground.be.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mainController {

    @GetMapping("/")
    public String main() {
        return "second main Controller is called1111";
    }
}
