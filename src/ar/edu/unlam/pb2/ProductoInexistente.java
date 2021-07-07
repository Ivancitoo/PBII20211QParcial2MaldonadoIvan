package ar.edu.unlam.pb2;

public class ProductoInexistente extends Exception {

	public ProductoInexistente() {
		super("Este producto no existe");
	}
}
