package org.lessons.java.security;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		// NOME
		System.out.println("Inserisci il tuo nome: ");
		String name = in.nextLine().replaceAll("\\s", "");
		
		// COGNOME
		System.out.println("Inserisci il tuo cognome: ");
		String surname = in.nextLine().replaceAll("\\s", "");
		
		//COLORE PREFERITO
		System.out.println("Inserisci il tuo colore preferito: ");
		String color = in.nextLine().replaceAll("\\s", "");
		
		// DATA DI NASCITA
		System.out.println("Inserisci la tua data di nascita nel formato gg/mm/aa :");
		String strDay = in.nextLine();
		String strMonth = in.nextLine();
		String strYear = in.nextLine();
		
		int numDay = Integer.valueOf(strDay);
		int numMonth = Integer.valueOf(strMonth);
		int numYear = Integer.valueOf(strYear);
		
		int sum = numDay+numMonth+numYear;
		
		System.out.println("Password Generata: " + name + "-" + surname + "-" + color + "-" + sum);
		
	}
}
