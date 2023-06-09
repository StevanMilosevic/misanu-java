package UUP;

import java.util.Scanner;

public class HoroskopSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite mesec rodjenja: ");
        String mesec = input.nextLine().toLowerCase();

        System.out.println("Unesite dan rodjenja: ");
        int dan = input.nextInt();
        input.close();

        if(dan >=1 && dan <= 31) {
            switch (mesec) {
                case "januar":
                    if (dan <= 20) System.out.println("Jarac");
                    else System.out.println("Vodolija");
                    break;
                case "februar":
                    if(dan <= 19) System.out.println("Vodolija");
                    else System.out.println("Ribe");
                    break;
                case "mart":
                    if(dan <= 20) System.out.println("Ribe");
                    else System.out.println("Ovan");
                    break;
                case "april":
                    if(dan <= 20) System.out.println("Ovan");
                    else System.out.println("Bik");
                    break;
                case "maj":
                    if(dan >= 21) System.out.println("Bik");
                    else System.out.println("Blizanci");
                    break;
                case "jun":
                    if(dan >= 21) System.out.println("Blizanci");
                    else System.out.println("Rak");
                    break;
                case "jul":
                    if(dan <= 22) System.out.println("Rak");
                    else System.out.println("Lav");
                    break;
                case "avgust":
                    if(dan <= 22) System.out.println("Lav");
                    else System.out.println("Devica");
                    break;
                case "septembar":
                    if(dan <= 22) System.out.println("Devica");
                    else System.out.println("Vaga");
                    break;
                case "oktobar":
                    if(dan <= 23) System.out.println("Vaga");
                    else System.out.println("Skorpija");
                    break;
                case "novembar":
                    if(dan <= 24) System.out.println("Skorpija");
                    else System.out.println("Strelac");
                    break;
                case "decembar":
                    if(dan <= 23) System.out.println("Strelac");
                    else System.out.println("Jarac");
                    break;
                default:
                    System.out.println("Pogresno ste uneli naziv meseca");
            }
        } else System.out.println("Niste dobro uneli dan rodjenja, vrednosti su od 1 do 31");
    }
}
