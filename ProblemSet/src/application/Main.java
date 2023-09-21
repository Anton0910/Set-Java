package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Set<Integer> setA = new HashSet<Integer>();
		
		Set<Integer> setB = new HashSet<Integer>();
		
		Set<Integer> setC = new HashSet<Integer>();
		
		
		
		Scanner sc = new Scanner(System.in);
		int cont = 0;
		System.out.println("How many students for course A?");
		cont = sc.nextInt();
		for(int i = 0; i<cont;i++) {
			setA.add(sc.nextInt());
		}
		System.out.println("How many students for course B?");
		cont = sc.nextInt();
		for(int i = 0; i<cont;i++) {
			setB.add(sc.nextInt());
		}
		
		System.out.println("How many students for course C?");
		cont = sc.nextInt();
		for(int i = 0; i<cont;i++) {
			setC.add(sc.nextInt());
		}
		
		Set<Integer> setTotal = new HashSet<Integer>(setA);
		
		setTotal.addAll(setB);
		setTotal.addAll(setC);
		
		System.out.println("Total students: ");
		System.out.println(setTotal.size());
		
		sc.close();

	}

}
