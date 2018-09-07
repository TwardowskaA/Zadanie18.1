package a.t.prezentacjaproduktow;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProduktController {

    private ProduktRepository produktRepository;

    public ProduktController(ProduktRepository produktRepository) {
        this.produktRepository = produktRepository;
    }

    @GetMapping("/lista")
    @ResponseBody
    public String allProducts(@RequestParam(value = "kategoria", required = false) Kategoria kategoria) {
        String result = "";
        double cena = 0;
        List<Produkt> produktList = new ArrayList<>(produktRepository.getProducts());

        for (Produkt produkt : produktList) {
            if (kategoria == null || produkt.getKategoria() == kategoria)
                result += produkt.toString() + "<br>";
                cena += produkt.getCena();
        }

        return result + "<br>" + "Wartość listy: " + cena;
    }

}
