package Nivell3_ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main_Alumne {

	public static void main(String[] args) {
		
		List<Alumne> llistaAlumnes = new ArrayList<Alumne>();
		
		Alumne alumne1 = new Alumne("Carles", 25,"php",5.75f);
		Alumne alumne2 = new Alumne("Maria", 28,"java",2.25f);
		Alumne alumne3 = new Alumne("Alicia", 34,"Data Science",4.2f);
		Alumne alumne4 = new Alumne("Joan", 16,"java",7.5f);
		Alumne alumne5 = new Alumne("Pep", 20,"php",5.3f);
		Alumne alumne6 = new Alumne("Alba", 27,"php",8.0f);
		Alumne alumne7 = new Alumne("Eulàlia", 17,"Data Science",6.5f);
		Alumne alumne8 = new Alumne("Merçe", 36,"java",8.5f);
		Alumne alumne9 = new Alumne("Lluís", 41,"php",2.5f);
		Alumne alumne10 = new Alumne("Claudia", 50,"Data Science",5.5f);
		
		llistaAlumnes.add(alumne1);
		llistaAlumnes.add(alumne2);
		llistaAlumnes.add(alumne3);
		llistaAlumnes.add(alumne4);
		llistaAlumnes.add(alumne5);
		llistaAlumnes.add(alumne6);
		llistaAlumnes.add(alumne7);
		llistaAlumnes.add(alumne8);
		llistaAlumnes.add(alumne9);
		llistaAlumnes.add(alumne10);
		
		
		//Mostrar tots els noms dels alumnes amb la seva edat. 
		llistaAlumnes.stream()
		 	.forEach(alumne -> System.out.println("Nom:"+ alumne.getNom()+ " edat: "+ alumne.getEdat()));
		
		// Mostrar els alumnes que comencen per la lletra A
		
		List<Alumne> llistaA = llistaAlumnes.stream()
				.filter(alumne -> alumne.getNom().startsWith("A"))
				.collect(Collectors.toList());
		
		llistaA.forEach(alumne ->System.out.println(alumne.getNom()));
		
		//Mostra els alumnes que tenen una nota superior 	
		llistaAlumnes.stream()
			.filter(alumne -> alumne.getNota()>5)
			.forEach(alumne -> System.out.println("Nom:"+ alumne.getNom() + " nota: "+ alumne.getNota()));
		
		//Filtra i mostra per pantalla els alumnes que tenen un nota de 5 o més, i que no són de PHP.
		llistaAlumnes.stream()
			.filter(alumne -> alumne.getNota()>5 && !alumne.getCurs().contains("php")) // posar l'operador negar perquè no sortin dels php
			.forEach(alumne -> System.out.println("Nom:"+ alumne.getNom() + " curs: "+ alumne.getCurs()));
		
		System.out.println("------------------");
		//Mostra tots els alumnes que fan JAVA i són majors d’edat.
		llistaAlumnes.stream()
			.filter(alumne ->alumne.getCurs().contains("java") && alumne.getEdat()>=18)
			.forEach(alumne -> System.out.println("Nom:"+ alumne.getNom() + " curs: "+ alumne.getCurs() +" edat:"+alumne.getEdat()));
		
	}

}
