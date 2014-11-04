package modelo;

public class Circulo extends Figura {

	public Circulo(String nombre, float x, float y, float radio) {
		super(nombre, x, y);
		this.radio = radio;
	}
	private final float PI = 3.14f;
	
	private float radio;
	
	
	
	public void imprimir(){
		super.imprimir();
		System.out.println("radio="+this.radio);
		System.out.println("Superficie: "+this.superficie());
	}
	
	@Override
	public float superficie() {
		return this.PI * this.radio * this.radio;
	}
	public float getRadio() {
		return radio;
	}
	public void setRadio(float radio) {
		this.radio = radio;
	}
	
	

}
