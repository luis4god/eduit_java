package java03;

public class Principal {

	private String datoA;
	private String datoB;
	private String datoC;
	
	public static int cant = 0;

	public static void main(String[] args) {
		Principal p1 = new Principal();

	}

	Principal() {
		Principal.cant++;
	}

	Principal(String a, String b, String c) {
		this.datoA = a;
		this.datoB = b;
		this.datoC = c;

	}

}
