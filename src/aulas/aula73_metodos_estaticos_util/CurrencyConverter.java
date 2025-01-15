package aulas.aula73_metodos_estaticos_util;

public class CurrencyConverter {

	public static final double IOF = 6.00;
	
	public static double dollarToReal(double dollar, double real) {
		return dollar * real + (dollar * real * IOF / 100) ;
	}
	
}
