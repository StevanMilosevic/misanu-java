package UUP;

import java.util.Scanner;

public class Zadatak1 {
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          System.out.print("Unesite x: ");
          char x = sc.next().charAt(0);

          if (x >= 'a' && x <= 'z'){
              System.out.println("uneti karakter  je malo slovo"); }
          else if(x >= 'A' && x <= 'Z'){
              System.out.println("uneti karakter je veliko slovo"); }
          else if(x >= '0' && x < '9'){
              System.out.println("Uneti karakter je cifra"); }
          else System.out.println("uneti karakter je specijalni simbol");
          sc.close();

      }
}