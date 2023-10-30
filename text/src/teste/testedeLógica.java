package teste;

import java.util.Scanner;

public class testedeLógica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] lista1 = new int[4];
		Scanner scanner = new Scanner(System.in);
		boolean x = false;

		for(int i = 0; i < 4; i++) {
			System.out.println("Digite o número do apto: ");
				
				lista1[i] = scanner.nextInt();
				System.out.println(lista1[i]);
				
				for(int j = 0; j < i; j++) {
					do {
					if (lista1[i] == lista1[j]) {
						System.out.println(" Apartamento repetido!"); 
						lista1[i]=scanner.nextInt();
						x = true;
						} else {
							x = false;
						}
					}while (x == true); 
			} 
		} 
	} 
}
