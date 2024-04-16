package ejercicio1;

public class Calculadora {

	public int sumar(int suma1, int suma2) {
		return suma1 + suma2;
	}

	public int restar(int minuendo, int sustraendo) {
		return minuendo-sustraendo;
	}

	public int multiplicar(int factor1, int factor2) {
		return factor1*factor2;
	}

	public float dividir(int dividendo, int divisor) {
		if (divisor == 0) {
			//TODO DIVISION POR CERO.¿LANZAR EXCEPCION?
			return 0;
		} else {
			return dividendo/divisor;
		}
	}

}
