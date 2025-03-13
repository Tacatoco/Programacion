import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;

public class B2 {
    public static void main(String[] args) throws FileNotFoundException {
        String alumnos = "Documentos/alumnos_notas.txt";

        try(BufferedReader lectura = new BufferedReader(new FileReader(alumnos))){
            ArrayList<String> nombres = new ArrayList<>();
            ArrayList<Double> notasmedia = new ArrayList<Double>();
            String linea;

        while((linea = lectura.readLine()) != null){
            linea = linea.trim();
            String[] alumno = linea.split("\\s+");
            double notastotales = 0;
            int contador = 0;

            String nombrecompleto = alumno[0] + " " + alumno[1];
            nombres.add(nombrecompleto);
            for (int i = 2; i < alumno.length; i++) {
               notastotales += Integer.parseInt(alumno[i]);
               contador++;
            }
            double media = notastotales / contador;
            notasmedia.add(media);
        }
            for (int i = 0; i < nombres.size(); i++) {
                System.out.println("EL ALUMNO -> " + nombres.get(i) + " TIENE UNA MEDIA DE -> " + String.format("%.2f", notasmedia.get(i)));
            }


        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }




    }
}
