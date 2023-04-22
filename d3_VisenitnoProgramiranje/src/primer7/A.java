package primer7;

public class A extends Thread {

	public void run() {
		int i = 1;
		while (i <= 10) {
			System.out.println("i: " + i);

			// sleep(vrednostUMilisekundama) -> suspenzija niti na odredjeno vreme
			// sleep(milisekunde) privremeno zaustavlja (suspenduje) izvrsavanje niti
			// argument metode sleep() je interval cekanja u milisekundama
			// metoda sleep() u klasi Thread moze da izazove izuzetak InterruptedExceprion
			// desice se izuzetak ukoliko neka druga nit pozeli da prekine ovu suspendovanu
			// nit

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			i++;
		}
	}

}
