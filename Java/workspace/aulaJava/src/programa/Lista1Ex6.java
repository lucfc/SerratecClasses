package programa;

import java.util.*;

public class Lista1Ex6 {
	
	public static void main(String[] args) {
		
		int n1; 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero para saber se � par: ");
		n1 = scan.nextInt();
		
		scan.close();
		
		if(n1 % 2 == 0) {
			System.out.println("O n�mero � par");
		}else {
			System.out.println("O n�mero � �mpar");
		}
	}
}
