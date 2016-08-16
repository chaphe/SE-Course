package ejercicio1;

public class SumaDinero {
	
	private int cantidad;
	private String moneda;
		
	public SumaDinero(int cantidad, String moneda) {
		this.cantidad = cantidad;
		this.moneda = moneda;
	}
	
	public SumaDinero(String representacion) {
		this.moneda = representacion.substring(0, 3);
		if (representacion.length() < 7)
			this.cantidad = Integer.parseInt(representacion.substring(4));
		else 
			this.cantidad = 0;
	}

	public int getCantidad() {
		return cantidad;
	}

	public String getMonedad() {
		return moneda;
	}

	public void sumar(SumaDinero otraSuma) {
		this.cantidad = otraSuma.cantidad;
	}

	public boolean equals(Object otro) {
		SumaDinero otraSuma = (SumaDinero) otro;
		if (otraSuma.cantidad == cantidad)
			return true;
		return false;
	}

}
