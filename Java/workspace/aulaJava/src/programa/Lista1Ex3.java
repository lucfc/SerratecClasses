package programa;

import java.util.*;

public class Lista1Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int horasAno, horasExtraAno;
	
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Escreva o número de horas trabalhadas no ano: ");
	horasAno = leia.nextInt();
	
	System.out.println("Escreva o número de horas extras trabalhadas no ano: ");
	horasExtraAno = leia.nextInt();
	
	leia.close();
	
	System.out.println("Seu salário anual é de: R$ " + ((horasAno * 10) + (horasExtraAno * 15)));
	
		
	}

}
