import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INTRODUCE UNA CADENA DE TEXTO");
        String cadenadetexto = scanner.nextLine();
        cadenadetexto = cadenadetexto.toUpperCase();

        System.out.println("CIFRAR --> 1");
        System.out.println("DESCIFRAR --> 2");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        if (opcion == 1) {
            encriptar(cadenadetexto);
        } else if (opcion == 2) {
            desencriptar(cadenadetexto);
        } else {
            System.out.println("Opción no válida.");
        }
    }

    public static void encriptar(String cadenadetexto) {
        String encriptado = "";

        for (int i = 0; i < cadenadetexto.length(); i++) {
            char caracter = cadenadetexto.charAt(i);

            if (caracter >= 'A' && caracter <= 'Z') { // Letras
                if (caracter == 'Z') {
                    encriptado += 'A';
                } else {
                    encriptado += (char) (caracter + 1);
                }
            } else if (caracter >= '0' && caracter <= '9') { // Números
                if (caracter == '9') {
                    encriptado += '0';
                } else {
                    encriptado += (char) (caracter + 1);
                }
            } else {
                encriptado += caracter; // Otros caracteres no se cifran
            }
        }

        System.out.println("EL MENSAJE CIFRADO ES: " + encriptado);
    }

    public static void desencriptar(String cadenadetexto) {
        String desencriptado = "";

        for (int i = 0; i < cadenadetexto.length(); i++) {
            char caracter = cadenadetexto.charAt(i);

            if (caracter >= 'A' && caracter <= 'Z') { // Letras
                if (caracter == 'A') {
                    desencriptado += 'Z';
                } else {
                    desencriptado += (char) (caracter - 1);
                }
            } else if (caracter >= '0' && caracter <= '9') { // Números
                if (caracter == '0') {
                    desencriptado += '9';
                } else {
                    desencriptado += (char) (caracter - 1);
                }
            } else {
                desencriptado += caracter; // Otros caracteres no
            }
        }

        System.out.println("EL MENSAJE DESCIFRADO ES: " + desencriptado);
    }
}
