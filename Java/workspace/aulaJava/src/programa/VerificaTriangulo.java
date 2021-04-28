/*
 VerificaTriangulo:
s */
package programa;

import java.util.Scanner;


public class VerificaTriangulo {

	public static void main(String[] args) {
	
		Scanner ang1 = new Scanner(System.in);
		Scanner ang2 = new Scanner(System.in);
		Scanner ang3 = new Scanner(System.in);
		
		int a1 = ang1.nextInt();
		int a2 = ang2.nextInt();
		int a3 = ang3.nextInt();
		
		if((a1 + a2 + a3)!= 180) {
			System.out.println("Não pode ser triangulo");
		}else {
			System.out.println("Pode ser um triangulo");
		}
		
		ang1.close();
		ang2.close();
		ang3.close();
	}

}
