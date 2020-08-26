package pl.patryk.bank.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping(value = "")
    public String getMainView() {
        return "tralala";
    }
}
