package zadatak7;

// Apsolutna vrednost negativnog broja je pozitivan broj, apsolutna vrednost pozitivnog 
// broja je pozitivan broj, apsolutna vrednost nule je nula, |0|=0. 
// Napisati program koji za unetu vrednost ispisuje njegovu apsolutnu vrednost. 
// Kreirati UML diagram za zadatu klasu.

public class ApsolutnaVrednost {
	public int x;
	
	public int apsolutna(int x) {
		if(x < 0)
			return x * -1;
		else
			return x;
	}

}
