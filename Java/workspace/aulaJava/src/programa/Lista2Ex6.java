package programa;

import java.util.*;

public class Lista2Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		n1 = scan.nextInt();
		
		scan.close();
		
		for(int i = 1; i <= n1; i++) {
			System.out.print(i + " ");
		}
	}

}
