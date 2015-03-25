package ru.mercuriev.perdash;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @Autowired
    KinopoiskRepository kinopoiskRepository;

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("kino", kinopoiskRepository);
        return "index";
    }

}