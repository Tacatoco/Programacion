import java.util.Scanner;

public class AHORCADO {
    public static void main(String[] args) {
        stickmanbienvenida();
        bucleentrada();
        expintentos();

        boolean ganaroperder = ganadoperdido();
        if (ganaroperder) {
            System.out.println("¡HAS GANADO!");
        } else {
            System.out.println("¡HAS PERDIDO!");
        }
    }






    public static void stickmanbienvenida() {
        System.out.println();
        System.out.println("BIENVENIDOS AL AHORCADO");
        System.out.println(
                " o\n" +
                        "/|\\\n" +
                        "/ \\");
        System.out.println();
        System.out.println("¿EMPEZAMOS? PULSA 1");
    }

    public static void bucleentrada() {
        Scanner scanner = new Scanner(System.in);
        boolean compwhile = false;
        while (!compwhile) {
            int elecusu = scanner.nextInt();
            if (elecusu == 1) {
                System.out.println();
                compwhile = true;
            } else {
                System.out.println("VALOR INCORRECTO");
            }
        }
    }

    public static void expintentos() {
        System.out.println("TIENES 6 INTENTOS PARA ADIVINAR LETRAS");
        System.out.println("SI DECIDES RESOLVER Y FALLAS HABRÁS PERDIDO");
    }

    public static String palabra() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("DE ACUERDO JUGADOR 1, INTRODUCE LA PALABRA");
        String palabro = scanner.nextLine();
        palabro = palabro.toUpperCase();
        for (int i = 0; i < 30; i++) {
            System.out.println();
        }
        return palabro;
    }

    public static boolean ganadoperdido() {
        Scanner scanner = new Scanner(System.in);
        boolean juegoTerminado = false;
        int contadorFallos = 0;
        int intentosRestantes = 6;
        String palabraOriginal = palabra();
        char[] cadenaprincipal = palabraOriginal.toCharArray();
        int longitud = cadenaprincipal.length;

        char[] cadenavisible = new char[longitud];
        for (int i = 0; i < longitud; i++) {
            cadenavisible[i] = '_'; // Mostrar guiones bajos al principio
        }

        while (!juegoTerminado) {
            System.out.println("RESOLVER --> 1  ADIVINAR LETRA --> 2");
            int elecusu;

            if (!scanner.hasNextInt()) {
                System.out.println("ERROR: Introduce un número válido (1 o 2).");
                scanner.next(); // Limpiar entrada no válida
            }

            elecusu = scanner.nextInt();

            if (elecusu == 2) {
                if (intentosRestantes == 0) {
                    System.out.println("¡Te has quedado sin intentos!");
                    return false;
                }

                System.out.println("DI UNA LETRA");
                char letrausu = scanner.next().toUpperCase().charAt(0);

                boolean letraEncontrada = false;
                for (int i = 0; i < cadenaprincipal.length; i++) {
                    if (letrausu == cadenaprincipal[i]) {
                        cadenavisible[i] = letrausu; // Reemplazar el guion bajo con la letra correcta
                        letraEncontrada = true;
                    }
                }

                if (letraEncontrada) {
                    System.out.println("¡Buena letra!");
                } else {
                    contadorFallos++;
                    intentosRestantes--;
                    System.out.println("Letra incorrecta. Intentos restantes: " + intentosRestantes);
                    dibujarAhorcado(contadorFallos);
                }

                System.out.println("Progreso: " + new String(cadenavisible));

                // Verificar si el jugador ha ganado
                if (new String(cadenavisible).equals(palabraOriginal)) {
                    return true;
                }

            } else if (elecusu == 1) {
                System.out.println("INTRODUCE LA PALABRA:");
                String palabrausufinal = scanner.next().toUpperCase();

                if (palabrausufinal.equals(palabraOriginal)) {
                    return true;
                } else {
                    return false;
                }
            } else {
                System.out.println("Opción no válida. Debes elegir 1 o 2.");
            }
        }

        return false; // Este punto se alcanza solo si ocurre algo inesperado
    }

    public static void dibujarAhorcado(int contadorFallos) {
        switch (contadorFallos) {
            case 1 -> System.out.println(" o");
            case 2 -> System.out.println(" o\n |");
            case 3 -> System.out.println(" o\n/|");
            case 4 -> System.out.println(" o\n/|\\");
            case 5 -> System.out.println(" o\n/|\\\n/");
            case 6 -> System.out.println(" o\n/|\\\n/ \\");
        }
    }
}
