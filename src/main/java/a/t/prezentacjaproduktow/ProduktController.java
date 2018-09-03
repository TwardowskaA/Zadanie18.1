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
    public String allProducts(){
        String result = "";
        double cena = 0;
        List<Produkt> produktList = new ArrayList<>(produktRepository.getProducts());

        for (Produkt produkt : produktList) {
            result+= produkt.toString() + "<br>";
        }

        for (Produkt produkt : produktList) {
            cena = cena + produkt.getCena();
        }

        return result + "<br>" + "Wartość listy: " + cena;
    }

    @GetMapping("/spozywcze")
    @ResponseBody
    public String spozywcze(@RequestParam(value="ART_SPOZYWCZE") Kategoria kategoria){
        String result = "";

        List<Produkt> produktList = new ArrayList<>(produktRepository.getProducts());
       for(Produkt produkt1 : produktList){
           if(produkt1.getKategoria().equals(produktRepository.getProducts()))
               result += produkt1 + "<br>";

       }
        return result;
    }

    @GetMapping("/domowe")
    @ResponseBody
    public String domowe(@RequestParam(value="ART_GOSP_DOMOWEGO") Kategoria kategoria){
        String result = "";
        List<Produkt> produktList = new ArrayList<>(produktRepository.getProducts());
        for(Produkt produkt2 : produktList){
            if(produkt2.getKategoria().equals(kategoria))
                result += produkt2 + "<br>";
        }
        return result;
    }



    @GetMapping("/inne")
    @ResponseBody
    public String inne(@RequestParam(value="INNE") Kategoria kategoria){
        String result = "";
        List<Produkt> produktList = new ArrayList<>(produktRepository.getProducts());
        for(Produkt produkt3 : produktList){
            if(produkt3.getKategoria().equals(kategoria))
                result += produkt3 + "<br>";
        }
        return result;
    }


}
