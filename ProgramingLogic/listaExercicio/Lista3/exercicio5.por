programa
{
	
	funcao inicio()
	{
		inteiro num, inverterNum = 0, ultimoDigito

		escreva("Digite um numero :")
		leia(num)

		inteiro num1 = num
		
		enquanto(num > 0){

			ultimoDigito = num % 10
			inverterNum = inverterNum * 10 + ultimoDigito
			num = num/10	
		}
	
		se(inverterNum == num1){
			escreva(num1, " é um número palíndromo ")
		}senao{
			escreva(num1, " Não é um número Palíndromo")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 152; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */