package model;

public class IngressoVIP extends Ingresso{

	private static double valorAdd = 30.0;
	
	
	public String ImprimeValor() {
		String msg;
		msg = "O valor do ingresso é " + getValor() + valorAdd;
		
		return msg;
	}
	
	public static double getValorAdd() {
		return valorAdd;
	}
}
