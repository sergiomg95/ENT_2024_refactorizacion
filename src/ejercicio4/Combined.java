package ejercicio4;

public class Combined {

	public class Calculadora {
		public static final int SUMA=10;
		public static final int RESTA=20;
		
		public int  operacion(int operador1,int operador2,int operacion) throws Exception {
			
			switch(operacion) {
			case SUMA: return operador1 + operador2;
			case RESTA:return operador1 + operador2;
			default:throw new Exception("operacion  incorrecta");
			}

		}
	   

	   
	}

}
