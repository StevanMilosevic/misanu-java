package zadatak3;

public class Main {
    public static void main(String[] args) {
        // 4 zgrade
        StambenaZgrada broj1 = new StambenaZgrada(500, 4, 5);
        StambenaZgrada broj2 = new StambenaZgrada(1100, 5, 7);
        StambenaZgrada broj3 = new StambenaZgrada(700, 6, 5);
        StambenaZgrada broj4 = new StambenaZgrada(400, 3, 4);

        // 2 ulice, svaka ima po dve zgrade
        Ulica ulica1 = new Ulica("Glavna", 1000, 8);
        Ulica ulica2 = new Ulica("Sporedna", 1000, 8);
        ulica1.dodajZgradu(1, broj1);
        ulica1.dodajZgradu(2, broj2);
        ulica2.dodajZgradu(1, broj3);
        ulica2.dodajZgradu(2, broj4);

        // 1 naselje
        Naselje naselje = new Naselje(2);
        naselje.dodajUlicu(1, ulica1);
        naselje.dodajUlicu(2, ulica2);

        // ispis naselja
        System.out.println(naselje.ispisiNaselje());
    }
}
