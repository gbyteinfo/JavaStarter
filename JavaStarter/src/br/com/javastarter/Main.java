package br.com.javastarter;

import java.util.Scanner;

public class Main {
	static String palavraSimples;
		
	public static void main(String[] args) {
		
		System.out.println("Hello World");
		
		Scanner scanner = new Scanner(System.in);
				
		String name;
		int age;
		boolean authorized;
		boolean discount;
		
		System.out.println("Digite seu nome: ");
		name = scanner.nextLine();
		
		System.out.println("\nDigite sua idade: ");
		age = scanner.nextInt();
		
		authorized = age >= 13 && age <= 25;
		discount = age < 18 || age >= 60;
		
		System.out.println("\n--- Resultado ---");
		System.out.println("Nome: " + name);
		System.out.println("Idade: " + age);
		
		 if (authorized) {
	            System.out.println("✅ Pode participar do grupo de jovens!");
	        } else {
	            System.out.println("❌ Não pode participar do grupo de jovens.");
	        }

	        if (discount) {
	            System.out.println("💸 Tem direito a atendimento preferencial.");
	        } else {
	            System.out.println("💰 Não tem direito a atendimento preferencial.");
	        }

	        scanner.close();
		
	}	
}
