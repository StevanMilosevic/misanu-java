package DZ1_4zadatak_StevanMilosevic;

import java.text.DecimalFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    	DecimalFormat df = new DecimalFormat("#.##");

        Hrana brokoli = new Hrana("Brokoli", 120, 2.8, 0.4, 6.6);
        Hrana pile = new Hrana("meso", 250, 22.5, 2.62, 0);
        Pice mleko = new Pice("Mleko", 300, 45);
        Hrana kikiriki = new Hrana("Kikiriki", 150, 29.5, 49.4, 10.2);

        List<Object> meni = new ArrayList<>();
        meni.add(brokoli);
        meni.add(pile);
        meni.add(mleko);
        meni.add(kikiriki);
        
        double ukupnaEnergVrednost = 0;

        for (Object obj : meni) {
        	double energHrana = 0;
        	double energPice = 0;
            if (obj.getClass() == Hrana.class) {
                Hrana hrana = (Hrana) obj;
                energHrana += hrana.energetskaVrednost(); 
            }
            if (obj.getClass() == Pice.class) {
            	Pice pice = (Pice) obj;
                energPice += pice.energVrednost; 	
            }
            ukupnaEnergVrednost = energHrana + energPice;
        }
        System.out.println("Ukupna energetska vrednost menija je: " + df.format(ukupnaEnergVrednost) + " kJ");
    }
}