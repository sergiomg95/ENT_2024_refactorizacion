package ejercicio7;

public class Calculadora {


	    public double calcularAreaCirculo(double radio) {
	        return Math.PI * radio * radio;
	    }
	    
	    public double calcularVolumenCilindro(double radio, double altura) {
	        return calcularAreaCirculo(radio) * altura;
	    }

}
