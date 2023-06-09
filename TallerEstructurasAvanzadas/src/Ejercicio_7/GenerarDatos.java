package Ejercicio_7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Stack;

public class GenerarDatos {

    private String nombreArchivo = "pruebaF.txt";

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public void generarDatosSinRepetir(int n, int m) {

        try {
            String ruta = "pruebaF.txt";
            File file = new File(ruta);

            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            Stack< Integer> pCartas = new Stack< Integer>();
            for (int k = 0; k < m; k++) {
                for (int i = 0; i < n; i++) {
                    int valorEntero = (int) Math.floor(Math.random() * (1000000 - 0 + 1) + 0);
                    while (pCartas.contains(valorEntero)) {
                        valorEntero = (int) Math.floor(Math.random() * (1000000 - 0 + 1) + 0);
                    }
                    pCartas.push(valorEntero);
                    if (i != n - 1) {
                        bw.write(String.valueOf(valorEntero) + ",");
                    } else {
                        bw.write(String.valueOf(valorEntero) + "\n");
                    }
                }
            }
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int[] llenarArregloNuevo(int arr[], int line) {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            archivo = new File(nombreArchivo);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea;
            int j = 0;
            while ((linea = br.readLine()) != null) {
                //System.out.println(linea);
                if (j == line) {
                    String datos[] = linea.split(",");
                    for (int i = 0; i < datos.length; i++) {
                        arr[i] = Integer.parseInt(datos[i]);
                    }
                    //System.out.println(Arrays.toString("algo. " datos));
                }
                j++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        return arr;
    }

    public void Resultado(String resultado) {
        try {
            String ruta = "Resultado.txt";
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            int valorEntero = (int) Math.floor(Math.random() * (10000 - 0 + 1) + 0);
            bw.write(resultado);

            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int[] llenarArregloTxt(int arr[], int line, String txt) {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            archivo = new File(txt);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea;
            int j = 0;
            while ((linea = br.readLine()) != null) {
                //System.out.println(linea);
                if (j == line) {
                    String datos[] = linea.split(",");
                    for (int i = 0; i < datos.length; i++) {
                        arr[i] = Integer.parseInt(datos[i]);
                    }
                    //System.out.println(Arrays.toString("algo. " datos));
                }
                j++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        //System.out.println(Arrays.toString(arr));
        return arr;
    }

}
