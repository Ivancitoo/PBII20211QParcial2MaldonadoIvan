package ar.edu.unlam.pb2;

public class Televisor extends Electrodomestico {
	
	private Integer pulgadas;
	private Integer garantia;
	
	public Televisor(Integer codigo, String descripcion, Integer pulgadas, Integer garantia, String marca, Double precio) {
		super(codigo, descripcion, marca, precio);
		this.pulgadas = pulgadas;
		this.garantia = garantia;
	}

	public Integer getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(Integer pulgadas) {
		this.pulgadas = pulgadas;
	}

	public Integer getGarantia() {
		return garantia;
	}

	public void setGarantia(Integer garantia) {
		this.garantia = garantia;
	}

}
