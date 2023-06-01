package Nivell2_ex1;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class N2_exercici1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> nomsPropis = new ArrayList<String>();
		
		
		nomsPropis.add("Maria");
		nomsPropis.add("Azahara");
		nomsPropis.add("Carles");
		nomsPropis.add("Joan");
		nomsPropis.add("Alba");
		
		
		List<String> resultat = nomsPropis.stream()
				.filter(element -> element.startsWith("A") && ((element.length()> 3)))
				.collect(Collectors.toList());
				
				
		resultat.forEach(System.out::println); // mostrar per pantalla resultat 
				
							

	}

}
