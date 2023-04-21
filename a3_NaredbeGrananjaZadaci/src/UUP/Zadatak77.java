package UUP;

import java.util.Scanner;

public class Zadatak77 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dan, mesec, godina;

        System.out.print("Unesite dan: ");
        dan = input.nextInt();

        System.out.print("Unesite mesec: ");
        mesec = input.nextInt();

        System.out.print("Unesite godinu: ");
        godina = input.nextInt();
        
        input.close();

        switch(mesec) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                {
                    if(dan+7 <= 31) {
                        System.out.println((dan+7)+ "."+mesec+"."+godina);
                    } else {
                        System.out.println(((dan + 7) - 31) + "." + (mesec + 1) + "." + godina);
                    }
                    break;
                }
            case 2:
                 if(godina % 4 == 0){
                     if(dan+7 <= 29) {
                            System.out.println((dan+7)+ "."+mesec+"."+godina);
                     } else {
                            System.out.println(((dan+7)-29) + "."+(mesec+1) + "."+godina);
                    }
                 } else if(dan+7 <= 28) {
                        System.out.println((dan+7)+ "."+mesec+"."+godina);
                    } else {
                        System.out.println(((dan+7)-28) + "."+(mesec+1) + "."+godina);
                    }
                    break;
            case 4:
            case 6:
            case 9:
            case 11:
                    if(dan+7 <= 30) {
                        System.out.println((dan+7)+ "."+mesec+"."+godina);
                    }else {
                        System.out.println(((dan+7)-30) + "."+(mesec+1) + "."+godina);
                    }
                    break;
            case 12:
                    if(dan+7 <= 31) {
                        System.out.println((dan+7)+ "."+mesec+"."+godina);
                    }else {
                        System.out.println(((dan+7)-31) + "."+(mesec-11) + "."+(godina+1));
                    }
                    break;
            default:
                    System.out.println("Greska");
            }
    }
}