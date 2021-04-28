package programa;

import java.util.*;

public class Lista1Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome, sobrenome;
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Escreva o seu nome: ");
		nome = leia.next();
		
		System.out.println("Escreva o seu sobrenome: ");
		sobrenome = leia.next();
		
		System.out.println("Meu nome é " + nome + " " + sobrenome);
		
		leia.close();
	}

}
