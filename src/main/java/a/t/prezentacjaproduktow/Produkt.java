package a.t.prezentacjaproduktow;

public class Produkt {
    private String nazwa;
    private Kategoria kategoria;
    private double cena;

    public Produkt(String nazwa, Kategoria kategoria, double cena) {
        this.nazwa = nazwa;
        this.kategoria = kategoria;
        this.cena = cena;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Kategoria getKategoria() {
        return kategoria;
    }

    public void setKategoria(Kategoria kategoria) {
        this.kategoria = kategoria;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return  "Nazwa: " + nazwa + " " + "Kategoria: " + kategoria + " " + "Cena: " + cena;
    }
}
