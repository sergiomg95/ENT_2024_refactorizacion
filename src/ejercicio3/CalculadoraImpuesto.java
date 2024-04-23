package ejercicio3;

public class CalculadoraImpuesto {

		 

public static final int IMPUESTO_IVA=10; 

public static final int IMPUESTO_ISR=20; 

public static final int IMPUESTO_IEPS=30; 

	 

	public double calcularImpuestoTotal(double ingresos, int tipoImpuesto) throws Exception { 

	 	  double impuesto = 0;  

	 if (tipoImpuesto==IMPUESTO_IVA) { 

	 impuesto = calcularIVA(ingresos); 

	 } else if (tipoImpuesto==IMPUESTO_ISR) { 

	 impuesto = calcularISR(ingresos); 

	 } else if (tipoImpuesto==IMPUESTO_IEPS) { 

	 impuesto = ingresos * 0.05; 
	 } else { 

	 throw new Exception("Tipo de impuesto no válido"); 

	 } 

	 return impuesto; 

	 } 
	private double calcularISR(double ingresos) { 

	double impuesto; 

	if (ingresos < 50000) { 

	 impuesto = ingresos * 0.20; 

	} else { 

	 impuesto = ingresos * 0.30; 

	} 

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
