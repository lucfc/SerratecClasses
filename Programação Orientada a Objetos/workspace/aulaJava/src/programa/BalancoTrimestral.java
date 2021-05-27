package programa;
/*
 Em nossa empresa, h� tabelas com o quanto foi gasto em cada m�s. Para fechar o balan�o do primeiro trimestre, precisamos somar o gasto total. Sabendo que, em Janeiro, foram gastos R$ 15000, em Fevereiro, R$ 23000, e em Mar�o, R$ 17000, fa�a um programa que calcule e imprima o gasto total no trimestre. Siga os passos :
Crie uma classe chamada BalancoTrimestral com um bloco main, como nos exemplos anteriores;
Dentro do main (o miolo do programa), declare uma vari�vel inteira chamada gastosJaneiro 
e inicialize-a com 15000;
Crie tamb�m as vari�veis gastosFevereiro e gastosMarco, inicializando-as com 23000 e 17000, respectivamente e utiliza uma linha para cada declara��o;
Crie uma vari�vel chamada gastosTrimestre e inicialize-a com a soma das outras 3 vari�veis;
Imprima a vari�vel gastosTrimestre.

*/
public class BalancoTrimestral {

	public static void main(String[] args) {

		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;
		
		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		
		System.out.println("O gasto do trimestre foi de R$ " + gastosTrimestre);
		
	}

}
