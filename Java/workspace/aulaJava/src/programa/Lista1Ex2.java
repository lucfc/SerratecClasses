package programa;

import java.util.*;

public class Lista1Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1, n2;
		double divisao;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		n1 = leia.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		n2 = leia.nextInt();
		
		divisao = n1/n2;
		
		leia.close();
		
		System.out.println("A soma de " + n1 + " + " + n2 + " � " + (n1+n2));
		System.out.println("A subtra�ao de " + n1 + " - "+  n2 + " � " + (n1-n2));
		System.out.println("A multiplica��o de " + n1 + " * "+  n2 + " � " + (n1*n2));
		System.out.println("A subtra�ao de " + n1 + " - "+  n2 + " � " + divisao);
		
	}

}
