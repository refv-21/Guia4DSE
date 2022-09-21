package datos;

public class Contacto {

private String nombre;
private long celular;

	public Contacto(String nombre, long celular) {
	super();
	this.nombre = nombre;
	this.celular = celular;
}
	@Override
	public String toString() {
		return "contacto [nombre=" + nombre + ", celular=" + celular + "]";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public long getCelular() {
		return celular;
	}
	public void setCelular(long celular) {
		this.celular = celular;
	}
}

