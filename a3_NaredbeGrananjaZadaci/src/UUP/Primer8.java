package UUP;

import java.io.*;

public class Primer8 {
    public static void main(String[] args)throws Exception {
        double a, b, c;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Unesite vrednost promenljive a: ");
        a = Double.parseDouble(input.readLine());

        System.out.print("Unesite vrednost promenljive b: ");
        b = Double.parseDouble(input.readLine());

        if((a % 2 != 0) & (b % 2 == 0))
            c = a + b;
        else
            c = a * b;
        System.out.println("c je: " + c);

    }
}
