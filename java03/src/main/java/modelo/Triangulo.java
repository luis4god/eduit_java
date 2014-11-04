package modelo;

public class Triangulo extends Figura {

	public Triangulo(String nombre, float x, float y, float base, float altura) {
		super(nombre, x, y);
		this.base = base;
		this.altura = altura;
	}

	private float base;
	private float altura;
	
	
	
	public void imprimir(){
		super.imprimir();
		System.out.println("base="+this.base);
		System.out.println("altura="+this.altura);
	}
	
	@Override
	public float superficie() {
		return this.base * this.altura / 2;
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	

}
