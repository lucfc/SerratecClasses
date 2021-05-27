package programa;

import java.util.*;


public class BalancoAnualLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int soma = 0, i = 1, soma1 = 0, soma2 = 0, soma3 = 0, soma4 = 0;
		
		for(i = 1; i<=12; i++) {
			System.out.println("Escreva o gasto do mês : " + i);
			int gastoMes = leia.nextInt();
			
			soma = soma + gastoMes;
			
			if(i > 9 && i <= 12) {
					soma4 = soma4 + gastoMes;
			}else if (i > 6 && i <= 9) {
				soma3 = soma3 + gastoMes;
			}else if (i > 3 && i <= 6) {
				soma2 = soma2 + gastoMes;
			}else if (i <= 3) {
				soma1 = soma1 + gastoMes;
			}
		}
		
		System.out.println("A soma dos gastos do 1 trimestre é " + soma1);
		System.out.println("A soma dos gastos do 2 trimestre é " + soma2);
		System.out.println("A soma dos gastos do 3 trimestre é " + soma3);
		System.out.println("A soma dos gastos do 4 trimestre é " + soma4);
		System.out.println("Você gastou R$ " + soma + " em " + (i - 1) + " meses");
		
		leia.close();
	}
	
	
}
