package programa;

import java.util.Scanner;

public class Lista3Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		numero = scan.nextInt();
		
		scan.close();
		
		for(int i = 1; i <= numero; i++) {
			System.out.println();
			for(int j = numero; j >= i; j--) {
				System.out.print(" ");	
			}
			for(int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
		}
	}

}
