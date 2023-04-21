package UUP;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int broj;
        System.out.println("unesite broj");
        broj = input.nextInt();

        input.close();
        
        if(broj > 0){
            System.out.print("broj je pozitivan");
        } else if(broj < 0){
            System.out.print("broj je negativan");
        } else if(broj == 0){
            System.out.println("uneti broj je nula");
        } else System.out.println("pogresan unos!");
    }
}
