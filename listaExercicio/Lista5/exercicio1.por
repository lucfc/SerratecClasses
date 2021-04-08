programa
{
	
	funcao inicio()
	{	
		const inteiro tamanho = 10
		inteiro vetorNumero[tamanho], i = 0
		escreva("Digite 10 valores para colocar no vetor\n")
		
		enquanto(i < tamanho){
			escreva("Digite o valor ", i, " : ")
			leia(vetorNumero[i])
			i++
			limpa()
		}
		
		escreva("A ordem normal do vetor é\n")
		para (i = 0; i<tamanho; i++){
			escreva(vetorNumero[i], " ")
		}

		
		escreva("\nA ordem inversa do vetor é\n")
		para (i = tamanho-1; i>=0; i--){
			escreva(vetorNumero[i], " ")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 404; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */