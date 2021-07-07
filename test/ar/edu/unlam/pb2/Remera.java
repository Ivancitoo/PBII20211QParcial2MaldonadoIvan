package ar.edu.unlam.pb2;

public class Remera extends Indumentaria {
	
	private String talle;
	private String color;
	public Remera(Integer codigo, String descripcion, String talle, String marca, String color, Double precio) {
		super(codigo, descripcion, marca, precio);
		this.talle= talle;
		this.color=color;
	}
	public String getTalle() {
		return talle;
	}
	public String getColor() {
		return color;
	}

}
