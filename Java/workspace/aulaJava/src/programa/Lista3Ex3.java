package programa;

import java.util.*;

public class Lista3Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		
		Scanner leia = new Scanner(System.in);
		numero = leia.nextInt();
		
		leia.close();
		
		for(int i = 1; i <= numero; i++) {
			System.out.println();
			for(int j = 1; j <= i; j++) {
				System.out.print(j);
			}
		}
	}

}
