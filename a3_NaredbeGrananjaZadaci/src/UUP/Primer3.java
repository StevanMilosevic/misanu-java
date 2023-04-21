package UUP;

import java.io.*;

public class Primer3 {
    public static void main(String[] args) throws Exception {
        int a, b, y;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Unesite promenljivu a: ");
        a = Integer.parseInt(input.readLine());

        System.out.print("Unesite promenljivu b: ");
        b = Integer.parseInt(input.readLine());

        if(a >= 0)
            y = Math.min(a, b);
        else y = 2 * Math.min(a, b);
        // ternarni operator
        // y = (a >= 0) ? Math.min(a, b) : 2 * Math.min(a, b);
        System.out.println("Vrednost y je: " + y);
    }
}
