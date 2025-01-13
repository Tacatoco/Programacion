package Juegomodiular;

import java.util.Random;
import java.util.Scanner;


public class Jueguitomodular {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int ataquecaballero, defensacaballero, velocidadcaballero, puntosvidacaballero;
        int ataquearquera, defensaarquera, velocidadarquera, puntosvidaarquera;
        int ataqueorco, defensaorco, velocidadorco, puntosvidaorco;
        int ataquebruja, defensabruja, velocidadbruja, puntosvidabruja;


        int idplayer1 = 0;
        int idplayer2 = 0;


        int Critico = 0;


        int eleccion1 = 0;
        int eleccion2 = 0;


        int empezamos = 1;


        boolean eleccionplayers = true;
        boolean salirswitchidplayer = true;
        boolean salirpeleapersonajes = true;


        boolean valorescorrectosplayer1 = true;
        boolean valorescorrectosplayer2 = true;
        int validacionusu;
        int contadorrondas = 1;
        boolean letocaaplayer1 = true;
        boolean continuarbatalla = true;
        boolean whileeleccionmodo = true;
        boolean whileentendidoeleccion = true;


        int rangodano;
        int danosinaplicarplayer1 = 0;
        int danoaplicadoplayer1 = 0;
        int danosinaplicarplayer2 = 0;
        int danoaplicadoplayer2 = 0;
        int eleccionmododejuego = 0;


        //CABALLERO//


        ataquecaballero = 150;
        defensacaballero = 80;
        velocidadcaballero = 100;
        puntosvidacaballero = 170;


        //ARQUERA//


        ataquearquera = 100;
        defensaarquera = 120;
        velocidadarquera = 140;
        puntosvidaarquera = 140;


        //ORCO//


        ataqueorco = 100;
        defensaorco = 90;
        velocidadorco = 90;
        puntosvidaorco = 220;


        //BRUJA//


        ataquebruja = 110;
        defensabruja = 120;
        velocidadbruja = 110;
        puntosvidabruja = 160;


        //PARAMETROS PLAYER 1//


        int ataqueplayer1 = 0;
        int defensaplayer1 = 0;
        int velocidadplayer1 = 1;
        int puntosdevidaplayer1 = 0;
        int eleccionaccionplayer1 = 0;
        int contadorcuracionesplayer1 = 1;
        int habilidadplayer1 = 0;
        int suma1 = 500;


        //PARAMETROS PLAYER 2//


        int ataqueplayer2 = 0;
        int defensaplayer2 = 0;
        int velocidadplayer2 = 0;
        int puntosdevidaplayer2 = 0;
        int eleccionaccionplayer2 = 0;
        int contadorcuracionesplayer2 = 1;
        int habilidadplayer2 = 0;
        int suma2 = 500;


        int[] statsp1;
        int[] statsp2;


        introduccion();


        //BUCLE INICIO DEL JUEGO//


        empezamos = scanner.nextInt();


        bucleentrarjuego(empezamos);


        eleccionjuego();


        while (whileeleccionmodo) {
            eleccionmododejuego = scanner.nextInt();


            switch (eleccionmododejuego) {

                default: {
                    System.out.println("VALOR INVALIDO");
                }

                case 1: {
                    soutvalores1();
                    buclejuegoentendido(whileentendidoeleccion);
                    System.out.println("INTRODUCE TUS ESTADÍSTICAS PLAYER 1");

                    statsp1 = elecstatsp1();
                    velocidadplayer1 = statsp1[0];
                    ataqueplayer1 = statsp1[1];
                    defensaplayer1 = statsp1[2];
                    puntosdevidaplayer1 = statsp1[3];

                    System.out.println("TU TURNO PLAYER 2, INTRODUCE TUS ESTADÍSTICAS");
                    statsp2 = elecstatsp2();
                    velocidadplayer2 = statsp2[0];
                    ataqueplayer2 = statsp2[1];
                    defensaplayer2 = statsp2[2];
                    puntosdevidaplayer2 = statsp2[3];


                    //EMPIEZA LA BATALLA CON LOS PERSONAJES INTRODUCIDOS MANUALMENTE//


                    letocaaplayer1 = velocidadplayer1 > velocidadplayer2;


                    while (continuarbatalla) {
                        System.out.println("RONDA NÚMERO: " + contadorrondas);

                        if (letocaaplayer1) {
                            // Turno del jugador 1
                            accionp1();
                            eleccionaccionplayer1 = scanner.nextInt();

                            if (eleccionaccionplayer1 == 1 && contadorcuracionesplayer1 <= 2) {
                                puntosdevidaplayer1 = curacionp1(puntosdevidaplayer1);
                                contadorcuracionesplayer1++;
                            } else if (eleccionaccionplayer1 == 2) {
                                puntosdevidaplayer2 = atacap1(puntosdevidaplayer2, ataqueplayer1, defensaplayer2);
                            }
                        } else {
                            // Turno del jugador 2
                            accionp2();
                            eleccionaccionplayer2 = scanner.nextInt();

                            if (eleccionaccionplayer2 == 1 && contadorcuracionesplayer2 <= 2) {
                                puntosdevidaplayer2 = curacionp2(puntosdevidaplayer2);
                                contadorcuracionesplayer2++;
                            } else if (eleccionaccionplayer2 == 2) {
                                puntosdevidaplayer1 = atacap2(puntosdevidaplayer1, ataqueplayer2, defensaplayer1);
                            }
                        }
                        // Verificar si algún jugador ha perdido
                        if (puntosdevidaplayer1 <= 0) {
                            puntosdevidaplayer1 = 0; // Evitar valores negativos
                            continuarbatalla = false;
                            System.out.println("PLAYER 2 GANA. PLAYER 1 HA SIDO DERROTADO.");
                        } else if (puntosdevidaplayer2 <= 0) {
                            puntosdevidaplayer2 = 0; // Evitar valores negativos
                            continuarbatalla = false;
                            System.out.println("PLAYER 1 GANA. PLAYER 2 HA SIDO DERROTADO.");
                        }
                        letocaaplayer1 = !letocaaplayer1;
                        contadorrondas++;
                    }
                    whileeleccionmodo = false;
                    break;
                }

                case 2: {
                    System.out.println();
                    System.out.println();
                    System.out.println(" _____   ___  ______  ___   _      _      ___________ _____ \n" +
                            "/  __ \\ / _ \\ | ___ \\/ _ \\ | |    | |    |  ___| ___ \\  _  |\n" +
                            "| /  \\// /_\\ \\| |_/ / /_\\ \\| |    | |    | |__ | |_/ / | | |\n" +
                            "| |    |  _  || ___ \\  _  || |    | |    |  __||    /| | | |\n" +
                            "| \\__/\\| | | || |_/ / | | || |____| |____| |___| |\\ \\\\ \\_/ /\n" +
                            " \\____/\\_| |_/\\____/\\_| |_/\\_____/\\_____/\\____/\\_| \\_|\\___/ ");
                    System.out.println();
                    System.out.println("UN GUERRERO DE ALTO LINAGE QUE CON SU ESPADA Y VIGOR CAUSA ESTRAGOS EN EL CAMPO DE BATALLA");
                    System.out.println("PARA ELEGIR ESTE PERSONAJE PULSA 1");
                    System.out.println();
                    System.out.println("""
                                            .-.
                                                           {{@}}
                                           <>               8@8
                                         .::::.             888
                                     @\\\\/W\\/\\/W\\//@         8@8
                                      \\\\/^\\/\\/^\\//     _    )8(    _
                                       \\_O_<>_O_/     (@)__/8@8\\__(@)
                                  ____________________ `~"-=):(=-"~`
                                 |<><><>  |  |  <><><>|     |.|
                                 |<>      |  |      <>|     |S|
                                 |<>      |  |      <>|     |'|
                                 |<>   .--------.   <>|     |.|
                                 |     |   ()   |     |     |P|
                                 |_____| (O\\/O) |_____|     |'|
                                 |     \\   /\\   /     |     |.|
                                 |------\\  \\/  /------|     |U|
                                 |       '.__.'       |     |'|
                                 |        |  |        |     |.|
                                 :        |  |        :     |N|
                                  \\<>     |  |     <>/      |'|
                                   \\<>    |  |    <>/       |.|
                                    \\<>   |  |   <>/        |K|
                                     `\\<> |  | <>/'         |'|
                                       `-.|  |.-`           \\ /
                                          '--'               ^\
                            """);


                    System.out.println();
                    System.out.println();


                    System.out.println("""
                              ___  ______ _____ _   _ ___________  ___ \s
                             / _ \\ | ___ \\  _  | | | |  ___| ___ \\/ _ \\\s
                            / /_\\ \\| |_/ / | | | | | | |__ | |_/ / /_\\ \\
                            |  _  ||    /| | | | | | |  __||    /|  _  |
                            | | | || |\\ \\\\ \\/' / |_| | |___| |\\ \\| | | |
                            \\_| |_/\\_| \\_|\\_/\\_\\\\___/\\____/\\_| \\_\\_| |_/
                                                                       \s
                                                                     \s""");
                    System.out.println();
                    System.out.println("UNA SEMIELFA PROVENIENTE DE RIVENDEL CON UNA AGILIDAD Y DESTREZA IMPECABLES A LA HORA DE USAR EL ARCO");
                    System.out.println("PARA ELEGIR ESTE PERSONAJE PULSA 2");
                    System.out.println();
                    System.out.println("          4$$-.               \n" +
                            "           4   \".             \n" +
                            "           4    ^.            \n" +
                            "           4     $            \n" +
                            "           4     'b           \n" +
                            "           4      \"b.         \n" +
                            "           4        $         \n" +
                            "           4        $r        \n" +
                            "           4        $F        \n" +
                            "-$b========4========$b====*P=-\n" +
                            "           4       *$$F       \n" +
                            "           4        $$\"       \n" +
                            "           4       .$F        \n" +
                            "           4       dP         \n" +
                            "           4      F           \n" +
                            "           4     @            \n" +
                            "           4    .             \n" +
                            "           J.                 \n" +
                            "          '$$                 ");


                    System.out.println();
                    System.out.println();


                    System.out.println(" ___________  _____ _____ \n" +
                            "|  _  | ___ \\/  __ \\  _  |\n" +
                            "| | | | |_/ /| /  \\/ | | |\n" +
                            "| | | |    / | |   | | | |\n" +
                            "\\ \\_/ / |\\ \\ | \\__/\\ \\_/ /\n" +
                            " \\___/\\_| \\_| \\____/\\___/ \n" +
                            "                          \n" +
                            "                        ");
                    System.out.println();
                    System.out.println("TANTO SU CARACTERÍSTICA RESISTENCIA COMO SU DURA CORAZA HACEN DE EL UN RIVAL DURO DE TUMBAR ");
                    System.out.println("PARA ELEGIR ESTE PERSONAJE PULSA 3");
                    System.out.println();
                    System.out.println("⠀⠀⠀⠀⠀⢀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣤⣶⣧⣄⣉⣉⣠⣼⣶⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⢰⣿⣿⣿⣿⡿⣿⣿⣿⣿⢿⣿⣿⣿⣿⡆⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⣼⣤⣤⣈⠙⠳⢄⣉⣋⡡⠞⠋⣁⣤⣤⣧⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⢲⣶⣤⣄⡀⢀⣿⣄⠙⠿⣿⣦⣤⡿⢿⣤⣴⣿⠿⠋⣠⣿⠀⢀⣠⣤⣶⡖⠀\n" +
                            "⠀⠀⠙⣿⠛⠇⢸⣿⣿⡟⠀⡄⢉⠉⢀⡀⠉⡉⢠⠀⢻⣿⣿⡇⠸⠛⣿⠋⠀⠀\n" +
                            "⠀⠀⠀⠘⣷⠀⢸⡏⠻⣿⣤⣤⠂⣠⣿⣿⣄⠑⣤⣤⣿⠟⢹⡇⠀⣾⠃⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠘⠀⢸⣿⡀⢀⠙⠻⢦⣌⣉⣉⣡⡴⠟⠋⡀⢀⣿⡇⠀⠃⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⢸⣿⣧⠈⠛⠂⠀⠉⠛⠛⠉⠀⠐⠛⠁⣼⣿⡇⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠸⣏⠀⣤⡶⠖⠛⠋⠉⠉⠙⠛⠲⢶⣤⠀⣹⠇⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣿⣶⣿⣿⣿⣿⣿⣿⣶⣿⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠉⠛⠛⠛⠛⠉⠉⠉⠁⠀⠀⠀");


                    System.out.println();
                    System.out.println();


                    System.out.println("____________ _   _   ___  ___  \n" +
                            "| ___ \\ ___ \\ | | | |_  |/ _ \\ \n" +
                            "| |_/ / |_/ / | | |   | / /_\\ \\\n" +
                            "| ___ \\    /| | | |   | |  _  |\n" +
                            "| |_/ / |\\ \\| |_| /\\__/ / | | |\n" +
                            "\\____/\\_| \\_|\\___/\\____/\\_| |_/\n" +
                            "                               \n" +
                            "                              ");
                    System.out.println();
                    System.out.println("MENUDA Y CON APARIENCIA DEBIL PERO TEMIDA POR SU GRAN CONOCIMIENTO ARCANO Y SABIDURÍA ");
                    System.out.println("PARA ELEGIR ESTE PERSONAJE PULSA 4");
                    System.out.println();
                    System.out.println("⠀⢀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⢀⣴⣿⣿⣶⣤⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⢠⣾⠟⠻⣿⣿⣿⣿⣿⣷⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠉⠁⠀⠀⢹⣿⣿⣿⣿⣿⣿⣿⣧⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⣿⡿⠿⠛⠋⣹⣏⣹⣏⣹⣤⣤⣀⣀⣀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⣸⣿⣿⣷⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡷⠶⠆\n" +
                            "⠀⠀⠀⠀⣀⣴⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠋⠉⣽⣿⣿⣿⣿⠉⠁⠀⠀⠀⠀\n" +
                            "⠀⢀⣴⣿⣿⣿⣿⠿⢿⣿⣽⣿⣿⣿⠛⠛⠃⠀⠈⠛⣿⣿⡇⣿⠀⠀⠀⠀⠀⠀\n" +
                            "⠴⣿⣟⣛⣯⣭⣼⡾⣿⠻⡟⣿⣿⡇⠀⠀⠀⠀⠑⢀⣿⠻⡷⠃⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠈⠉⠀⠀⣿⠀⣯⡷⣽⣌⠳⣷⣄⠀⠘⠿⢗⣾⣿⣷⣜⡄⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⢸⣄⣧⣿⣬⣿⣵⣬⡻⣷⣤⣤⣾⣿⡯⣧⢸⠇⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⣠⣾⣿⣏⠙⢿⣟⠢⡙⢿⣎⣷⢿⣿⡟⢡⢃⣾⣆⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⢀⣴⣾⢿⢿⠇⠈⠂⢸⡍⣆⠸⣌⣿⣿⣦⡙⢠⠃⣾⣏⢿⡄⠀⠀⠀⠀⠀\n" +
                            "⠀⡴⣻⣟⣵⢋⣮⡀⠀⠀⢸⡇⢸⠀⡟⣿⣿⡟⣿⢾⣄⡏⡋⢸⡇⠀⠀⠀⠀⠀\n" +
                            "⣾⢿⣿⠟⣡⣾⣿⣿⣿⣿⣿⡇⢸⠀⣿⡟⣿⣿⣿⡐⠮⣹⣧⣼⠃⠀⠀⠀⠀⠀\n" +
                            "⢻⢿⡥⣾⣿⡿⣿⣿⣿⣿⣿⣇⢸⠀⣿⣿⣿⣿⢿⣿⣷⣶⣭⣽⣦⡀⠀⠀⠀⠀\n" +
                            "⠈⢺⣶⣽⠻⣧⣿⣿⣿⣿⣿⣿⣸⡀⣿⣻⣆⠹⣷⣿⣿⢻⣷⣯⣻⣧⡀⠀⠀⠀\n" +
                            "⠀⠀⠈⠻⣧⣬⣛⣉⣙⣻⠿⣟⠻⣇⠸⣧⡻⣿⣿⣟⣡⣾⣿⣿⣼⡿⠃⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠉⠻⣿⣿⣿⡿⣿⣿⡿⣦⡘⢿⡈⠙⠛⢒⣻⣿⡟⠁⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠁⠚⠿⣷⣿⠟⠙⠻⢿⣿⠿⠋⠁⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");


                    System.out.println();
                    System.out.println();


                    //BUCLE DE SELECCION PLAYER 1//


                    System.out.println("DE ACUERDO JUGADOR 1, ¿A QUIÉN ELIGES?");


                    while (eleccionplayers) {
                        eleccion1 = scanner.nextInt();


                        if (eleccion1 == 1) {


                            ataqueplayer1 = ataquecaballero;
                            defensaplayer1 = defensacaballero;
                            velocidadplayer1 = velocidadcaballero;
                            puntosdevidaplayer1 = puntosvidacaballero;
                            idplayer1 = 1;


                            stats1(puntosdevidaplayer1, velocidadplayer1, ataqueplayer1, defensaplayer1);


                            eleccionplayers = false;
                        } else if (eleccion1 == 2) {


                            ataqueplayer1 = ataquearquera;
                            defensaplayer1 = defensaarquera;
                            velocidadplayer1 = velocidadarquera;
                            puntosdevidaplayer1 = puntosvidaarquera;
                            idplayer1 = 2;


                            stats1(puntosdevidaplayer1, velocidadplayer1, ataqueplayer1, defensaplayer1);


                            eleccionplayers = false;


                        } else if (eleccion1 == 3) {


                            ataqueplayer1 = ataqueorco;
                            defensaplayer1 = defensaorco;
                            velocidadplayer1 = velocidadorco;
                            puntosdevidaplayer1 = puntosvidaorco;
                            idplayer1 = 3;


                            stats1(puntosdevidaplayer1, velocidadplayer1, ataqueplayer1, defensaplayer1);


                            eleccionplayers = false;


                        } else if (eleccion1 == 4) {


                            ataqueplayer1 = ataquebruja;
                            defensaplayer1 = defensabruja;
                            velocidadplayer1 = velocidadbruja;
                            puntosdevidaplayer1 = puntosvidabruja;
                            idplayer1 = 4;


                            stats1(puntosdevidaplayer1, velocidadplayer1, ataqueplayer1, defensaplayer1);


                            eleccionplayers = false;


                        } else {


                            System.out.println("NÚMERO NO VALIDO");


                        }


                    }
                    System.out.println();


                    //BUCLE DE SELECCION PLAYER 2//


                    System.out.println("ES TU MOMENTO PLAYER 2, ¿A QUIEN ELIGES? ");


                    eleccionplayers = true;


                    while (eleccionplayers) {
                        eleccion2 = scanner.nextInt();


                        if (eleccion2 == 1) {

                            ataqueplayer2 = ataquecaballero;
                            defensaplayer2 = defensacaballero;
                            velocidadplayer2 = velocidadcaballero;
                            puntosdevidaplayer2 = puntosvidacaballero;
                            idplayer2 = 1;

                            stats2(puntosdevidaplayer2, velocidadplayer2, ataqueplayer2, defensaplayer2);

                            System.out.println();
                            System.out.println();
                            eleccionplayers = false;
                        } else if (eleccion2 == 2) {

                            ataqueplayer2 = ataquearquera;
                            defensaplayer2 = defensaarquera;
                            velocidadplayer2 = velocidadarquera;
                            puntosdevidaplayer2 = puntosvidaarquera;
                            idplayer2 = 2;
                            stats2(puntosdevidaplayer2, velocidadplayer2, ataqueplayer2, defensaplayer2);

                            System.out.println();
                            System.out.println();
                            eleccionplayers = false;

                        } else if (eleccion2 == 3) {


                            ataqueplayer2 = ataqueorco;
                            defensaplayer2 = defensaorco;
                            velocidadplayer2 = velocidadorco;
                            puntosdevidaplayer2 = puntosvidaorco;
                            idplayer2 = 3;

                            stats2(puntosdevidaplayer2, velocidadplayer2, ataqueplayer2, defensaplayer2);
                            System.out.println();
                            System.out.println();
                            eleccionplayers = false;

                        } else if (eleccion2 == 4) {
                            ataqueplayer2 = ataquebruja;
                            defensaplayer2 = defensabruja;
                            velocidadplayer2 = velocidadbruja;
                            puntosdevidaplayer2 = puntosvidabruja;
                            idplayer2 = 4;

                            stats2(puntosdevidaplayer2, velocidadplayer2, ataqueplayer2, defensaplayer2);

                            System.out.println();
                            System.out.println();
                            eleccionplayers = false;

                        } else {
                            System.out.println("NÚMERO NO VALIDO");
                        }
                        letocaaplayer1 = velocidadplayer1 > velocidadplayer2;

                        while (continuarbatalla) {
                            System.out.println("RONDA NÚMERO: " + contadorrondas);
                            if (letocaaplayer1 && continuarbatalla) {

                                if (continuarbatalla) {

                                    //EMPIEZA PLAYER 1//
                                    accionp1();
                                    eleccionaccionplayer1 = scanner.nextInt();

                                    if (eleccionaccionplayer1 == 1 && contadorcuracionesplayer1 <= 2) {
                                        puntosdevidaplayer1 = curacionp1(puntosdevidaplayer1);

                                    } else if (eleccionaccionplayer1 == 2) {

                                        switch (idplayer1) {


                                            case 1: {
                                                soutcaballero();
                                                break;
                                            }
                                            case 2: {
                                                soutarquera();
                                                break;
                                            }
                                            case 3: {
                                                soutorco();
                                                break;
                                            }
                                            case 4: {
                                                soutbruja();
                                                break;
                                            }
                                        }
                                        puntosdevidaplayer2 = atacap1(ataqueplayer1, puntosdevidaplayer2, defensaplayer2);
                                    }

                                    if (continuarbatalla) {
                                        //EMPIEZA PLAYER 2//
                                        accionp2();
                                        eleccionaccionplayer2 = scanner.nextInt();

                                        if (eleccionaccionplayer2 == 1 && contadorcuracionesplayer2 <= 2) {
                                            puntosdevidaplayer2 = curacionp2(puntosdevidaplayer2);
                                        } else if (eleccionaccionplayer2 == 2) {
                                            switch (idplayer2) {
                                                case 1: {
                                                    soutcaballero();
                                                    break;
                                                }
                                                case 2: {
                                                    soutarquera();
                                                    break;
                                                }
                                                case 3: {
                                                    soutorco();
                                                    break;
                                                }
                                                case 4: {
                                                    soutbruja();
                                                    break;
                                                }
                                            }
                                            puntosdevidaplayer1 = atacap2(puntosdevidaplayer1, defensaplayer1, ataqueplayer2);
                                        }
                                        contadorrondas++;
                                    }
                                }
                            } else if (continuarbatalla) {


                                if (continuarbatalla) {
                                    accionp2();
                                    eleccionaccionplayer2 = scanner.nextInt();
                                    if (eleccionaccionplayer2 == 1 && contadorcuracionesplayer2 <= 2) {
                                        puntosdevidaplayer2 = curacionp2(puntosdevidaplayer2);
                                    } else if (eleccionaccionplayer2 == 2) {
                                        switch (idplayer2) {
                                            case 1: {
                                                soutcaballero();
                                                break;
                                            }
                                            case 2: {
                                                soutarquera();
                                                break;
                                            }
                                            case 3: {
                                                soutorco();
                                                break;
                                            }
                                            case 4: {
                                                soutbruja();
                                                break;
                                            }
                                        }
                                        puntosdevidaplayer1 = atacap2(puntosdevidaplayer1, defensaplayer1, ataqueplayer2);
                                    }
                                }
                                //EMPIEZA PLAYER 1//
                                if (continuarbatalla) {
                                    accionp1();
                                    eleccionaccionplayer1 = scanner.nextInt();
                                    if (eleccionaccionplayer1 == 1 && contadorcuracionesplayer1 <= 2) {
                                        contadorcuracionesplayer1++;
                                        puntosdevidaplayer1 = curacionp1(puntosdevidaplayer1);
                                    } else if (eleccionaccionplayer1 == 2) {
                                        switch (idplayer1) {
                                            case 1: {
                                                soutcaballero();
                                                break;
                                            }
                                            case 2: {
                                                soutarquera();
                                                break;
                                            }
                                            case 3: {
                                                soutorco();
                                                break;
                                            }
                                            case 4: {
                                                soutbruja();
                                                break;
                                            }
                                        }
                                        puntosdevidaplayer2 = atacap1(ataqueplayer1, puntosdevidaplayer2, defensaplayer2);
                                    }
                                    contadorrondas++;
                                }
                            }
                        }
                    }
                    whileeleccionmodo = false;
                    break;
                }
            }
        }
    }

    public static void introduccion() {
        System.out.println("   ___    ____   ____   _  __  _   __   ____   _  __   ____   ___   ____    ____        ___    __           __  __  __   ____  _____  ____ \n" +
                "  / _ )  /  _/  / __/  / |/ / | | / /  / __/  / |/ /  /  _/  / _ \\ / __ \\  / __/       / _ |  / /       __ / / / / / /  / __/ / ___/ / __ \\\n" +
                " / _  | _/ /   / _/   /    /  | |/ /  / _/   /    /  _/ /   / // // /_/ / _\\ \\        / __ | / /__     / // / / /_/ /  / _/  / (_ / / /_/ /\n" +
                "/____/ /___/  /___/  /_/|_/   |___/  /___/  /_/|_/  /___/  /____/ \\____/ /___/       /_/ |_|/____/     \\___/  \\____/  /___/  \\___/  \\____/ \n" +
                "                                                                                                                                           ");

        System.out.println();
        System.out.println();
        System.out.println("¿EMPEZAMOS? INSERTA 0 PARA EMPEZAR");
    }

    public static void bucleentrarjuego(int empezamos) {
        boolean contadorempezamos = true;
        Scanner scanner = new Scanner(System.in);
        while (contadorempezamos) {
            if (empezamos != 0) {
                System.out.println("INTRODUCE 0 PARA EMPEZAR");
                empezamos = scanner.nextInt();

            } else {


                System.out.println("DE ACUERDO, EMPEZAMOS");
                System.out.println();
                System.out.println();
                contadorempezamos = false;


            }
        }
    }

    public static void eleccionjuego() {
        System.out.println("EN QUE MODO DESEAS JUGAR");
        System.out.println("PARA JUGAR CON VALORES PERSONALIZADOS PULSA 1");
        System.out.println("PARA JUGAR CON PERSONAJES PREDEFINIDOS PULSA 2");
    }


    public static void soutvalores1() {
        System.out.println("VAMOS A INTRODUCIR LOS VALORES DE BATALLA DEL JUGADOR 1");
        System.out.println("VELOCIDAD, DEFENSA, ATAQUE Y PUNTOS DE VIDA");
        System.out.println();
        System.out.println("CADA UNO DE ELL0S NO PODRA SUPERAR LOS 200 PUNTOS Y ENTRE TODOS NO PODRÁN SUPERAR LOS 500 PUNTOS ");
        System.out.println("LAS CURACIONES SON LIMITADAS, EN EL MOMENTO EN EL QUE SE ACABEN SI SE ELIJE LA OPCION DE CURAR SE PASARÁ DE TURNO");
        System.out.println();
        System.out.println("¿ENTENDIDO? PARA EMPEZAR PULSA 1");
    }

    public static void buclejuegoentendido(boolean whileentendidoeleccion) {
        while (whileentendidoeleccion) {
            Scanner scanner = new Scanner(System.in);
            int empezamosvalorentrada = 0;
            empezamosvalorentrada = scanner.nextInt();


            if (empezamosvalorentrada == 1) {
                System.out.println("DE ACUERDO, EMPEZAMOS");
                whileentendidoeleccion = false;
            } else {
                System.out.println("INTRODUCE UN VALOR VÁLIDO");
            }
        }
    }

    public static int[] elecstatsp1() {
        Scanner scanner = new Scanner(System.in);
        boolean valorescorrectosplayer1 = true;
        int ataqueplayer1 = 0;
        int defensaplayer1 = 0;
        int velocidadplayer1 = 1;
        int puntosdevidaplayer1 = 0;
        int suma1 = 500;

        while (valorescorrectosplayer1) {
            System.out.println("INTRODUCE TU VELOCIDAD");
            velocidadplayer1 = scanner.nextInt();
            System.out.println("INTRODUCE TU ATAQUE");
            ataqueplayer1 = scanner.nextInt();
            System.out.println("INTRODUCE TU DEFENSA");
            defensaplayer1 = scanner.nextInt();
            System.out.println("INTRODUCE TU VIDA");
            puntosdevidaplayer1 = scanner.nextInt();


            suma1 = velocidadplayer1 + ataqueplayer1 + defensaplayer1 + puntosdevidaplayer1;


            if (suma1 <= 500 && ataqueplayer1 <= 200 && defensaplayer1 <= 200 && velocidadplayer1 <= 200 && puntosdevidaplayer1 <= 200) {
                System.out.println("VALORES CORRECTOS");
                valorescorrectosplayer1 = false;
            } else {
                System.out.println("INTRODUCE VALORES CORRECTOS");
            }
        }
        int[] datosp1 = {velocidadplayer1, ataqueplayer1, defensaplayer1, puntosdevidaplayer1};
        return datosp1;
    }

    public static int[] elecstatsp2() {
        Scanner scanner = new Scanner(System.in);
        int ataqueplayer2 = 0;
        int defensaplayer2 = 0;
        int velocidadplayer2 = 0;
        int puntosdevidaplayer2 = 0;
        int suma2 = 500;
        boolean valorescorrectosplayer2 = true;
        while (valorescorrectosplayer2) {


            System.out.println("INTRODUCE TU VELOCIDAD");
            velocidadplayer2 = scanner.nextInt();


            System.out.println("INTRODUCE TU ATAQUE");
            ataqueplayer2 = scanner.nextInt();


            System.out.println("INTRODUCE TU DEFENSA");
            defensaplayer2 = scanner.nextInt();


            System.out.println("INTRODUCE TU VIDA");
            puntosdevidaplayer2 = scanner.nextInt();


            suma2 = velocidadplayer2 + ataqueplayer2 + defensaplayer2 + puntosdevidaplayer2;


            if (suma2 <= 500 && ataqueplayer2 <= 200 && defensaplayer2 <= 200 && velocidadplayer2 <= 200 && puntosdevidaplayer2 <= 200) {
                System.out.println("VALORES CORRECTOS");
                valorescorrectosplayer2 = false;
            } else {
                System.out.println("INTRODUCE VALORES CORRECTOS");

            }
        }
        int[] datosp2 = {velocidadplayer2, ataqueplayer2, defensaplayer2, puntosdevidaplayer2};
        return datosp2;
    }

    public static void accionp1() {
        System.out.println("PLAYER 1 EMPIEZA TU TURNO");
        System.out.println("===================================");
        System.out.println("PARA CURARTE un 20% DE VIDA PULSA 1");
        System.out.println();
        System.out.println("PARA ATACAR PULSA 2");
        System.out.println("===================================");
    }

    public static void accionp2() {
        System.out.println("PLAYER 2 EMPIEZA TU TURNO");
        System.out.println("===================================");
        System.out.println("PARA CURARTE un 20% DE VIDA PULSA 1");
        System.out.println();
        System.out.println("PARA ATACAR PULSA 2");
        System.out.println("===================================");
    }

    public static int curacionp1(int puntosdevidaplayer1) {
        System.out.println("CURACION ACTIVADA");
        puntosdevidaplayer1 = puntosdevidaplayer1 + (puntosdevidaplayer1 / 3);
        System.out.println("PLAYER 1 SE CURA: " + puntosdevidaplayer1 + " PUNTOS DE VIDA");
        System.out.println("      |V|\n" +
                "   .::| |::.\n" +
                "  ::__| |__::\n" +
                " >____   ____<\n" +
                "  ::  | |  ::\n" +
                "   '::| |::'\n" + "      | |\n" +
                "      | |\n" +
                "      | |");


        return puntosdevidaplayer1;
    }

    public static int curacionp2(int puntosdevidaplayer2) {


        System.out.println("CURACION ACTIVADA");
        puntosdevidaplayer2 = puntosdevidaplayer2 + (puntosdevidaplayer2 / 3);


        System.out.println("PLAYER 2 SE CURA: " + (puntosdevidaplayer2 / 3) + "  PUNTOS DE VIDA");
        System.out.println("      |V|\n" +
                "   .::| |::.\n" +
                "  ::__| |__::\n" +
                " >____   ____<\n" +
                "  ::  | |  ::\n" +
                "   '::| |::'\n" +
                "      | |\n" +
                "      | |\n" +
                "      | |");


        return puntosdevidaplayer2;
    }

    public static int atacap1(int puntosdevidaplayer2, int ataqueplayer1, int defensaplayer2) {
        Random random = new Random();
        int rangodano = (int) (ataqueplayer1 * 0.1);
        int danosinaplicarplayer1 = ataqueplayer1 - random.nextInt(rangodano + 1);
        int danoaplicadoplayer1 = Math.max(1, danosinaplicarplayer1 - (int) (defensaplayer2 * 0.3));

        System.out.println("PLAYER 1 ACIERTA EL GOLPE ASESTANDO: " + danoaplicadoplayer1);
        puntosdevidaplayer2 = puntosdevidaplayer2 - danoaplicadoplayer1;
        System.out.println();
        if (puntosdevidaplayer2 <= 0) {
            puntosdevidaplayer2 = 0;
            boolean continuarbatalla = false;
            System.out.println("A PLAYER 2 LE QUEDAN 0 PUNTOS DE VIDA");
        } else {
            System.out.println("A PLAYER 2 LE QUEDAN " + puntosdevidaplayer2 + "PUNTOS DE VIDA");

            for (int i = 0; i < puntosdevidaplayer2; i = i + 5) {
                System.out.print("❤");
            }

        }
        System.out.println();
        return puntosdevidaplayer2;
    }

    public static int atacap2(int puntosdevidaplayer1, int ataqueplayer2, int defensaplayer1) {
        Random random = new Random();
        int rangodano = (int) (ataqueplayer2 * 0.1);
        int danosinaplicarplayer2 = ataqueplayer2 - random.nextInt(rangodano + 1);
        int danoaplicadoplayer2 = Math.max(1, danosinaplicarplayer2 - (int) (defensaplayer1 * 0.3));


        System.out.println("PLAYER 2 ACIERTA EL GOLPE ASESTANDO: " + danoaplicadoplayer2);
        puntosdevidaplayer1 = puntosdevidaplayer1 - danoaplicadoplayer2;
        System.out.println();
        if (puntosdevidaplayer1 <= 0) {
            puntosdevidaplayer1 = 0;
            boolean continuarbatalla = false;
            System.out.println("A PLAYER 1 LE QUEDAN 0 PUNTOS DE VIDA");
        } else {
            System.out.println("A PLAYER 1 LE QUEDAN " + puntosdevidaplayer1 + " PUNTOS DE VIDA");
            for (int i = 0; i < puntosdevidaplayer1; i = i + 5) {


                System.out.print("❤");
            }
        }
        System.out.println();
        return puntosdevidaplayer1;
    }

    public static void stats1(int puntosdevidaplayer1, int defensaplayer1, int velocidadplayer1, int ataqueplayer1) {
        System.out.println(" LA ELECCIÓN DEL JUGADOR 1 HA SIDO EL CABALLERO");
        System.out.println("TUS STATS SON: " + ataqueplayer1 + " puntos de ataque, " + defensaplayer1 + " puntos de defensa, " + velocidadplayer1 + " puntos de velocidad, " + puntosdevidaplayer1 + " puntos de vida");
        System.out.println("LAS CURACIONES SON LIMITADAS, EN EL MOMENTO EN EL QUE SE ACABEN SI SE ELIJE LA OPCION DE CURAR SE PASARÁ DE TURNO");
    }

    public static void stats2(int puntosdevidaplayer2, int defensaplayer2, int velocidadplayer2, int ataqueplayer2) {
        System.out.println(" LA ELECCIÓN DEL JUGADOR 1 HA SIDO EL CABALLERO");
        System.out.println("TUS STATS SON: " + ataqueplayer2 + " puntos de ataque, " + defensaplayer2 + " puntos de defensa, " + velocidadplayer2 + " puntos de velocidad, " + puntosdevidaplayer2 + " puntos de vida");
        System.out.println("LAS CURACIONES SON LIMITADAS, EN EL MOMENTO EN EL QUE SE ACABEN SI SE ELIJE LA OPCION DE CURAR SE PASARÁ DE TURNO");
    }

    public static void soutcaballero() {
        System.out.println("BLANDIENDO SU ESPADA, EL TEMIBLE CABALLERO CONSIGUE DAR UN GOLPE CERTERO");
        System.out.println("      />_________________________________\n" +
                "[########[]_________________________________>\n" +
                "         \\>");
    }

    public static void soutarquera() {
        System.out.println("APUNTANDO DESDE LA DISTANCIA, LA ARQUERA CONSIGUE ACERTAR EL TIRO");
        System.out.println(">>>>>>>_____________________\\`-._\n" +
                ">>>>>>>                     /.-'");
    }

    public static void soutorco() {
        System.out.println("A PASOS AGIGANTADOS Y CON MUY MAL HUMOR, EL ORCO HACE QUE SU MAZA GOLPEE EN EL BLANCO");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣾⣿⣷⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣾⣿⣿⣿⠟⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣾⣿⣿⣿⠟⠁⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⣿⣿⣿⠟⠁⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⣿⡿⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⣿⡿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢴⣌⠻⡿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡘⢦⡙⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⣀⠰⣄⠙⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⢸⣿⡷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
    }

    public static void soutbruja() {
        System.out.println("RODEADA DE UN AURA MÁGICA, LA BRUJA CONECTA UN PODEROSO RAYO ARCANO A SU ENEMIGO");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⢀⠀⠀⠀⠠⡶⠄⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣨⣷⣧⣀⠀⠀⠀⠀⠐⣤⡴⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⠀⡀⡀⠀⠀⠀⠈⢹⠋⠁\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⢻⠓⠀⠸⡮⠄⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠔⢲⠈⠀⠀⢀⠀⠀⠀⠼⡮\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣇⠔⠁⠀⠠⢷⠯⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⠟⠁⠀⠀⠀⠀⠸⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⢀⣴⣿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⢀⣴⣿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⢀⣴⣿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⡔⢁⠜⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
    }
}









