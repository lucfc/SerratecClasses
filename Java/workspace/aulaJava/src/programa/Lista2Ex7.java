package programa;

import java.util.Scanner;

public class Lista2Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1; 
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		n1 = scanner.nextInt();
		
		scanner.close();
		
		System.out.println("Todos os n�meros primos at� " + n1 + " s�o:");
		for(int i = 1; i <= n1; i++) {
			if (i % 2 != 0){
				System.out.print(i + " ");
			}
		}
	}

}
