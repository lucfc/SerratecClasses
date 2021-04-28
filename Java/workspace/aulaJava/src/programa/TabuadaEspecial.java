/*
 *TabuadaEspecial:
 */

package programa;
import java.util.*;

public class TabuadaEspecial {

	static int i;
	int numeroEscolhido;
	static int quantidade;
	static int multiplicador = 10;
	char linha;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner numeroEscolhido = new Scanner(System.in);
		Scanner quantidade = new Scanner(System.in);
		Scanner linha = new Scanner(System.in);
		
		
		System.out.println("Digite o numero da tabuada: ");
        int n1 = numeroEscolhido.nextInt();

        System.out.println("Digite o caracter de sua preferencia: ");
        char lin = linha.next().charAt(0);
        
        System.out.println("Digite A quantidade: ");
        int qtd = quantidade.nextInt();

        numeroEscolhido.close();
        quantidade.close();
        linha.close();
	
        escreveLinha(lin,  qtd);
        System.out.print("Numeros entre 1 e 5\n");
        escreveLinha(lin,  qtd);
        for(i=1; i<= multiplicador; i++){
            multiplicacao(i, multiplicador );
           System.out.print(i + " x " + n1 + " = " + (i*n1) + "\n");
        }
            
}
	
	static void escreveLinha(char lin,int quantidade2){
        int i;
        for(i=0;i<quantidade2;i++){
            System.out.print(lin);
        }
        System.out.println();
    }
	
	 static int multiplicacao(int num1, int num2){
	        int calculo = num1 * num2;
	        return calculo;
	 }
}
