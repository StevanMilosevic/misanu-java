package UUP;

import java.io.*;

public class Primer2 {
    public static void main(String[] args) throws Exception {
        double a, y;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Unesite vrednost za promenljivu a: ");
        a = Integer.parseInt(input.readLine());

        if(a % 2 != 0)
            y = 1 / a;
        else
            y = Math.pow(a-1, 2);
        System.out.println("y je: " + y);
    }
}
