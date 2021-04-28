package programa;

import java.util.*;

public class Lista1Ex6 {
	
	public static void main(String[] args) {
		
		int n1; 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número para saber se é par: ");
		n1 = scan.nextInt();
		
		scan.close();
		
		if(n1 % 2 == 0) {
			System.out.println("O número é par");
		}else {
			System.out.println("O número é ímpar");
		}
	}
}
