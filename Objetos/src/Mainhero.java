package lolaso;

import java.util.Scanner;

public class Mainhero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Hero Jugador1 = new Hero("AZNAR", 1, 100, 100, 0, 70, 10, 50);
        Hero Jugador2 = new Hero("RAJOY", 1, 120, 120, 0, 50, 20, 40);

        boolean compwhile = false;

        bienvenida();
        Jugador1.toStringg();
        Jugador2.toStringg();

        while (!compwhile) {
            if (Jugador1.getHealth() > 0 && Jugador2.getHealth() > 0) {
                // Jugador1 tiene mayor velocidad
                if (Jugador1.getVelocidad() > Jugador2.getVelocidad()) {
                    System.out.println("TE TOCA " + Jugador1.getNombreheroe());
                    acciones();
                    int elecusu1 = scanner.nextInt();
                    accionusu1(Jugador1, Jugador2, elecusu1);
                    compwhile = sacabao(Jugador1, Jugador2); // Verificar si alguien ha ganado

                    if (!compwhile) { // Si nadie ha ganado, es el turno de Jugador2
                        System.out.println("TE TOCA " + Jugador2.getNombreheroe());
                        acciones();
                        int elecusu2 = scanner.nextInt();
                        accionusu2(Jugador1, Jugador2, elecusu2);
                        compwhile = sacabao(Jugador1, Jugador2); // Verificar si alguien ha ganado
                    }
                }
                // Jugador2 tiene mayor velocidad
                else if (Jugador2.getVelocidad() > Jugador1.getVelocidad()) {
                    System.out.println("TE TOCA " + Jugador2.getNombreheroe());
                    acciones();
                    int elecusu2 = scanner.nextInt();
                    accionusu2(Jugador1, Jugador2, elecusu2);
                    compwhile = sacabao(Jugador1, Jugador2); // Verificar si alguien ha ganado

                    if (!compwhile) { // Si nadie ha ganado, es el turno de Jugador1
                        System.out.println("TE TOCA " + Jugador1.getNombreheroe());
                        acciones();
                        int elecusu1 = scanner.nextInt();
                        accionusu1(Jugador1, Jugador2, elecusu1);
                        compwhile = sacabao(Jugador1, Jugador2); // Verificar si alguien ha ganado
                    }
                }
            } else {
                compwhile = true; // Finaliza el juego si uno de los jugadores muere
            }
        }

    }

    public static void bienvenida() {
        System.out.println("BIENVENIDOS AL JUEGO");
        System.out.println();
        System.out.println("EMPIEZA EL JUGADOR MÁS VELOZ");
        System.out.println();
    }

    public static void acciones() {
        System.out.println("ATACAR --> 1");
        System.out.println("BEBER POCION Y RECUPERAR 10 DE VIDA --> 2");
        System.out.println("HACER REST (QUE NO SE LO QUE ES) PERO RECUPERAS 50 PUNTAZOS DE VIDA LOKO");
    }

    public static void accionusu1(Hero Jugador1, Hero Jugador2, int elecusu1) {
        switch (elecusu1) {
            case 1: {
                Jugador1.attack(Jugador2);
                Jugador1.setExperiencia(Jugador1.getExperiencia() + 10);
                if (Jugador1.getExperiencia() >= 50){
                    Jugador1.levelUp();
                }
                break;
            }
            case 2: {
                Jugador1.drinkpotion();
                break;
            }
            case 3: {
                Jugador1.rest();
                break;
            }
        }
    }

    public static void accionusu2(Hero Jugador1, Hero Jugador2, int elecusu2) {
        switch (elecusu2) {
            case 1: {
                Jugador2.attack(Jugador1);
                Jugador2.setExperiencia(Jugador2.getExperiencia() + 10);
                if (Jugador2.getExperiencia() >= 50){
                    Jugador2.levelUp();
                break;}
            }
            case 2: {
                Jugador2.drinkpotion();
                break;
            }
            case 3: {
                Jugador2.rest();
                break;
            }
        }
    }

    // Método que verifica si alguno de los jugadores ha ganado
    public static boolean sacabao(Hero Jugador1, Hero Jugador2) {
        if (Jugador1.getHealth() <= 0) {
            System.out.println("HA GANADO " + Jugador2.getNombreheroe());
            return true;
        } else if (Jugador2.getHealth() <= 0) {
            System.out.println("HA GANADO " + Jugador1.getNombreheroe());
            return true;
        }
        return false;
    }
}
