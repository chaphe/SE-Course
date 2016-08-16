package ejercicio3;

import java.util.HashMap;

public class Monedero {
	
	private HashMap<String, SumaDinero> contenido;
	
	public Monedero() {
		contenido = new HashMap<String, SumaDinero>();
	}
	
	public SumaDinero getValor(String moneda) {
		return contenido.get(moneda);
		
	}
	
	public void agregarSuma(SumaDinero suma) {
		contenido.put(suma.getMonedad(), suma);
	}
	
}
