package ejercicio4_parte2;

import java.util.ArrayList;
import java.util.List;

public class GestorAlmacen {

	public static final int AGREGRAR_PRODUCTO = 100;
	public static final int ELIMINAR_PRODUCTO = 200;

	private List<String> productos = new ArrayList<>();

	public void modificarProducto(String producto, int modificarProducto) throws Exception {
		switch (modificarProducto) {
		case AGREGRAR_PRODUCTO:
			if (!productos.contains(producto)) {
				productos.add(producto);
				System.out.println("Producto '" + producto + "' agregado al almacén.");
			} else {
				throw new Exception("El producto '" + producto + "' ya existe en el almacén.");
			}
		case ELIMINAR_PRODUCTO:
			if (productos.contains(producto)) {
				productos.remove(producto);
				System.out.println("Producto '" + producto + "' eliminado del almacén.");
			} else {
				throw new Exception("El producto '" + producto + "' no existe en el almacén.");
			}
			default:throw new Exception("Producto invalido");		}
	}
}
