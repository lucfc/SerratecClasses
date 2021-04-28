package programa;

import java.util.*;


public class Lista1Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int graus;
		float fahrenheit;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor da temperatura em Celsius: ");
		graus = leia.nextInt();
		
		leia.close();
		
		fahrenheit = ((graus * 9)/5 ) + 32;
		
		System.out.println(graus + " Graus Celsius é o mesmo que " + fahrenheit + " Graus Fahrenheit");
		
	}

}
