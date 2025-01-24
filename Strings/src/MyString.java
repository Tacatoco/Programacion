import java.util.Scanner;

public class MyString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INTRODUCE UNA OPCION");
        int elecusu = scanner.nextInt();

        switch (elecusu){
            case 1:{
                String ejer1 = funcion1();
                System.out.println(ejer1);
            }

            case 2:{
                int contador = funcion2();
                System.out.println("LA CADENA DE TEXTO TENÍA " + contador + " VOCALES");
            }

            case 3:{
                String mayor = funcion3();
                System.out.println("LA PALABRA MÁS GRANDE ES: " + mayor);
            }

            case 4:{
                int contador = funcion4();
                System.out.println("LA SEGUNDA CADENA DE TEXTO SE REPITE " + contador + " VECES EN LA PRIMERA");
            }

            case 5:{
                int contadorpalabras = funcion5();
                System.out.println("LA CADENA DE TEXTO CONTIENE " + contadorpalabras + " PALABRAS");
            }

            case 6:{
                String numeroformateaoh = funcion6();
                System.out.println("EL NUMERO FORMATEADO ES:" + numeroformateaoh);
            }

            case 7:{
                int[] contadores;
                contadores = funcion7();

                System.out.println("LA CADENA DE TEXTO ENLAZADA TIENE:");
                System.out.println("CANTIDAD DE A: " + contadores[0]);
                System.out.println("CANTIDAD DE E: " + contadores[1]);
                System.out.println("CANTIDAD DE I: " + contadores[2]);
                System.out.println("CANTIDAD DE O: " + contadores[3]);
                System.out.println("CANTIDAD DE U: " + contadores[4]);
            }





        }





    }


public static String funcion1 (){
    Scanner scanner = new Scanner(System.in);
    System.out.println("INTRODUCE UNA CADENA DE TEXTO");
    String temporal;
    String stringp = scanner.next();

    stringp = stringp.toUpperCase();

    temporal = "";

    for (int i = stringp.length() - 1; i >= 0; i--){
        temporal += stringp.charAt(i);
    }
    return temporal;
}


    public static int funcion2 (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("INTRODUCE UNA CADENA DE TEXTO PARA SABER EL NUMERO DE VOCALES");
        int contador = 0;
        String stringp = scanner.next();

      for (int i = 0; i < stringp.length(); i++){
          if (stringp.charAt(i) == 'a' || stringp.charAt(i) == 'e' ||stringp.charAt(i) == 'i' ||stringp.charAt(i) == 'o' ||stringp.charAt(i) == 'u'){
                contador++;
          }
      }
        return contador;
    }


    public static String funcion3 (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("INTRODUCE UNA CADENA DE TEXTO PARA SABER CUAL ES LA PALABRA MÁS GRANDE");
        String mayor = "";
        String stringp = scanner.nextLine();
        stringp = stringp.trim();
        String[] array = stringp.split(" ");

        for (int i = 0; i < array.length; i++){
            if (mayor.length() < array[i].length()){
                mayor = array[i];
            }
        }
        return mayor;
    }


    public static int funcion4 (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("INTRODUCE LA PRIMERA CADENA DE TEXTO");
        int contador = 0;
        String stringp = scanner.nextLine();
        stringp = stringp.trim();

        System.out.println("INTRODUCE LA SEGUNDA CADENA DE TEXTO");
        String string2 = scanner.nextLine();
        string2 = string2.trim();

        String[] array = stringp.split(" ");

        for (int i = 0; i < array.length; i++){
            if (string2.equals(array[i])){
                contador++;
            }
        }
        return contador;
    }

    public static int funcion5 (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("INTRODUCE UNA CADENA DE TEXTO PARA SABER CUANTAS PALABRAS TIENE");
        int contador = 0;
        String stringp = scanner.nextLine();
        stringp = stringp.trim();
        String[] array = stringp.split(" ");

        for (int i = 0; i < array.length; i++){
            contador++;
        }
        return contador;
    }

    public static String funcion6 (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("INTRODUCE UN NÚMERO DE TELÉFONO PARA CAMBIARLO DE FORMATO");
        String stringp ="";
        boolean compwhile = false;

        while (!compwhile){
            stringp = scanner.nextLine();

            if (stringp.length() != 11){
                System.out.println("VALOR INCORRECTO");
                stringp = scanner.nextLine();
            }
            else compwhile = true;
        }
        char[] arraynumeros = stringp.toCharArray();
        stringp = "(+" + arraynumeros[0] + arraynumeros [1] + ")-" + arraynumeros[2] + arraynumeros[3] + arraynumeros[4] + "-" + arraynumeros[5] +arraynumeros[6] +arraynumeros[7] +arraynumeros[8] +arraynumeros[9] +arraynumeros[10];

        return  stringp;
    }

    public static int[] funcion7 (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("INTRODUCE UNA CADENA DE TEXTO PARA SABER EL HISTOGRAMA DE VOCALES");
        int contadora = 0;
        int contadore = 0;
        int contadori = 0;
        int contadoro = 0;
        int contadoru = 0;

        String stringp = scanner.nextLine();
        stringp = stringp.trim();
        stringp = stringp.toUpperCase();
        char[] arraynumeros = stringp.toCharArray();

        for (int i = 0; i < stringp.length(); i++){
            if (arraynumeros[i] == 'A'){
                contadora++;
            } else if ( arraynumeros[i]=='E') {
                contadore++;
            }else if ( arraynumeros[i]=='I') {
                contadori++;
            }else if ( arraynumeros[i]=='O') {
                contadoro++;
            }else if ( arraynumeros[i]=='U') {
                contadoru++;
            }
        }
        int[] contadores;
        contadores = new int[]{contadora,contadore,contadori,contadoro,contadoru};

        return contadores;
    }





}
