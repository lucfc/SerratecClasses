/*
 NumeroRepeticoes:
*/

package programa;

import java.util.Scanner;

public class NumeroRepeticoes {

	public static void main(String[] args) {
		System.out.println("Digite o número de repetições: ");
		Scanner number = new Scanner(System.in);
		
		int contador = number.nextInt();
		for(int i = 1; i <= contador; i++) {
			System.out.print(i);
		}
		
		number.close();
	}

}
