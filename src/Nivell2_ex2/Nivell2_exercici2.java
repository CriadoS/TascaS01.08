package Nivell2_ex2;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Nivell2_exercici2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Programa un mètode que retorna una cadena separada per comes, 
		 * basada en una llista d’Integers. Cada element ha d’anar precedit
		 *  per lletra “e” si el nombre és parell, o per la lletra “o”
		 *   si el nombre és imparell. Per exemple, si la llista d’entrada
		 *    és (3, 55, 44), la sortida ha de ser “o3, o55, e44”. Imprimeix el resultat.
		 */
		
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
		
		
		Function<List<Integer>,String> function = (element) ->{ // afago la interficie funcional Function que agafa un tipus i retorna
																// un altre. 	
			String x ="";

			for( int i : element) {

				if(i % 2== 0) { // si és parell li poso la e 

					x += ",e"+ i;
				}
				else {

					x += ",o" + i;
				}
				
			}
			return x;
			
		};
		
        System.out.println(function.apply(numeros)); // cridar al mètode apply de l'objecte Function 

	}

}
