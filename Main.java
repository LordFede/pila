package it.corso.java.pila;

public class Main {

	public static void main(String[] args) {
		
		Pila miaPila = new Pila(7);
		
		miaPila.delete();
		
		System.out.println();
		miaPila.stamp();
		
		System.out.println();
		miaPila.insert(23);
		miaPila.insert(12);
		
		miaPila.stamp();
		
		miaPila.delete();
		
		System.out.println();
		miaPila.stamp();
		
		miaPila.insert(23);
		miaPila.insert(12);
		miaPila.insert(7);
		miaPila.insert(39);
		
		System.out.println();
		miaPila.stamp();
		
		System.out.println();
		miaPila.insert(45);
		
		System.out.println();
		miaPila.stamp();

	}

}
