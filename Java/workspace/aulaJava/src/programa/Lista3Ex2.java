package programa;

import java.util.Scanner;

public class Lista3Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número");
		n1 = scan.nextInt();
		
		scan.close();
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(n1 + " x " + i + " = " + (i*n1));
		}
	}

}
