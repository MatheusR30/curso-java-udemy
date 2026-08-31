package aulas;

import java.util.Scanner;

public class NumeroPar {
	
	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		System.out.println("Teste o número para saber se é PAR ou IMPAR: ");
		
		int numero = valor.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("Esse número é PAR. ");	
		} else {
			System.out.println("Esse número é IMPAR. ");
		}
		System.exit(0);			
	}
}
