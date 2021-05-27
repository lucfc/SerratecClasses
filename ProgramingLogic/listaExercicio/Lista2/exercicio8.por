programa
{
	
	funcao inicio()
	{

		inteiro numero, digito, soma = 0

		escreva("Digite um numero: ")
		leia(numero)

		enquanto (numero > 0){
			digito = numero % 10
			soma = soma + digito 
			numero = numero / 10
		}
	escreva(soma)
	}
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 143; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */