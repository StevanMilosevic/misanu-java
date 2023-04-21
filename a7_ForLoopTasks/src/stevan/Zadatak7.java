package stevan;

// Napisati program kojim se za date prirodne brojeve m i n, izračunava:
//  S = n*(n+m)*(n+2m)*(n+3m)...*(n+m*m)

import java.io.*;

public class Zadatak7 {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Unesite prvi broj: ");
        int m = Integer.parseInt(input.readLine());
        System.out.print("Unesite drugi broj: ");
        int n = Integer.parseInt(input.readLine());
        int S = n;

        for(int i = 1; i <= m; i++){
            S *=  n + i * m;
        }
        System.out.println("Vrednost funkcije S je: " + S);
    }
}
