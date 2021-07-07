package ar.edu.unlam.pb2;

public class Heladera extends Electrodomestico {
	
	private Boolean frost;
	private Integer garantia;
	
	

	public Heladera(Integer codigo, String descripcion, Boolean frost, Integer garantia, String marca, Double precio) {
		super(codigo, descripcion, marca, precio);
		this.frost = frost;
		this.garantia= garantia;

	}

	public Boolean isNoFrost() {
		return this.frost;
	}
	public Integer getGarantia() {
		return garantia;
	}
}
