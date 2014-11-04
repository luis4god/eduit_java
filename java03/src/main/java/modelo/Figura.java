package modelo;

public abstract class Figura {
	
	private float x;
	private float y;
	private String nombre;
	
	public Figura(String nombre, float x, float y){
		this.nombre = nombre;
		this.x = x;
		this.y = y;
	}
	
	public void imprimir(){
		System.out.println(this.nombre);
		System.out.println("x = "+this.x);
		System.out.println("y = "+this.y);
	}
	
	public abstract float superficie();

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
