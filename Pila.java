package it.corso.java.pila;

public class Pila {

	private int[] pila;
	private int indice;
	private int cells;
	
	public Pila (int a) {
		cells = a;
		indice = 0;
		pila = new int[cells];
	}
	
	public void insert (int a) {
		if (indice < cells) {
			pila[indice] = a;
			indice++;
		}else {
			System.out.println("La pila è piena");
		}
		
	}
	
	public void delete () {
		if(indice >= 1) {
			pila[indice - 1] = 0;
			indice--;
		}else {
			System.out.println("La pila è vuota");
		}
	}
	
	public void stamp () {
		for (int i=0; i<pila.length; i++) {
			System.out.println(i + " - " + pila[i]);
		}
	}
}


