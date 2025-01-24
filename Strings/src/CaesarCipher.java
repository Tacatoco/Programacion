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

        char[] encriptado = Encriptar(cadenadetexto, abecedario, numeral);

        System.out.println("EL TEXTO ENCRIPTADO ES: " + Arrays.toString(encriptado));
    }
    public static char[] Encriptar(String cadenadetexto, char[] abecedario, char[] numeral) {
        char[] arraycadena = cadenadetexto.toCharArray();

        // Recorremos cada carácter de la cadena
        for (int i = 0; i < arraycadena.length; i++) {
            boolean modificado = false;  // Reiniciar modificado en cada iteración

            // Procesamos las letras (A-Z)
            for (int j = 0; j < abecedario.length; j++) {
                if (arraycadena[i] == abecedario[j]) {
                    // Desplazamiento circular para letras
                    arraycadena[i] = abecedario[(j + 1) % abecedario.length];
                    modificado = true;  // Marcar como modificado
                }
            }

            // Si no se ha modificado (no es una letra), procesamos los números (0-9)
            if (!modificado) {
                for (int p = 0; p < numeral.length; p++) {
                    if (arraycadena[i] == numeral[p]) {
                        // Desplazamiento circular para números
                        arraycadena[i] = numeral[(p + 1) % numeral.length];
                        modificado = true;  // Marcar como modificado
                    }
                }
            }

            // Si el carácter no es ni letra ni número (por ejemplo, un espacio), no se hace nada
            // No es necesario realizar ninguna acción en este caso, pero es bueno saber que
            // los caracteres no válidos como espacios, puntuaciones, etc., se dejan intactos.
        }

        return arraycadena;
    }

    }
