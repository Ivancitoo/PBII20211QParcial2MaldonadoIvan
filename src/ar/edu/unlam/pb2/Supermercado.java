package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;



public class Supermercado {
	
	String nombre; // Nombre del supermercado
	private Set<Producto> productosExistentes; // Listado de productos que se comercializan
	private List<Producto> productosDisponibles; // Detalle de cada producto ingresado
	private Map<Integer, Venta> ventasRealizadas; // Listado de ventas realizadas (identificadas por el n�mero de venta)
	Integer contadorDeVentas; // Identificador del n�mero de venta
	
	public Supermercado(String nombre) {
		// Constructor de la clase
		this.nombre=nombre;
		this.productosExistentes = new HashSet<>();
		this.productosDisponibles = new ArrayList<>();
		this.ventasRealizadas = new HashMap<>();
	}

	public void ingresarProducto(Producto nuevo) {
		this.productosExistentes.add(nuevo);
		this.productosDisponibles.add(nuevo);
		nuevo.subirStock();
		
	}

	public Set<Producto> getOfertaDeProductos() {
		// Devuelve el conjunto de productos que se comercializan
		return this.productosExistentes;
	}
	
	public Integer getStock(Integer codigo) {
		// Devuelve la cantidad de unidades de un producto determinado
		Integer stockObtenido = 0;
		for (Producto producto : productosDisponibles) {
			if(producto.getCodigo().equals(codigo))
				stockObtenido += producto.getStock();
		}
		return stockObtenido;
		
	}
	
	private Boolean productoExiste(Integer codigoDeProducto) throws ProductoInexistente{
	for (Producto producto : productosExistentes) {
		if(producto.getCodigo().equals(codigoDeProducto) && producto != null)
			return true;
	}
	throw new ProductoInexistente();
	}
	
	private Producto getProductoPorCodigo(Integer codigoDeProducto) throws ProductoSinStock {
		// Busca la disponibilidad de un producto
		for (Producto producto : productosDisponibles) {
			if(producto.getCodigo().equals(codigoDeProducto) && producto.getStock()>0)
				return producto;
		}
		throw new ProductoSinStock();
	}
	
	public Integer registrarNuevaVenta(Integer dniDelComprador, String nombreDelComprador) {
		// Registra una nueva venta
		ventasRealizadas.put(++contadorDeVentas, new Venta(dniDelComprador, nombreDelComprador));
		return contadorDeVentas;
	}
	
	public Venta getVenta(Integer numeroDeVenta) {
		// Devuelve una venta en funci�n de su n�mero identificatorio
		
	

	public void agregarAlCarrito(Integer numeroDeVenta, Integer codigoDeProducto) throws ProductoSinStock, ProductoInexistente {
		// Incorpora al carrito de compras de la venta identificada por el "numeroDeVenta", el producto identificado por el "codigoDeProducto"
	}
	

}
