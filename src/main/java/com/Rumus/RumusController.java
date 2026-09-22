package com.Rumus;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RumusController {

    @GetMapping("/rumus")
    public String hitung(
            @RequestParam(name = "panjang", required = false) Integer panjang,
            @RequestParam(name = "lebar", required = false) Integer lebar,
            Model model) {

        if (panjang != null && lebar != null) {
            boolean isValid = Rumus.validatePersegi(panjang, lebar);

            model.addAttribute("panjang", panjang);
            model.addAttribute("lebar", lebar);
            model.addAttribute("isValid", isValid);
        }

        return "Rumus";
    }
}