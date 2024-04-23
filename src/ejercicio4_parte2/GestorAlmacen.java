package ejercicio4_parte2;

import java.util.ArrayList;
import java.util.List;

public class GestorAlmacen {

	public static final int AGREGRAR_PRODUCTO = 100;
	public static final int ELIMINAR_PRODUCTO = 200;

	private List<String> productos = new ArrayList<>();

	public void modificarProducto(String producto, int modificarProducto) throws Exception {
		
		
		if (productos.contains(producto)&&modificarProducto==ELIMINAR_PRODUCTO) {
			productos.remove(producto);
		}
		else if(!productos.contains(producto)&&modificarProducto==AGREGRAR_PRODUCTO) {
			productos.add(producto);
		}
		else if(modificarProducto==AGREGRAR_PRODUCTO) {
			throw new Exception("Imposible añadir");
		}
		else if(modificarProducto==ELIMINAR_PRODUCTO) {
			throw new Exception("Imposible eliminar");
			}
		else throw new Exception("Operacion no soportada");
	}
}
