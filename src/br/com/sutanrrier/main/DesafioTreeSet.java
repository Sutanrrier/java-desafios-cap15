package br.com.sutanrrier.main;

import java.util.Random;
import java.util.TreeSet;

public class DesafioTreeSet {

	public static void main(String[] args) {
		Random aleatorio = new Random();
		
		TreeSet<Integer> numeros =  new TreeSet<>();

		for(int i=1; i<=100; i++) {
			numeros.add(aleatorio.nextInt(1000));
		}
		numeros = (TreeSet<Integer>) numeros.descendingSet();
		
		for(Integer numero : numeros) {
			System.out.println(numero);
		}
	}
}
