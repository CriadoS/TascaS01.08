package Nivell1_Ex4;

import java.util.ArrayList;
import java.util.List;

public class Exercici4 {

	public static void main(String[] args) {
		
		List<String>llista = new ArrayList<String>();
		

		llista.add("Gener");
		llista.add("Febrer");
		llista.add("Març");
		llista.add("Abril");
		llista.add("Maig");
		llista.add("Juny");
		llista.add("Juliol");
		llista.add("Agost");
		llista.add("Septembre");
		llista.add("Octubre");
		llista.add("Novembre");
		llista.add("Desembre");
		
		
		llista.forEach(System.out::println); // bucle for each amb method reference 
		
		

	}

}
