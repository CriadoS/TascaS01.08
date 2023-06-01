package Nivell2_ex3;

public class Main {

	public static void main(String[] args) {
		
		// Suma
		IFuntional calculador = (num1,num2)->{
			
			float resultat = num1 + num2;	
			
			return resultat;
		};
		
		calculador.operacio(10.4f, 6.30f);
		
		System.out.println(calculador.operacio(10.4f, 6.30f));
		
		//Resta
		
		IFuntional calculadorResta = (num1,num2)->{
			
			float resultat = num1 - num2;	
			
			return resultat;
		};
 		
		calculadorResta.operacio(10.4f, 6.30f);
		
		System.out.println(calculadorResta.operacio(10.4f, 6.30f));
		
		
		//Multiplicació 
		
		IFuntional calculadorMultiplicar = (num1,num2)->{
			
			float resultat = num1 * num2;	
			
			return resultat;
		};

		calculadorMultiplicar.operacio(10.4f, 6.30f);
		
		System.out.println(calculadorMultiplicar.operacio(10.4f, 6.30f));
		
		
		// Divisió
		
		IFuntional calculadorDivisio = (num1,num2)->{
			
			float resultat = num1 / num2;	
			
			return resultat;
		};
		
		calculadorDivisio.operacio(10.4f, 6.30f);
		
		System.out.println(calculadorDivisio.operacio(10.4f, 6.30f));
		
		
	}

}
