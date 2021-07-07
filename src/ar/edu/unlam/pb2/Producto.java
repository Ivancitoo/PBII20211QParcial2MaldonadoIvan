package ar.edu.unlam.pb2;

public class Producto {

	private Integer stock;
	private Integer codigo;
	private String marca;
	private String descripcion;
	private Double precio;
	
	public Producto(Integer codigo, String descripcion, String marca, Double precio) {
		this.codigo =codigo;
		this.descripcion = descripcion;
		this.marca = marca;
		this.precio = precio;
		this.stock = 0;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getMarca() {
		return marca;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public Double getPrecio() {
		return precio;
	}

	public void subirStock() {
		this.stock++;
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

}
