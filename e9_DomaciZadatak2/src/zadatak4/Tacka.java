package zadatak4;

import java.text.DecimalFormat;

// Материјална тачка у простору се задаје помоћу реалне масе (подразумевано 1) и три реалне координате
// (подразумевано (0,0,0)). Може да се одреди растојање (r) до друге тачке, да се израчуна привлачна сила
// између тачке и задате друге тачке (F=γ·m1·m2/r2, γ=6,67·10−11) и да се тачка испише на главном излазу.

public class Tacka {
	DecimalFormat df = new DecimalFormat("#.##");
	double realnaMasa, x, y, z;
	final double KONST = 6.67e-11;

	Tacka() {
		this.realnaMasa = 1;
		this.x = 0;
		this.y = 0;
		this.y = 0;
	}

	Tacka(double masa, double x, double y, double z) {
		this.realnaMasa = masa;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	// rastojanje r
	public double r(Tacka t) {
		return Math.sqrt(Math.pow(this.x - t.x, 2) + Math.pow(this.y - t.y, 2) + Math.pow(this.z - t.z, 2));
	}

	// privlacna sila F
	public double F(Tacka t) {
		return (KONST * realnaMasa * t.realnaMasa) / Math.pow(r(t), 2);
	}

	// ispis tacke
	public void opis() {
		System.out.println("[" + this.x + ", " + this.y + ", " + this.z + "] - realna masa: " + this.realnaMasa);
	}

}
