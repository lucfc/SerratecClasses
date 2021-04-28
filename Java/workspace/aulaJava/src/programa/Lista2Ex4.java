package programa;

import java.util.*;

public class Lista2Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double n1, n2, resposta;
		char operacao;
		Scanner scan = new Scanner(System.in);


		System.out.println("Digite um numero: ");
		n1 = scan.nextInt();

		System.out.println("Digite um numero: ");
		n2 = scan.nextInt();

		System.out.println("Digite a operação desejada (+, -, *, /): ");
		operacao = scan.next().charAt(0);
		
		scan.close();

			if(operacao == '+'){
				resposta = n1 + n2;
				System.out.println("O resultado da soma é " + resposta);
			}else{
				if(operacao == '-'){
					resposta = n1 - n2;
					System.out.println("O resultado da subtraçã o é " + resposta);
				}else{
					if(operacao == '*'){
						resposta = n1 * n2;
						System.out.println("O resultado da multiplicação é " + resposta);
					}else{
						if(operacao == '/'){
							 resposta = n1 / n2;
							System.out.println("O resultado da divisão é " + resposta);
						}else{
							System.out.println("Operacao inválida!");
						}
					}
				}
			}
	}
}

