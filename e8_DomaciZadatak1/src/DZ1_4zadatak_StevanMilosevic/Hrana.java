package DZ1_4zadatak_StevanMilosevic;

/*
 Hrana je namirnica koja se zadaje težinom date namernice izraženom u gramima (realan broj)
 i procentualnim udelom belančevina, masti i ugljenih hidrata (realni brojevi) u ukupnoj težini.
 Mogu da se dohvate težinski udeo belančevina, masti i ugljenih hidrata i ukupna težina.
 Energetska vrednost 1g belančevina iznosi 16,7kJ, masti 37,6kJ, a ugljenih hidrata 17,2kJ.
 Tekstualni opis je ime_hrane[id](težina,energetska_vrednost).
 Greška je ako zbir procentualnih udela belančevina, masti i ugljenih hidrata prelazi 100%.
 */
public class Hrana extends Namirnica {
    String ime;
    int identifikator;
    double tezina;
    double belancevine;
    double masti;
    double ugHidrati;

    Hrana(String ime, double t, double b, double m, double u){
        this.ime = ime;
        this.identifikator = 1;
        this.tezina = t;
        this.belancevine = ((b / t) * 100) * 16.7;
        this.masti = ((m / t) * 100) * 37.6;
        this.ugHidrati = ((u / t) * 100) * 17.2;
    }
    public String getIme() {
    	return this.ime;
    }
    public int getIdentifikator() {
    	return this.identifikator;
    }
    public double energetskaVrednost(){
        return (this.belancevine + this.masti + this.ugHidrati);
    }
    public void opis(){
        System.out.println(this.getIme() + "[" + this.getIdentifikator() + "] ("+this.tezina+","+this.energetskaVrednost()+")");
    }
}
