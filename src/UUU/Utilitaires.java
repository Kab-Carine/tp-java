package UUU;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import m.Aliment;

import p.Potager;

import java.util.Scanner;

public class Utilitaires {
	
	public static int readInt() {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		try{
			i = sc.nextInt();
		}
		catch(Exception e) {	
		}
		return i;
	}	
	
		
	public static String saisieString() {
		try (Scanner sc = new Scanner(System.in)) {
			String s = sc.nextLine();
			return s;
		}
	}
	
	
	
	public static void printHashMap(HashMap<Aliment, Integer> gardeManger) {
		
		
		
		
	}

	//le truc qui print le potager doit indiquer par une lettre minuscule
	//ce qui n'est pas mûr, et par une majuscule ce qui est prêt à être recolté
	//donc, pas ce qui est en dessous!
	public static void printArrayList(ArrayList<Aliment> potager) {
		for (Aliment aliment : potager) {
			System.out.println(aliment.toString());
		}
	}
	
	public static void printPotager(HashMap<String, Potager> mapToPrint) {
		for (Entry<String, Potager> data : mapToPrint.entrySet()) {
			System.out.println(data);
		}
		
	}
	
	
	public static int returnMaxIndexFromAL(ArrayList<Aliment> potager) {
		for (Aliment aliment : potager) {
			System.out.println(aliment);
		}
		return 0;
		
	}
	
}
