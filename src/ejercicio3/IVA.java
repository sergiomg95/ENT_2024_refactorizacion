package ejercicio3;

public class IVA extends Impuesto{

	public IVA(double impuesto) {
		super(impuesto);
	}

	public double totalIVA(double impuesto, double ingresos) {
		
		impuesto=calcularIVA(ingresos);
		return impuesto;
		
	}
	private double calcularIVA(double ingresos) { 

		double impuesto; 

		if (ingresos < 10000) { 

		 impuesto = ingresos * 0.10; 

		} else if (ingresos >= 10000 && ingresos < 50000) { 

		 impuesto = ingresos * 0.15; 

		} else { 

		 impuesto = ingresos * 0.20; 

		}
		return impuesto; 
	}
}