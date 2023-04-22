package Zadatak1;

public class ZarubljenaKupa {
    private double r1;
    private double r2;
    private double h;

    ZarubljenaKupa(){
        this.r1 = 2;
        this.r2 = 1;
        this.h = 1;
    }
    ZarubljenaKupa(double r1, double r2, double h){
        this.r1 = r1;
        this.r2 = r2;
        this.h = h;
    }
    public double getR1() {
        return r1;
    }

    public double getR2() {
        return r2;
    }

    public double getH() {
        return h;
    }
    public double zapremina(){
        double V = 0;
        V = Math.PI * this.h * (this.r1 * this.r1 + this.r2 * this.r2 + this.r1 * this.r2) / 3;
        return V;
    }
    public boolean daLiJeManja(ZarubljenaKupa k){
        return this.zapremina() < k.zapremina();
    }
    // K(r1,r2,h).
    public String opis(){
        return "K(" + this.r1 + "," + this.r2 + "," + this.h + ")";
    }

}
