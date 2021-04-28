package programa;

import java.util.*;

public class Lista3Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1, soma = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número");
		n1 = scan.nextInt();
		
		scan.close();
		for(int i = 1; i <= n1; i++) {
			soma = soma + i;
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println(soma);
		
		

	}

}
