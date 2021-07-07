package ar.edu.unlam.pb2;

public class Zapatilla extends Indumentaria {

	private Integer talle;
	private String color;
	
	public Zapatilla(Integer codigo, String descripcion, Integer talle, String marca, String color, Double precio) {
		super(codigo, descripcion, marca, precio);
		this.talle = talle;
		this.color = color;
	}

	public Integer getTalle() {
		return talle;
	}

	public String getColor() {
		return color;
	}
	
}
