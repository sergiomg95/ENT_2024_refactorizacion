package ejercicio3;

public class ISR extends Impuesto {

	public ISR(double impuesto) {
		super(impuesto);
	}

	public double totalISR(double impuesto, double ingresos) {

		impuesto = calcularISR(ingresos);
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

}
