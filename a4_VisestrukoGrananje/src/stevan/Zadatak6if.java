package stevan;

import java.util.Scanner;

public class Zadatak6if {
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

        if(operator == '+'){
            z = x + y;
            System.out.println(z);
        } else if(operator == '-'){
            z = x - y;
            System.out.println(z);
        } else if(operator == '*'){
            z = x * y;
            System.out.println(z);
        } else if(operator == '/'){
            z = x / y;
            System.out.println(z);
        } else System.out.println("greska");
    }
}
