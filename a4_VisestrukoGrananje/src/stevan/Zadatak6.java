package stevan;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char operator;
        double x, y, z;
        System.out.print("Izaberite racunsku operaciju(+, -, *, /): ");
        operator = input.next().charAt(0);
        
        System.out.print("Unesite prvi broj: ");
        x = input.nextDouble();
        
        System.out.print("Unesite drugi broj: ");
        y = input.nextDouble();
        
        input.close();

        switch(operator){
            case '+':{
                z = x + y;
                System.out.println(z);
                break;
            }
            case '-':{
                z = x - y;
                System.out.println(z);
                break;
            }
            case '*':{
                z = x * y;
                System.out.println(z);
                break;
            }
            case '/':{
                z = x / y;
                System.out.println(z);
                break;
            }
            default:
                System.out.println("Greska");
        }
    }
}
