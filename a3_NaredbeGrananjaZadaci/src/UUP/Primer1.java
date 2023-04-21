package UUP;

import java.io.*;

public class Primer1 {
    public static void main(String[] args) throws Exception {
        double x, y;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Unesite vrednost x: ");
        x = Double.parseDouble(input.readLine());

        y = (x >= 0)? x : -x;

        System.out.println("Vrednost y je: " + y);
    }
}
