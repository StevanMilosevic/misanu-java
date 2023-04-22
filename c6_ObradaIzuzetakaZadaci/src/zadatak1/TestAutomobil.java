package zadatak1;

import java.io.IOException;

public class TestAutomobil {
	public static void main(String[] args) throws IOException {
		Automobil auto = new Automobil();

		auto.unetiProizvodjacaAutomobila();
		auto.unetiNazivAutomobila();
		auto.unetiGodisteAutomobila();
		auto.unetiPotrosnjuAutomobila();

		System.out.println(auto.toString());
	}
}
