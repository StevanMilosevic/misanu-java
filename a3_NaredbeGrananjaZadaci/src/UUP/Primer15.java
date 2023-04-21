package UUP;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Primer15 {
    public static void main(String[] args) {
        double x, y, f;
        DecimalFormat df = new DecimalFormat("#.##");
        Scanner input = new Scanner(System.in);
        System.out.print("Uneti vrednost za x: ");
        x = input.nextDouble();
        System.out.print("Uneti vrednost za y: ");
        y = input.nextDouble();

        if(x > y)
            f = Math.sqrt((x - 0.2) / (2 + y));
        else
            f = Math.sqrt((y - 0.2) / (2 + x));
        System.out.println(df.format(f));
        input.close();
    }
}
