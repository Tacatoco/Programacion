package COLECCIONES;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Listausuarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Usuario> Listausu = new ArrayList<>();
        boolean compwhile = false;

        while (!compwhile){
            System.out.println("AÑADIR USUARIO A LA COLA --> 1");
            System.out.println("ELIMINAR USUARIO DE CUALQUIER POSICIÓN --> 2");
            System.out.println("ELIMINAR PRIMER USUARIO DE LA COLA --> 3");
            System.out.println("MOSTRAR COLA --> 4");
            System.out.println("SALIR --> 5");
            int elecusu = scanner.nextInt();

            switch (elecusu){
                case 1:{
                    anadiralacola(Listausu);
                    break;
                }

                case 2:{
                    quitarcualquiera(Listausu);
                    break;
                }

                case 3:{
                    quitarprimero(Listausu);
                }

                case 4:{
                    mostrarcola(Listausu);
                    break;
                }

                case 5:{
                    compwhile = true;
                    System.out.println("ADIOS...");
                    break;
                }

                default:{
                    System.out.println("VALOR NO VÁLIDO");
                }
            }
        }
    }

    public static void anadiralacola(List<Usuario> Listausu){
        Scanner scanner = new Scanner(System.in);
        System.out.println("NOMBRE DE LA NUEVA PERSONA...");
        String nombreusu = scanner.next();
       nombreusu = nombreusu.toUpperCase();
        System.out.println("EDAD DE LA NUEVA PERSONA...");
        int edadusu = scanner.nextInt();
        System.out.println("DNI DE LA NUEVA PERSONA...");
        System.out.println();
        String DNIusu = scanner.next();
        Usuario manueh = new Usuario(nombreusu, edadusu, DNIusu);

        Listausu.add(manueh);
    }

    public static void quitarprimero(List<Usuario> Listausu){
        System.out.println("QUITANDO AL PRIMERO DE LA COLA...");
        System.out.println();
        Listausu.remove(0);
    }

    public static void quitarcualquiera(List<Usuario> Listausu){
        Scanner scanner = new Scanner(System.in);
        System.out.println("POSICION QUE QUIERA REMOVERSE DE LA FILA...");
        System.out.println();
        int elecusu = scanner.nextInt();
        Listausu.remove(elecusu);
        if (elecusu > Listausu.size()){
            System.out.println("POSICIÓN NO VALIDA");
        }
    }

    public static void mostrarcola (List<Usuario> Listausu){
        for (Usuario manueh: Listausu){
            System.out.println("NOMBRE: " + manueh.getNombre());
            System.out.println("EDAD: " + manueh.getEdad());
            System.out.println("DNI: " + manueh.getDNI());
        }
    }

}
