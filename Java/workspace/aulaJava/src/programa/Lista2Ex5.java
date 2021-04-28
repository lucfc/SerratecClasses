package programa;

import java.util.*;

public class Lista2Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade, condicao, sexo;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		idade = scan.nextInt();
		
		System.out.println("Digite seu Sexo: \n1 - Feminino \n2 - Masculino \n");
		sexo = scan.nextInt();
		
		System.out.println("Possui condicao especial: \n1 - Gestante \n2 - Deficiente \n3 - Não \n");
		condicao = scan.nextInt();
		
		scan.close();

		if(idade >= 60 || (condicao == 1 && sexo == 1) || condicao == 2){
			System.out.println("Fila preferencial!");
		}else{
			System.out.println("Fila comum!");
		}
	}

}
