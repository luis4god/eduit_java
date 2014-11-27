package archivos;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class PP {
	
	public void copiar(InputStream is, OutputStream os) throws IOException{
		int n;
		byte[] buff = new byte[10];
		
		while((n = is.read(buff)) != -1){
			os.write(buff, 0, n);
		}
		is.close();
		os.close();
	}

	public void copiarBuffer(InputStream is, OutputStream os) throws IOException{
		BufferedInputStream bis = new BufferedInputStream(is);
		Reader r = new FileReader("/repo/eduit_java/textoloco.txt");
		BufferedReader br = new BufferedReader(r);
		
		Writer w = new FileWriter("/repo/eduit_java/textosano.txt");
		BufferedWriter bw = new BufferedWriter(w);
		
		bw.write(br.readLine());
		
		br.close();
		bw.close();
		r.close();
		w.close();
	}

	
}
