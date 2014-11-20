package archivos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ArchivoLoco {

	public static void main(String[] args) {

		if (args.length == 0)
			System.exit(1);

		byte[] buffer = new byte[10];

		int n;

		String salida = "";

		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}

		// stream orientados a byte tiene input outout
		/*
		 * FileInputStream > byte FileOutoutStream > byte
		 * 
		 * FileReader > char FileWriter > char
		 * 
		 * tiene el metodo read
		 */
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("/luisws/conf.properties.txt");

			while ((n = fis.read(buffer)) != -1) {
				for (int i = n; i < 10; i++)
					buffer[i] = 0;
				salida += new String(buffer);
			}
			System.out.println(salida);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public static void copiarBytes() {

	}

	public static void mostrarArchivoChar() {

	}

	public static void copiarChar() {

	}

}
