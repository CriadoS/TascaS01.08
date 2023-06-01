package Nivell2_ex2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Comparator;

public class N2_ex2 {

	public static void main(String[] args) {

		/*
		 * Programa un mètode que retorna una cadena separada per comes, 
		 * basada en una llista d’Integers. Cada element ha d’anar precedit
		 *  per lletra “e” si el nombre és parell, o per la lletra “o”
		 *   si el nombre és imparell. Per exemple, si la llista d’entrada
		 *    és (3, 55, 44), la sortida ha de ser “o3, o55, e44”. Imprimeix el resultat.
		 */

		//List<Integer> numerosString = new ArrayList<Integer>();
		List<Integer> numeros = new ArrayList<Integer>();

		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		numeros.add(6);
		numeros.add(7);
		numeros.add(8);
		numeros.add(9);
		numeros.add(10);

		
		INivell2_Ex2 interficeF = (element) -> {
			
			String x ="";

			for( int i : element) {

				if(i % 2== 0) {

					x += ",e"+ element;
				}
				else {

					x += ",o" + element;

				}
				
			}
			return x;

		};
		
		
		System.out.println(interficeF.cadenaEspais(numeros));
		

	}



}
