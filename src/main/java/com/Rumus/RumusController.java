package com.Rumus;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RumusController {

    @GetMapping("/hitung")
    public String hitungPersegi(
            @RequestParam(defaultValue = "5") int panjang,
            @RequestParam(defaultValue = "5") int lebar,
            Model model) {

        // Memanggil method logic dari class Rumus
        boolean valid = Rumus.validatePersegi(panjang, lebar);

        // Mengirimkan data hasil ke file JSP
        model.addAttribute("isValid", valid);

        // Mengarahkan ke file WEB-INF/jsp/rumus.jsp
        return "rumus";
    }
}