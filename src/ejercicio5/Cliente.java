package ejercicio5;

public abstract class  Cliente {

	    private String nombre;
	    private String apellido;
	    private Direccion direccion;
	   

	    // Getters y setters

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public void setApellido(String apellido) {
	        this.apellido = apellido;
	    }

	   
		public String getNombre() {
			return nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public Direccion getDireccion() {
			return direccion;
		}

		public void setDireccion(Direccion direccion) {
			this.direccion = direccion;
		}

		

}
