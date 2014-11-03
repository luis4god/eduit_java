package modelo;

public class Circulo extends Figura {

	private final float PI = 3.14f;
	
	private float radio;
	
	public void imprimir(){
		super.imprimir();
		System.out.println("radio="+this.radio);
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
