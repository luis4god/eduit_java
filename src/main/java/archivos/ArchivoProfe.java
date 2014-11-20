package archivos;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author alumno
 */
public class ArchivoProfe {

    public static final int CAPACIDAD_BUFFER = 10;

    public static void main(String args[]) throws Exception {
        byte[] origen = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".getBytes();

        InputStream is1 = new ByteArrayInputStream(origen);
        InputStream is2 = new FileInputStream("c:\\a.txt");

        leerStream(is1);
        System.out.println("-------------------");
        leerStream(is2);

        is1.close();
        is2.close();

    }

    public static void copiarChar() {
        char[] buffer = new char[CAPACIDAD_BUFFER];
        String x = "";
        int n;
        File arch = new File("c:\\b.txt");
        FileReader fis = null;
        FileWriter fos = null;

        try {
            fis = new FileReader("c:\\a.txt");
            while ((n = fis.read(buffer)) != -1) {
                if (n < CAPACIDAD_BUFFER) {
                    char[] aux = new char[n];
                    System.arraycopy(buffer, 0, aux, 0, n);
                    buffer = aux;
                }
                x += new String(buffer);
                System.out.println("LEIDO=" + new String(buffer) + ", CANTIDAD=" + n);
            }
            System.out.println(fis.getEncoding());
            System.out.println(x);

            fos = new FileWriter(arch);
            fos.write(x.toCharArray());
        } catch (FileNotFoundException ex) {
            System.out.println("Error: Archivo no existe.");
        } catch (IOException ex) {
            System.out.println("Error: Leyendo datos.");
        } finally {
            try {
                fis.close();
                fos.close();
            } catch (Exception ex) {
            }
        }

    }

    public static void copiarByte() {
        byte[] buffer = new byte[CAPACIDAD_BUFFER];
        String x = "";
        int n;
        File arch = new File("c:\\b.txt");
        InputStream fis = null;
        OutputStream fos = null;

        try {
            fis = new FileInputStream("c:\\a.txt");
            while ((n = fis.read(buffer)) != -1) {
                if (n < CAPACIDAD_BUFFER) {
                    byte[] aux = new byte[n];
                    System.arraycopy(buffer, 0, aux, 0, n);
                    buffer = aux;
                }
                x += new String(buffer);
                System.out.println("LEIDO=" + new String(buffer) + ", CANTIDAD=" + n);
            }
            System.out.println(x);

            fos = new FileOutputStream(arch);
            fos.write(x.getBytes());
        } catch (FileNotFoundException ex) {
            System.out.println("Error: Archivo no existe.");
        } catch (IOException ex) {
            System.out.println("Error: Leyendo datos.");
        } finally {
            try {
                fis.close();
                fos.close();
            } catch (Exception ex) {
            }
        }

    }

    public static void leerArrayByte() {
        byte[] origen = "123456789\nabcde".getBytes();
        byte[] buffer = new byte[CAPACIDAD_BUFFER];
        String x = "";
        int n;
        InputStream fis = null;

        try {
            fis = new ByteArrayInputStream(origen);
            while ((n = fis.read(buffer)) != -1) {
                if (n < CAPACIDAD_BUFFER) {
                    byte[] aux = new byte[n];
                    System.arraycopy(buffer, 0, aux, 0, n);
                    buffer = aux;
                }
                x += new String(buffer);
                System.out.println("LEIDO=" + new String(buffer) + ", CANTIDAD=" + n);
            }
            System.out.println(x);

        } catch (FileNotFoundException ex) {
            System.out.println("Error: Archivo no existe.");
        } catch (IOException ex) {
            System.out.println("Error: Leyendo datos.");
        } finally {
            try {
                fis.close();
            } catch (Exception ex) {
            }
        }

    }

    public static void leerStream(InputStream fis) throws IOException {
        byte[] buffer = new byte[CAPACIDAD_BUFFER];
        String x = "";
        int n;

        while ((n = fis.read(buffer)) != -1) {
            if (n < CAPACIDAD_BUFFER) {
                byte[] aux = new byte[n];
                System.arraycopy(buffer, 0, aux, 0, n);
                buffer = aux;
            }
            x += new String(buffer);
            System.out.println("LEIDO=" + new String(buffer) + ", CANTIDAD=" + n);
        }
        System.out.println(x);

    }

}
