package ejercicio2;

public class MonedaIncompatibleException extends Exception {
	
	private String moneda1;
	private String moneda2;
	
	public MonedaIncompatibleException(String m1, String m2) {
		this.moneda1 = m1;
		this.moneda2 = m1;
	}

	public String getMoneda1() {
		return moneda1;
	}


	public String getMoneda2() {
		return moneda2;
	}

}
