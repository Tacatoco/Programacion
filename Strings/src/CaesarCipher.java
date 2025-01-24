import java.util.Arrays;
import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INTRODUCE UNA CADENA DE TEXTO");
        String cadenadetexto = scanner.nextLine();
        cadenadetexto = cadenadetexto.toUpperCase();

        char[] abecedario = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[] numeral = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

        System.out.println("CIFRAR --> 1");
        System.out.println("DESCIFRAR --> 2");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        char[] resultado;
        if (opcion == 1) {
            resultado = Encriptar(cadenadetexto, abecedario, numeral);
            System.out.println("EL TEXTO ENCRIPTADO ES: " + Arrays.toString(resultado));
        } else if (opcion == 2) {
            resultado = Desencriptar(cadenadetexto, abecedario, numeral);
            System.out.println("EL TEXTO DESCIFRADO ES: " + Arrays.toString(resultado));
        } else {
            System.out.println("Opción no válida.");
        }
    }

    public static char[] Encriptar(String cadenadetexto, char[] abecedario, char[] numeral) {
        char[] arraycadena = cadenadetexto.toCharArray();

        for (int i = 0; i < arraycadena.length; i++) {
            boolean modificado = false;

            // Procesa las letras (A-Z)
            for (int j = 0; j < abecedario.length; j++) {
                if (arraycadena[i] == abecedario[j]) {
                    arraycadena[i] = abecedario[(j + 1) % abecedario.length];
                    modificado = true;
                }
            }

            // Procesa los números (0-9)
            if (!modificado) {
                for (int p = 0; p < numeral.length; p++) {
                    if (arraycadena[i] == numeral[p]) {
                        arraycadena[i] = numeral[(p + 1) % numeral.length];
                    }
                }
            }
        }

        return arraycadena;
    }

    public static char[] Desencriptar(String cadenadetexto, char[] abecedario, char[] numeral) {
        char[] arraycadena = cadenadetexto.toCharArray();

        for (int i = 0; i < arraycadena.length; i++) {
            boolean modificado = false;

            // Procesa las letras (A-Z)
            for (int j = 0; j < abecedario.length; j++) {
                if (arraycadena[i] == abecedario[j]) {
                    arraycadena[i] = abecedario[(j - 1 + abecedario.length) % abecedario.length];
                    modificado = true;
                }
            }

            // Procesa los números (0-9)
            if (!modificado) {
                for (int p = 0; p < numeral.length; p++) {
                    if (arraycadena[i] == numeral[p]) {
                        arraycadena[i] = numeral[(p - 1 + numeral.length) % numeral.length];
                    }
                }
            }
        }

        return arraycadena;
    }
}