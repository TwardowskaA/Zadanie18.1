package a.t.prezentacjaproduktow;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public String allProducts(){
        String result = "";
        double price = 0;
        List<Produkt> produktList = produktRepository.getProducts();

        for (int i = 0; i < produktList.size(); i++) {
            price = price + produktRepository.getPrice();
        }

        for (Produkt produkt : produktList) {
            result+= produkt.toString() + "<br>";
        }
        return result + "<br>" + price;
    }
    @GetMapping("/spozywcze")
    @ResponseBody
    public String spozywcze(){
        String result = "";
        List<Produkt> produktList = produktRepository.getProducts();

        List<Produkt> spozywcze = new ArrayList<>();
        while(produktList.contains(Kategoria.ART_SPOZYWCZE)){
            for (Produkt produkt : spozywcze) {
                result+= produkt.toString() + "<br>";
            }
        }
        return result;
    }
}
