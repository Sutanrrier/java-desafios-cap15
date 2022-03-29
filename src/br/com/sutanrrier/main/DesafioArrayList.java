package br.com.sutanrrier.main;

import java.util.ArrayList;
import java.util.Collections;

public class DesafioArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		for(int i=1; i<=1000; i++) {
			numeros.add(i);
		}
		Collections.sort(numeros);
		Collections.reverse(numeros);
		for(Integer numero : numeros) {
			System.out.println(numero);
		}

	}

}
