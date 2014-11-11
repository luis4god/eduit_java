package java05;

import java.io.IOException;
import java.util.Properties;

public class Inicio {

	public static void main(String[] args) {
		String mensaje = "          lkjdsaf e adkcjolsdiafoie asdflksja ee afsdkjsdlkje eekjña`´PEEEE     ";
		int contador = 0;
		int index = -1;
		
		index =mensaje.indexOf("e");
	
		while((index = mensaje.indexOf("e", index + 1)) != -1){
			contador++;
			index = mensaje.indexOf("e", index + 1);
		}
		System.out.println(contador);
		
		System.out.println(mensaje.length());
		
		String[] split= mensaje.split(" ");
		
		for(int i = 0; i < split.length ; i ++)
			System.out.println(split[i]);
		
		System.out.println(mensaje);
		System.out.println(mensaje.substring(5));
		System.out.println(mensaje.substring(5, 25));
		
		System.out.println(mensaje.length());
		System.out.println(mensaje.trim().length());
		
	
		String[] envs = System.getenv("PATH").split(";");
		
		for(int i = 0; i< envs.length;i++)
			System.out.println(envs[i]);
				
		String[] properties = System.getProperties().toString().split(",");
		
		for(int i = 0; i< properties.length; i++)
			System.out.println(properties[i]);
		
		System.out.println();
		

	}

}
