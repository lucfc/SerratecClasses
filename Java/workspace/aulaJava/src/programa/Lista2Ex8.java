package programa;

import java.util.*;

public class Lista2Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1, soma = 0, resto;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		n1 = scan.nextInt();
		
		scan.close();
		
		while(n1 > 0) {
			resto = n1%10;
			soma = soma + resto;
			n1 = n1 /10;
		}
		
		System.out.println(soma);
	}

}
