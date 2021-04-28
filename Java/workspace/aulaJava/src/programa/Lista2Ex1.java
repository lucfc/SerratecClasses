package programa;

import java.util.*;

public class Lista2Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		int ang1, ang2, ang3;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro angulo do triângulo: ");
		ang1 = scan.nextInt();
		
		System.out.println("Digite o segundo angulo do triângulo: ");
		ang2 = scan.nextInt();
		
		System.out.println("Digite o terceiro angulo do triângulo: ");
		ang3 = scan.nextInt();
		
		scan.close();
		
		int verificaTriangulo = ang1 + ang2 + ang3;
		
		if(verificaTriangulo == 180) {
			System.out.println("Pode ser um triângulo");
		}else {
			System.out.println("Não pode ser um triângulo");
		}
		

	}
}
