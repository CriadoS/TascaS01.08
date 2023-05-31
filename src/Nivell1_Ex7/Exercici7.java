package Nivell1_Ex7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Exercici7 {

	public static void main(String[] args) {
		// Crea una llista amb nombres i cadenes de text 
				//i ordena la llista amb les cadenes de més llarga a més curta.
								
		List<Object> llista = new ArrayList<>(); // amb el tipus object puc guardar a la llista diferent tipus
		
		llista.add("Hola");
		llista.add(25);
		llista.add("Em dic Sílvia");
		llista.add("nom");
		llista.add(630);
		llista.add("Com estàs");
				
		llista.sort(Comparator.comparingInt(element -> { 
			
				if(element instanceof String) {
					
					return ((String) element).length();
							//	Si element és un String es fa un casting pq era object i es mira la llargada 		
				}
				else 
					return 0; // sino és String es retorna 0.	
			}).reversed()); // si faig el mètode reversed() ordena de més llarg a més petit 
					
		llista.forEach(System.out::println);	
				

	}
}
