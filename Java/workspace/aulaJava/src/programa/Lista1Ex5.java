package programa;

import java.util.*;

public class Lista1Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1, n2;
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Digite o primeiro n�mero: ");
		n1 = scanner.nextInt();
		
		System.out.println("Digite o sedundo n�mero: ");
		n2 = scanner.nextInt();
		
		scanner.close();
		
		if(n1 > n2) {
			System.out.println("O n�mero n1 " + n1 + " � maior que o n�mero n2 " + n2);
		}else if (n2 > n1) {
			System.out.println("O n�mero n2 " + n2 + " � maior que o n�mero n1 " + n1);
		}else {
			System.out.println("O n�mero n1 " + n1 + " � igual ao n�mero n2 " + n2);
		}
	}

}
