package java03;

import modelo.Circulo;
import modelo.Figura;
import modelo.Triangulo;

public class InicioFigura {
	
	public static void main(String[] args){
		Figura[] vecFig = new Figura[4];
		
		vecFig[0] = new Circulo("Circulo1", 35, 8, 2.45f);
		vecFig[0] = new Circulo("Circulo2", 20, 0, 8.45f);
		vecFig[0] = new Triangulo("Triangulo1", 35, 80, 5.4f,45);
		vecFig[0] = new Triangulo("Triangulo2", 35, 7, 6.5f,9);
		
		for(int i = 0; i < vecFig.length; i++){
			vecFig[i].imprimir();
		}
		
	}

}
