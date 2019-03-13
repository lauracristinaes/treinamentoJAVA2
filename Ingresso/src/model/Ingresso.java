package model;

public class Ingresso {
	
	
	private static double valor = 50.0;
	
	
	public String ImprimeValor() {
		String msg;
		msg = "O valor do ingresso é " + valor;
		
		return msg;
	}

	public static double getValor() {
		return valor;
	}

	public static void setValor(double valor) {
		Ingresso.valor = valor;
	}
	

}
