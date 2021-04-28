/*
 * SomaNumerosSequenciais:
 */
package programa;

import java.util.Scanner;


public class SomaSequencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner numero = new Scanner(System.in);
		
		
		System.out.print("Escreva um numero: ");
		int seq = numero.nextInt(), soma = 0;
		
		for(int i = 1; i <= seq; i++) { 
			System.out.print(i + " ");
			soma = soma + i;
		}
		
		System.out.println();
		System.out.println(soma);
		
		numero.close();
	}

}
