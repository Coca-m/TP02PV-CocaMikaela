package ar.edu.unju.fi.ejercicio01.main;

import java.util.*;
import ar.edu.unju.fi.ejercicio01.model.Producto;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Producto> lista = new ArrayList<>();
		
		int op;
		do{
		System.out.println("Seleccione una opcion");
		System.out.println("1-Crear producto");
		System.out.println("2-Mostrar productos");
		System.out.println("3-Modificar producto");
		System.out.println("4-Salir");
		op = sc.nextInt();
		switch(op)
		{
		case 1: 
			Producto producto = new Producto();
			producto.crear(producto);
			lista.add(producto);
		break;
		
		case 2:
			lista.forEach(prod-> System.out.println(prod));
		break;
		
		case 3:
			System.out.println("Ingrese el codigo del producto que desea consultar");
			String codigo = sc.next();
			
			
		break;
		
		case 4:
			System.out.println("Finalizando programa");
		break;
		
		default:
			System.out.println("Opcion invalida");
		}
		}	
		while(op!=4);

	}

}
