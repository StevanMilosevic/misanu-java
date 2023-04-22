package zadatak2;

// Студент има име (текст произвољне дужине), број индекса (дугачак цео број по шеми ggggrrrr,
// где су g и r цифре године уписа и регистарског броја) и низ испита задатог капацитета (подразумевано 40).
// Ствара се без иједног испита после чега испити могу да се додају један по један.
// Повратна вредност при додавању испита показује успех додавања (тј. да ли је било места у низу испита).
// Не сме да се прави копија студента. Може да се израчуна средња вредност оцена положених испита и да се
// студент испише на главном излазу у облику "име[годУп/регБр:срОцена]".

import java.text.DecimalFormat;

public class Student {
	DecimalFormat df = new DecimalFormat("#.#");
	private String ime;
	private String brojIndeksa;
	Ispit[] ispiti;

	Student(String ime, String brojIndeksa) {
		this.ime = ime;
		this.brojIndeksa = brojIndeksa;
		ispiti = new Ispit[40];
	}

	public String getIme() {
		return this.ime;
	}

	public String getBrIndeksa() {
		return this.brojIndeksa;
	}

	public void dodajIspit(Ispit i) {
		int brojac = 0;

		for (int j = 0; j < ispiti.length; j++) {
			if (ispiti[j] != null)
				brojac++;
		}
		// ovde ispitujemo da li je niz pun
		if (brojac >= 40) {
			System.out.println("Student ima upisanih 40 ispita!");
		} else {
			ispiti[brojac] = i;
		}
	}

	public double prosecnaOcena() {
		double prosek;
		int brojac = 0, zbir = 0;
		for (int i = 0; i < ispiti.length; i++) {
			if (ispiti[i] != null) {
				zbir += ispiti[i].getOcena();
				brojac++;
			}
		}
		prosek = (double) zbir / brojac;
		return prosek;
	}

	// име[годУп/регБр:срОцена]
	public String toString() {
		return this.getIme() + "[" + getBrIndeksa() + ":" + df.format(prosecnaOcena()) + "]";
	}
}
