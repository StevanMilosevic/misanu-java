package zadatak8;

public class Tacka {
	private double x, y;
	
	Tacka(){}
	
	Tacka(double x){
		this.x = x;
	}
	Tacka(double x, double y){
		this.x = x;
		this.y = y;
	}
	public double poteg	() { // rastojanje od koordinatnog pocetka
		return Math.sqrt(x * x + y * y);
	}
	double Rastojanje(Tacka t) {	// rastojanje od zadate tacke
		return Math.sqrt(Math.pow(x - t.x, 2)) + Math.sqrt(Math.pow(y-t.y, 2));
	}
	

}
