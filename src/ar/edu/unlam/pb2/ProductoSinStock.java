package ar.edu.unlam.pb2;

public class ProductoSinStock extends Exception {
	public ProductoSinStock() {
		super("No hay stock de este producto");
	}
}
