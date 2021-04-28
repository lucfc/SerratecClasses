package programa;

import java.util.*;

public class Lista1Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1, n2;
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Digite o primeiro número: ");
		n1 = scanner.nextInt();
		
		System.out.println("Digite o sedundo número: ");
		n2 = scanner.nextInt();
		
		scanner.close();
		
		if(n1 > n2) {
			System.out.println("O número n1 " + n1 + " é maior que o número n2 " + n2);
		}else if (n2 > n1) {
			System.out.println("O número n2 " + n2 + " é maior que o número n1 " + n1);
		}else {
			System.out.println("O número n1 " + n1 + " é igual ao número n2 " + n2);
		}
	}

}
