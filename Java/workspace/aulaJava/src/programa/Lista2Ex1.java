package programa;

import java.util.*;

public class Lista2Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		int ang1, ang2, ang3;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro angulo do tri�ngulo: ");
		ang1 = scan.nextInt();
		
		System.out.println("Digite o segundo angulo do tri�ngulo: ");
		ang2 = scan.nextInt();
		
		System.out.println("Digite o terceiro angulo do tri�ngulo: ");
		ang3 = scan.nextInt();
		
		scan.close();
		
		int verificaTriangulo = ang1 + ang2 + ang3;
		
		if(verificaTriangulo == 180) {
			System.out.println("Pode ser um tri�ngulo");
		}else {
			System.out.println("N�o pode ser um tri�ngulo");
		}
		

	}
}
