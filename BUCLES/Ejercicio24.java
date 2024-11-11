package src.BUCLES;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {

      int Aprovados = 0;
      int Suspendidos = 0;
      boolean entrar=true;

      Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce las notas, para calcular la cantidad de suspendidos y aprovados introduce un 20");


      while (entrar) {

          double Notausu = scanner.nextDouble();

          if (Notausu == 20){

              System.out.println("La cantidad de aprovados es: " + Aprovados + "y la cantidad de suspendidos es: " + Suspendidos);
              entrar=false;
          }

          else if (Notausu < 0 || Notausu > 10) {

              System.out.println("Introduce una nota válida");

          }

          else if (Notausu >= 5){

              Aprovados++;

          }
            else {

                Suspendidos++;

          }
      }

    }
}