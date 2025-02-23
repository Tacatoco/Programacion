package OBJETOS3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mainficha {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        List<Ficha> Listafichas = new ArrayList<>();
        boolean compwhile = false;

        while (!compwhile) {
            System.out.println("PARA CREAR ALGO --> 1");
            System.out.println("PARA SALIR --> 2");
            int elecusu = sc.nextInt();

            switch (elecusu) {
                case 1: {
                    crearcosa(Listafichas);
                    break;
                }

                case 2: {
                    compwhile = true;
                    break;
                }

            }
        }
    }



    public static void crearcosa(List<Ficha> Listafichas){
        System.out.println("QUE QUIERES CREAR: DVD, REVISTA O LIBRO");
        String elecusu = sc.next().trim().toUpperCase();

        switch (elecusu){

            case "DVD":{
                System.out.println("NUMERO DE DVD");
                int numerousu = sc.nextInt();
                System.out.println("TITULO DEL DVD");
                String titulousu = sc.next().toUpperCase().trim();
                System.out.println("TIPO DEL DVD");
                int tipousu = sc.nextInt();
                System.out.println("AÑO DEL DVD");
                int aniousu = sc.nextInt();
                System.out.println("DIRECTOR DEL DVD");
                String direcusu = sc.next();
                DVDs dvd = new DVDs(numerousu,titulousu,tipousu,aniousu,direcusu);
                Listafichas.add(dvd);
                dvd.sabertitulo();
                dvd.sabernumero();
                dvd.queAnio();
                dvd.queTipo();
                dvd.queDirector();
                break;
            }
            case "REVISTA":{
                System.out.println("NUMERO DE REVISTA");
                int numerousu = sc.nextInt();
                System.out.println("TITULO DE LA REVISTA");
                String titulousu = sc.next().toUpperCase().trim();
                System.out.println("NUMERO DE PUBLICACION");
                int numpubliusu = sc.nextInt();
                System.out.println("AÑO DE LA REVISTA");
                int aniousu = sc.nextInt();
                Revistas revista = new Revistas(numerousu,titulousu,numpubliusu,aniousu);
                Listafichas.add(revista);
                revista.sabertitulo();
                revista.sabernumero();
                revista.quenumpubli();
                revista.queanio();
                break;
            }
            case "LIBRO":{
                System.out.println("NUMERO DE LIBRO");
                int numerousu = sc.nextInt();
                System.out.println("TITULO DEL LIBRO");
                String titulousu = sc.next().toUpperCase().trim();
                System.out.println("AUTOR DEL LIBRO");
                String autorusu = sc.next();
                System.out.println("EDITORIAL DEL LIBRO");
                String editorialusu = sc.next();
                Libros libro = new Libros(numerousu, titulousu, autorusu, editorialusu);
                Listafichas.add(libro);
                libro.sabertitulo();
                libro.sabernumero();
                libro.queautor();
                libro.queeditorial();
                break;
            }
        }
    }



}
