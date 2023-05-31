package Nivell1;
import java.util.*;
import java.util.stream.*;



public class Llista_main {

	public static void main(String[] args) {
		
		//Exercici 1
		
		//Crear la llista Strings 
		
		List<String> llistaStrings = new ArrayList<>();
		
		
		llistaStrings.add("loplppsdad");
		llistaStrings.add("Josepko");
		llistaStrings.add("Onafggf");
		llistaStrings.add("Olga");
		llistaStrings.add("LLuís");
		
		
		// Llista on guardar el resultat  
		
		List<String>llistaFinal = new ArrayList<String>();
				
				
			/*llistaFinal = llistaStrings.stream()
					.filter(lletra -> (lletra.contains("O") || lletra.contains("o"))) 
					.collect(Collectors.toList());
						
			// la condicció ha d'estar dins d'un parentesis sino no ho agafa
					
		
		/*for(String s: llistaFinal) { // Bucle for each  per veure que els noms amb O s'han guardat correctament
			
			System.out.println(s);
		}*/
		
		//llistaFinal.forEach(System.out::println); //Bucle amb lambda 
		
		
			
	    // Exercici2 
		
		/*List<String>comptar = new ArrayList<String>();  // metode normal 
		
		
		for(int i = 0; i <llistaStrings.size(); i++) {
			
			
			   String  nom  = llistaStrings.get(i);
			   
			   
			   if(nom.contains("O")||(nom.contains("o"))){
				      
				     int comptador; 
				      
				     if(nom.length() >= 5) {
				    	 
				    	 //afegir a la llista nova 
				    	 
				    	comptar.add(nom);
				    	 
				     }
				   
			   }
			S
			
		}*/
	
	    //comptar.forEach(System.out::println);
	
	  llistaFinal = llistaStrings.stream()
		.filter(lletra -> (lletra.contains("O") || lletra.contains("o")) && ((lletra.length()> 5))) 
		.collect(Collectors.toList());	    
	    
	    
	  llistaFinal.forEach(System.out::println); //Bucle amb lambda mostrar per pantalla si tenen O i la paraula és més gran que 5  
		
		
		

	}

}
