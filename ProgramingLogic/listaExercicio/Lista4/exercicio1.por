programa
{
	
	funcao inicio()
	{
		real n1, n2

		escreva("Digite um número: ")
		leia(n1)

		escreva("Digite outro número: ")
		leia(n2)

		escreva("A média entre os números ", n1, " e ", n2, " é: ", media(n1,n2))
		
	}

	funcao real media(real n1, real n2){
		
		retorne (n1 + n2)/2
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 290; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */