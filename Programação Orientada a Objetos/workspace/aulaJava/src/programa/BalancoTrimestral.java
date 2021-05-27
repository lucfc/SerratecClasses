package programa;
/*
 Em nossa empresa, há tabelas com o quanto foi gasto em cada mês. Para fechar o balanço do primeiro trimestre, precisamos somar o gasto total. Sabendo que, em Janeiro, foram gastos R$ 15000, em Fevereiro, R$ 23000, e em Março, R$ 17000, faça um programa que calcule e imprima o gasto total no trimestre. Siga os passos :
Crie uma classe chamada BalancoTrimestral com um bloco main, como nos exemplos anteriores;
Dentro do main (o miolo do programa), declare uma variável inteira chamada gastosJaneiro 
e inicialize-a com 15000;
Crie também as variáveis gastosFevereiro e gastosMarco, inicializando-as com 23000 e 17000, respectivamente e utiliza uma linha para cada declaração;
Crie uma variável chamada gastosTrimestre e inicialize-a com a soma das outras 3 variáveis;
Imprima a variável gastosTrimestre.

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
