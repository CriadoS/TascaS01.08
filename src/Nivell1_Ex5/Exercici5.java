package Nivell1_Ex5;

public class Exercici5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*	Crea una Functional Interface amb un mètode anomenat getPiValue() 
			que ha de retornar un double. Des del main() de la classe principal,
			instància la interfície i assigna-li el valor 3.1415. 
			Invoca el mètode getPiValue() i imprimeix el resultat.
			
		 */
		
		double a = 3.1415;
		
		IExercici5 resultat = (valor) -> { 
			
			return valor;
		};
		
		
		System.out.println(resultat.getPiValue(a)); // Imprimir per pantalla el valor de Pi 
			
		
	}

}
