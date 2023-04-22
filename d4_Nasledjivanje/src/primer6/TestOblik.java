package primer6;

import java.util.Stack;

public class TestOblik {
	public static void main(String[] args) {
		Krug krug = new Krug(1);
		Pravougaonik pravougaonik = new Pravougaonik(4, 5);
		Stack stek = new Stack();
		stek.push(krug);
		stek.push(pravougaonik);
		while (!stek.empty()) {
			Oblik oblik = (Oblik) stek.pop();
			System.out.println("Površina je " + oblik.uzmiPovrsinu());
		}
	}
}

/*
 * public class TestOblik { public static void main(String[] args) { Krug k =
 * new Krug(1); System.out.println("Površina kruga je " + k.uzmiPovrsinu());
 * 
 * Pravougaonik p = new Pravougaonik(4, 5);
 * System.out.println("Površina pravougaonika je " + p.uzmiPovrsinu()); } }
 */