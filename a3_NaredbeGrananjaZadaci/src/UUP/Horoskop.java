package UUP;

import java.util.Scanner;

public class Horoskop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Napisite mesec rodjenja: ");
        String mesec = input.nextLine().toLowerCase();

        System.out.print("Unesite dan rodjenja: ");
        int dan = input.nextInt();
        input.close();

        /*
            Ovan – od 21. marta do 20. aprila;
			Bik – od 21. aprila do 21. maja;
			Blizanci – od 22. maja do 21. juna;
			Rak – od 22. juna do 22. jula;
			Lav – od 23. jula do 22. avgusta;
			Devica – od 23. avgusta do 22. septembra;
			Vaga – od 23. septembra do 23.oktobra;
			Škorpija – od 24. oktobra do 22. novembra;
			Strelac – od 23. novembra do 21. decembra;
			Jarac – od 22. decembra do 20. januara;
			Vodolija – od 21. januara do 19. februara;
			Ribe – od 20. februara do 20. marta;        */

        if(mesec.equals("april")){
            if(dan <= 20) System.out.println("Ovan");
                else System.out.println("Bik");
        }
        if(mesec.equals("maj")){
            if(dan >= 21) System.out.println("Bik");
            else System.out.println("Blizanci");
        }
        if(mesec.equals("jun")){
            if(dan >= 21) System.out.println("Blizanci");
            else System.out.println("Rak");
        }
        if(mesec.equals("jul")){
            if(dan <= 22) System.out.println("Rak");
            else System.out.println("Lav");
        }
        if(mesec.equals("avgust")){
            if(dan <= 22) System.out.println("Lav");
            else System.out.println("Devica");
        }
        if(mesec.equals("septembar")){
            if(dan <= 22) System.out.println("Devica");
            else System.out.println("Vaga");
        }
        if(mesec.equals("oktobar")){
            if(dan <= 23) System.out.println("Vaga");
            else System.out.println("Skorpija");
        }
        if(mesec.equals("novembar")){
            if(dan <= 24) System.out.println("Skorpija");
            else System.out.println("Strelac");
        }
        if(mesec.equals("decembar")){
            if(dan <= 23) System.out.println("Strelac");
            else System.out.println("Jarac");
        }
        if(mesec.equals("januar")){
            if(dan <= 20) System.out.println("Jarac");
            else System.out.println("Vodolija");
        }
        if(mesec.equals("februar")){
            if(dan <= 19) System.out.println("Vodolija");
            else System.out.println("Ribe");
        }
        if(mesec.equals("mart")){
            if(dan <= 20) System.out.println("Ribe");
            else System.out.println("Ovan");
        }
    }
}
