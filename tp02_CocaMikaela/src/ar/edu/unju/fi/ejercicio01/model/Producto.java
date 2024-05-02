package ar.edu.unju.fi.ejercicio01.model;

import java.util.*;

public class Producto {
	
	private String codigo;
	private String descripcion;
	private double precio_unitario;
	private Origen_Fabricacion origen;
	private Categoria categoria;
	
	Scanner sc = new Scanner(System.in);
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}
	
	public Producto(String codigo, String descripcion, double precio_unitario, Origen_Fabricacion origen,
			Categoria categoria) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precio_unitario = precio_unitario;
		this.origen = origen;
		this.categoria = categoria;
	}
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio_unitario() {
		return precio_unitario;
	}

	public void setPrecio_unitario(double precio_unitario) {
		this.precio_unitario = precio_unitario;
	}

	public Origen_Fabricacion getOrigen() {
		return origen;
	}

	public void setOrigen(Origen_Fabricacion origen) {
		this.origen = origen;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	

	public enum Origen_Fabricacion{
		ARGENTINA, CHINA, BRASIL, URUGUAY; 
	}
	
	public enum Categoria{
		TELEFONIA, INFORMATICA, ELECTROHOGAR, HERRAMIENTAS;
	}
	
	public void crear(Producto producto) {
		System.out.println("ingrese el codigo del producto: ");
		producto.setCodigo(sc.next());
		System.out.println("ingrese la descripcion del producto: ");
		producto.setDescripcion(sc.nextLine());
		System.out.println("ingrese el precio del producto: ");
		producto.setPrecio_unitario(sc.nextDouble());
		origen(producto);
		categoria(producto);
	}
	
	public void origen(Producto producto) {
		int op;
		do {
		System.out.println("-----origen de fabricacion-----");
		System.out.println("1- Argentina");
		System.out.println("2- China");
		System.out.println("3- Brasil");
		System.out.println("4- Uruguay");
		System.out.println("Elija una opcion: ");
		op = sc.nextInt();
		}
		while(op>=1 && op<=4);
		
		switch(op)
		{
		case 1: 
			producto.setOrigen(Origen_Fabricacion.ARGENTINA);
		break;
		
		case 2:
			producto.setOrigen(Origen_Fabricacion.BRASIL);
		break;
		
		case 3:
			producto.setOrigen(Origen_Fabricacion.CHINA);
		break;
		
		case 4:
			producto.setOrigen(Origen_Fabricacion.URUGUAY);
		break;
		
		default:
			System.out.println("Se produjo un error durante la seleccion de origen");
		}
		
	}
	
	public void categoria(Producto producto) {
		int op;
		do {
		System.out.println("-----Categoria-----");
		System.out.println("1- Telefonia");
		System.out.println("2- Informatica");
		System.out.println("3- Electro hogar");
		System.out.println("4- Herramientas");
		System.out.println("Elija una opcion: ");
		op = sc.nextInt();
		}
		while(op>=1 && op<=4);
		
		switch(op)
		{
		case 1: 
			producto.setCategoria(Categoria.TELEFONIA);
		break;
		
		case 2:
			producto.setCategoria(Categoria.INFORMATICA);
		break;
		
		case 3:
			producto.setCategoria(Categoria.ELECTROHOGAR);
		break;
		
		case 4:
			producto.setCategoria(Categoria.HERRAMIENTAS);
		break;
		
		default:
			System.out.println("Se produjo un error durante la seleccion de categoria");
		}
	}
	
	

	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", descripcion=" + descripcion + ", precio_unitario=" + precio_unitario
				+ ", origen=" + origen + ", categoria=" + categoria + "]";
	}
	
	
}
