package ejercicio1;

public class Calculadora {

	public int sumar(int n1, int n2) {
		return n1 + n2;
	}

	public int restar(int n1, int n2) {
		return n1-n2;
	}

	public int multiplicar(int n1, int n2) {
		return n1*n2;
	}

	public float dividir(int n1, int n2) {
		if (n2 == 0) {
			System.out.println("Error: No se puede dividir por cero.");
			return 0;
		} else {
			return n1/n2;
		}
	}

}
