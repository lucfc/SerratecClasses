programa
{
	
	funcao inicio()
	{	
		const inteiro tamanho = 5
		inteiro vetorNumero[tamanho], i = 0
		real soma = 0.0
		escreva("Digite 10 valores para colocar no vetor\n")
		
		enquanto(i < tamanho){
			escreva("Digite o valor ", i, " : ")
			leia(vetorNumero[i])
			soma = soma + vetorNumero[i]
			i++
		}

		escreva("O valor médio do vetor é : ", soma/ tamanho)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 376; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */