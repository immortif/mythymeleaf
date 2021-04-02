package ecom.mbc.mythymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @RequestMapping(value = "/index")
    public String index(Model model) {
        model.addAttribute("name", "Thymeleaf-changed!");
        return "index";
    }
}
