/*
 * VerificaTrianguloEspecial:
 */

package programa;

import java.util.Scanner;


public class VerificaTrianguloEspecial {
	
	static Scanner angulo = new Scanner(System.in);
	static int a1;
	static int a2;
	static int a3;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		do{
			System.out.println("Escreva Angulos validos maiores que 0");
            menu();
        }
        while( a1<=0 || a2<=0 || a3<=0 );
		
		if((a1 + a2 + a3)!= 180) {
			System.out.println("Não pode ser triangulo");
		}else {
			System.out.println("Pode ser um triangulo");
		}
		angulo.close();
	}
	
	static void menu() {
		
		
		
		System.out.println("\nDigite o angulo 1: ");
		a1 = angulo.nextInt();

        System.out.println("Digite o angulo 2: ");
        a2 = angulo.nextInt();

        System.out.println("Digite o angulo 3: ");
        a3 = angulo.nextInt();
        
       
	}

}
