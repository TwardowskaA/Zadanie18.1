package a.t.prezentacjaproduktow;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProduktAddController {

    ProduktRepository produktRepository;

    public ProduktAddController(ProduktRepository produktRepository) {
        this.produktRepository = produktRepository;
    }

    @RequestMapping("/add")
    public String addProdukt(@RequestParam String nazwa,
                             @RequestParam Kategoria kategoria,
                             @RequestParam double cena) {

        Produkt produkt = new Produkt(nazwa, kategoria, cena);

       produktRepository.addProdukt(produkt);
       return "redirect:/lista";
    }
}
