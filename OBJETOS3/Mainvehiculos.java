package OBJETOS3;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Mainvehiculos {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        LinkedHashSet<Vehiculo> Listavehiculos = new LinkedHashSet<>();
        boolean compwhile = false;
        while (!compwhile){
            System.out.println("INSTANCIAR VEHÍCULO: 1");
            System.out.println("MOSTRAR LISTA DE VEHÍCULOS: 2");
            System.out.println("SALIR: 3");
            int elecusu = sc.nextInt();

            switch (elecusu){

                case 1:{
                    registrarvehiculo(Listavehiculos);
                    break;
                }

                case 2:{
                    mostrarlista(Listavehiculos);
                    break;
                }

                case 3:{
                    compwhile = true;
                    break;
                }

            }

        }

    }

    public static void registrarvehiculo(LinkedHashSet<Vehiculo> Listavehiculos){
        System.out.println("INTRODUCE EL VEHÍCULO QUE QUIERAS REGISTRAR");
        System.out.println("CICLOMOTOR, CAMION O TURISMO");
        String vehiculousu = sc.next();
        vehiculousu = vehiculousu.toUpperCase().trim();

        switch (vehiculousu){

            case "TURISMO":{
                Turismo turismo = new Turismo("prueba", 0, 1, 3, "PROFESIONAL");
                System.out.println("MARCA DEL TURISMO: ");
                String marca = turismo.marcausu();
                System.out.println("NUMERO DE RUEDAS DEL TURISMO: ");
                int numruedas = turismo.ruedasusu();
                System.out.println("PRECIO DEL TURISMO");
                int preciovehi = turismo.preciousu();
                System.out.println("NUMERO DE PASAJEROS QUE PUEDE ALBERGAR EL TURISMO: ");
                int numpasajeros = turismo.pedirpasajeros();
                System.out.println("USO QUE SE LE VA A DAR AL TURISMO: PROFESIONAL O PARTICULAR");
                String usousu = turismo.pediruso();
                Turismo turismousu = new Turismo(marca, numruedas, preciovehi, numpasajeros, usousu);
                Listavehiculos.add(turismousu);
                break;
            }

            case "CAMION":{
                Camion camion = new Camion("prueba", 0, 1, 3, false);
                System.out.println("MARCA DEL CAMION: ");
                String marca = camion.marcausu();
                System.out.println("NUMERO DE RUEDAS DEL CAMION: ");
                int numruedas = camion.ruedasusu();
                System.out.println("PRECIO DEL CAMION");
                int preciovehi = camion.preciousu();
                System.out.println("PESO MAXIMO QUE PUEDE CARGAR EL CAMION");
                int pesomaximo = camion.pedirmasamaxima();
                System.out.println("¿TRANSPORTA MERCANCÍA PELIGROSA?");
                boolean mercancia = camion.espeligrosa();
                Camion camionusu = new Camion(marca,numruedas,preciovehi,pesomaximo,mercancia);
                Listavehiculos.add(camionusu);
                break;
            }

            case "CICLOMOTOR":{
                Ciclomotor ciclomotor = new Ciclomotor("prueba", 0, 1,0);
                System.out.println("MARCA DEL CICLOMOTOR: ");
                String marca = ciclomotor.marcausu();
                System.out.println("NUMERO DE RUEDAS DEL CICLOMOTOR: ");
                int numruedas = ciclomotor.ruedasusu();
                System.out.println("PRECIO DEL CICLOMOTOR");
                int preciovehi = ciclomotor.preciousu();
                System.out.println("CILINDRADA DEL CICLOMOTOR");
                int cilindrada = ciclomotor.pedircilindrada();
                Ciclomotor ciclomotorusu = new Ciclomotor(marca, numruedas, preciovehi, cilindrada);
                Listavehiculos.add(ciclomotorusu);
                break;
            }
            default:
                System.out.println("VEHÍCULO NO VÁLIDO");

        }

    }

        public static void mostrarlista(LinkedHashSet<Vehiculo> Listavehiculos){
        for (Vehiculo sanche : Listavehiculos){
            if (sanche instanceof Turismo){
                ((Turismo) sanche).mostrarinfo();
            }
            else if (sanche instanceof Camion){
                ((Camion) sanche).mostrarinfo();
            }
            else if (sanche instanceof Ciclomotor) {
                ((Ciclomotor) sanche).mostrarinfo();
            }
        }

        }
}
