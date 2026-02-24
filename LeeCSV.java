import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeeCSV {
    public static void main(String[] args) {
        String rutaArchivo = "datos.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            int contador = 0;
            int sumaedades = 0;
            int totalestudiantes = 0;
            while ((linea = br.readLine()) != null) {
                String[] columnas = linea.split(",");
                int edad = Integer.parseInt(columnas[1]);
                int nota = Integer.parseInt(columnas[2]);

                if(nota >=90) {
                    contador++;
                }
               sumaedades += edad;
                totalestudiantes++;
                }
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo CSV: " + e.getMessage());
        }
    }
}
