package Zadatak1;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        ZarubljenaKupa k1 = new ZarubljenaKupa();
        ZarubljenaKupa k2 = new ZarubljenaKupa(2.4, 3.1, 4.8);
        ZarubljenaKupa k3 = new ZarubljenaKupa(1.7, 1.4, 2.2);
        ZarubljenaKupa k4 = new ZarubljenaKupa(0.7, 0.6, 0.9);

        Niz niz = new Niz();
        niz.niz[2] = k1;
        niz.niz[1] = k4;

        niz.dodajKupu(k2);
        niz.dodajKupu(k3);

        try {
            File f = new File("zarubljene_kupe.txt");
            if (f.createNewFile()) {
                System.out.println("Kreiran je fajl: " + f.getName());
            } else {
                System.out.println("Fajl vec postoji (" + f.getName() + ")");
            }
        } catch (IOException e) {
            System.out.println("Greska!");
            e.printStackTrace();
        }
        
        niz.upisUFajl("zarubljene_kupe.txt");

        System.out.println("U fajlu ZARUBLJENE_KUPE.TXT je zapisano: ");
        niz.ucitaj();
    }
}