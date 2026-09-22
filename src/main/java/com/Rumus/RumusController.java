package com.Rumus;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RumusController {

    @GetMapping("/rumus")
    public String index(Model model) {
        model.addAttribute("luas", 50);
        model.addAttribute("keliling", 30);
        model.addAttribute("isPersegi", false);
        
        return "Rumus"; // Memanggil /WEB-INF/jsp/Rumus.jsp
    }
}