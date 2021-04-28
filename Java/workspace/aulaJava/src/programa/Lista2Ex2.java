package programa;

import java.util.*;

public class Lista2Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l1, l2, l3; //  l == lado
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro lado: ");
		l1 = scan.nextInt();
		
		System.out.println("Digite o segundo lado: ");
		l2 = scan.nextInt();
		
		System.out.println("Digite o terceiro lado: ");
		l3 = scan.nextInt();
		
		scan.close();
		
		if(l1 <= 0 || l2 <= 0 || l3 <= 0) {
			
			System.out.println("O triangulo não pode existir");
			
		}else {

			if (l1 != l2 && l1 != l3 && l2 != l3 ) {
				System.out.println("O triângulo é escaleno");
			}else if ((l1 == l2 && l1 != l3) || (l1 == l3 && l1 != l2) || (l3 == l2 && l3 != l1)) {
				System.out.println("O triangulo é isósceles");
			}else {
				System.out.println("O triângulo é equilátero");
			}
		}
	}

}
