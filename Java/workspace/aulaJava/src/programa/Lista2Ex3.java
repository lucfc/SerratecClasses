package programa;

import java.util.*;

public class Lista2Ex3 {

	public static void main(String[] args) {
			// TODO Auto-generated method stub

		char n;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma letra: ");
		n = scan.next().charAt(0);
		
		scan.close();
		
		if (n == 'a' || n == 'e' || n == 'i' || n == 'o' || n == 'u' || n == 'A' || n == 'E' || n == 'I' || n == 'O' || n == 'U'){
			System.out.println(n + " é uma vogal");
		}else{
			System.out.println(n + " é uma consoante");
		}
		
	}
}
