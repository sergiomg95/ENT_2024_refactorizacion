package ejercicio3;

public class IEPS extends Impuesto {

	public IEPS(double impuesto) {
		super(impuesto);
	}
	
	public double totalIEPS(double impuesto, double ingresos) {
		 impuesto = ingresos * 0.05; 
		return impuesto;
	}

}
