package model;

public class IngressoCamaroteSuperior extends IngressoVIP{
	
	private static double valorAddCSup = 20.0;
	
	
	public String ImprimeValor() {
		String msg;
		msg = "O valor do ingresso é " + getValor() + getValorAdd() + valorAddCSup;
		
		return msg;
	}
	
	public static double getValorAddCSup() {
		return valorAddCSup;
	}

}
