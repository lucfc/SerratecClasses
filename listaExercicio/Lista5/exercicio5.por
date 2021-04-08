programa
{
	
	funcao inicio()
	{	
		const inteiro tamanho = 5
		inteiro vetor[tamanho], maior, menor, i=0

		para(i; i < tamanho; i++){
			escreva("Digite 5 valores para colocar no vetor ")
			leia(vetor[i])
		}


		mediaVetor(tamanho, i, vetor)
	}

	funcao mediaVetor(inteiro tamanho, inteiro i, inteiro vetor[]){
		real soma = 0.0
		inteiro maior, menor
			
		maior = vetor[0]
		menor = vetor[0]
		
		para(i = 0; i < tamanho; i++){
			se(maior > vetor[i]){
				maior = vetor[i]
			}

			se(menor < vetor[i]){
				menor = vetor[i]
			}
		}

		para(i = 0; i < tamanho; i++){
			soma = soma + vetor[i]
		}

		escreva("\nA média do vetor é : ", (soma - menor - maior)/(tamanho-2))	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 400; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */