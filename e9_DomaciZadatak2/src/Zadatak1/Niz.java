package Zadatak1;

// Низ зарубљених купа може да садржи задати број (подразумевано 5) купа. Низ се ствара празан,
// после чега се купе могу додавати иза последњег попуњеног места, док се низ не напуни
// (ако се низ препуни, програм се прекида). Може да се дохвата капацитет низа, број попуњених места
// и може да се испита да ли је низ попуњен до краја. Купе садржане у низу могу да се дохватају и да се
// проналази индекс купе најмање запремине

import java.io.*;

public class Niz {
    ZarubljenaKupa[] niz;
    private int kapacitet = 5;

    Niz(){
        niz = new ZarubljenaKupa[kapacitet];
    }
    Niz(int kapacitet){
        this.kapacitet = kapacitet;
        niz = new ZarubljenaKupa[kapacitet];
    }
    public int getKapacitetNiza(){
        return this.kapacitet;
    }
    public int poslednjeZauzetoMesto(){
        int indeks = 0;
        for(int i = 0; i < niz.length; i++){
            if(niz[i] != null)
                indeks = i;
        }
        return indeks;
    }
    public boolean dodajKupu(ZarubljenaKupa k){
        int indeks = this.poslednjeZauzetoMesto() + 1;
        if(indeks <= niz.length) {
            dodajKupuNaMesto(indeks, k);
            System.out.println("Uspesno je dodata kupa u niz!");
            return true;
        }
        if(indeks > niz.length) {
            System.out.println("Niz je ispunjen, kupa nije ubacena u njega!");
            return false;
        }
        return false;
    }
    public void dodajKupuNaMesto(int indeks, ZarubljenaKupa k){
        this.niz[indeks] = k;
    }
    public int getDuzinaNiza(){
        return this.niz.length;
    }
    // ispitivanje broj popunjenih mesta
    public int brojPopunjenihMesta(){
        int broj = 0;
        for(int i = 0; i < niz.length; i++){
            if(niz[i] != null)
                broj++;
        }
        return broj;
    }
    // ли је низ попуњен до краја
    public void daLiJePopunjenDoKraja() {
        if (niz.length == this.poslednjeZauzetoMesto()) {
            System.out.println("Niz je popunjen do kraja!");
        }
        if (niz.length > this.poslednjeZauzetoMesto()) {
            System.out.println("U niz se mogu ubaciti jos " + (niz.length - poslednjeZauzetoMesto()) + " zarubljene kupe");
        }
    }
    // indeks kupe sa najmanjom zapreminom, ukoliko ispitujemo prazan niz, vratice se -1
    public int najmanjaZapremina(){
        int indeks = -1;
        double zapremina = 0;
        if(brojPopunjenihMesta() > 0){
            indeks = poslednjeZauzetoMesto();
            zapremina = niz[indeks].zapremina();
            for(int i = 0; i < niz.length; i++){
                if(niz[i] != null){
                    if(zapremina > niz[i].zapremina()){
                        indeks = i;
                    }
                }
            }
        }
        return indeks;
    }
    public void upisUFajl(String imeDatoteke){
        try (FileWriter fajl = new FileWriter(imeDatoteke);
             BufferedWriter info = new BufferedWriter(fajl)) {
            for (int i = 0; i < niz.length; i++) {
                if(niz[i] != null)
                    info.write(niz[i].opis() + "\n");
            }
            System.out.println("Uspesno su upisane kupe u fajl!");
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
    public void ucitaj(){
        BufferedReader reader;

        try {
            reader = new BufferedReader(new FileReader("zarubljene_kupe.txt"));
            String line = reader.readLine();

            while (line != null) {
                System.out.println(line);
                // read next line
                line = reader.readLine();
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
