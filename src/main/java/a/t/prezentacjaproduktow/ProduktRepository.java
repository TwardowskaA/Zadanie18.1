package a.t.prezentacjaproduktow;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class ProduktRepository {

    private Kategoria kategoria;
    private List<Produkt> products = new ArrayList<>();

    public ProduktRepository() {
        products.add(new Produkt("Cukier", Kategoria.ART_SPOZYWCZE, 1.79));
        products.add(new Produkt("Dżem", Kategoria.ART_SPOZYWCZE, 5.79));
        products.add(new Produkt("Ryż", Kategoria.ART_SPOZYWCZE, 3.29));
        products.add(new Produkt("Olej", Kategoria.ART_SPOZYWCZE, 5.49));
        products.add(new Produkt("Szklanka", Kategoria.ART_GOSP_DOMOWEGO, 2.50));
        products.add(new Produkt("Koszyk", Kategoria.ART_GOSP_DOMOWEGO, 14.00));
        products.add(new Produkt("Miotła", Kategoria.ART_GOSP_DOMOWEGO, 31.90));
        products.add(new Produkt("Szczotka", Kategoria.ART_GOSP_DOMOWEGO, 2.79));
        products.add(new Produkt("Wentylator", Kategoria.INNE, 237.00));
        products.add(new Produkt("Odkurzacz", Kategoria.INNE, 498.00));
        products.add(new Produkt("Klimatyzator", Kategoria.INNE, 178.99));
        products.add(new Produkt("Żelazko", Kategoria.INNE, 199.99));
    }

    public List<Produkt> getProducts() {
        Collections.shuffle(products);
        return products;
    }


    public void addProdukt(Produkt produkt) {
        products.add(produkt);
    }

}
