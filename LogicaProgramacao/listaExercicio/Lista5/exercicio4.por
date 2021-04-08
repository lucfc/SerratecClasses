programa
{
	
	funcao inicio()
	{
		const inteiro tamanho = 5
		inteiro vetor[tamanho], vetorTeste = 0, vetorNormal
		
		para(inteiro i = 0; i < tamanho; i++){
			escreva("Digite os numeros do vetor: ")
			leia(vetor[i])
		}
		
		inteiro i = 0
		escreva("\nO vetor normal é: ")
		para (i = 0; i < tamanho; i++){
			escreva(" ", vetor[i])
		}
		
		para(inteiro j = 0; j < tamanho; j++){
			para(i = 0; i < tamanho - 1; i++){
		
				se (vetor[i] > vetor[i+1]){
					vetorTeste = vetor[i]
	
					vetor[i] = vetor[i+1]
	
					vetor[i+1] = vetorTeste
					
				}
			}
		}

		
		escreva("\nO vetor em ordem é: ")
		para (i = 0; i < tamanho; i++){
			escreva(" ", vetor[i])
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 65; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */