package Nivell2_ex4;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Exercici4 {

	public static void main(String[] args) {
		
		/*
		 * Crea una llista que contingui algunes cadenes de text i nombres.

			Ordena-les per:
			Alfabèticament pel primer caràcter. (Nota: charAt(0) retorna el codi numèric del primer  caràcter) 
			Les cadenes que contenen una "e" primer, la resta de cadenes després. Posa el codi directament a la lambda.  
			Modifica tots els elements de la llista que tenen una ‘a’. Modifica la ‘a’ per un ‘4’.
			Mostra només els elements que són numèrics. (Encara que estiguin guardats com Strings).   
		 * 
		 */
		
		List<Object> llista = new ArrayList<Object>();
		
		llista.add("paraules");
		llista.add("hola");
		llista.add(123);
		llista.add("adeu");
		llista.add(15);
		llista.add(26);
		llista.add("casa");
		llista.add("flor");
		llista.add("empresa");
		
		//Mostrar la llista ordenada alfabèticament 
		llista.sort(Comparator.comparingInt(element -> {
			
			if(element instanceof String) {
				  
				  return ((String) element).charAt(0); // faig el casting de l'objecte a string i ordena pel valor del char0
			  }
			  else {
				 
				  return 0;			  
			  }
	
		}));
		
		llista.forEach(System.out::println);
		System.out.println("------------------");
		
		//Mostrar la paraules que tenen la e primer que les altres 
		List<String> resultat = llista.stream()
				.map(Object::toString) // converteixo els objectes en string 
				.sorted(Comparator.comparingInt(element -> element.contains("e") ? 0:1)) // operador ternari																		// e li asigna el 0 i llavors el posar al primer lloc 
				.collect(Collectors.toList());
				
		resultat.forEach(System.out::println);
		
		
		System.out.println("------------------");
		// Modificar la e per un 4 
		List<String> modificacio = llista.stream()
				.map(Object::toString)
				.map(element -> element.contains("e") ? element.replace("e","4"): element) //operador ternari, si te e la canvia per4
				.collect(Collectors.toList());
		
		modificacio.forEach(n-> System.out.println(n));
		
		
		System.out.println("------------------");
		//mostra nomes els elements numerics 
		
		llista.sort(Comparator.comparingInt(element -> {
			
			if(element instanceof Integer) {
				  
				  return ((Integer) element); //fa el casting dels númerics 
			  }
			  else {
				 
				  return 0;			  
			  }
	
		}));
		
		llista.forEach(n -> System.out.println(n));

	}

}
