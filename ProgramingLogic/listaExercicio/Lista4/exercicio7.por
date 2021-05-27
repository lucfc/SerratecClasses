programa
{
	
	funcao inicio()
	{
		inteiro vetor[5], maior, menor, i=0

		para(i; i < 5; i++){
			escreva("Digite 5 valores para colocar no vetor ")
			leia(vetor[i])
		}

		maior = vetor[0]
		menor = vetor[0]
		
		para(i = 0; i < 5; i++){
			escreva("\nElemento - ", i, " : ", vetor[i])
		}

		para(i = 0; i < 5; i++){
			se(maior < vetor[i]){
				maior = vetor[i]
			}

			se(menor > vetor[i]){
				menor = vetor[i]
			}		
		}

		escreva("\nElemento maior : ", maior)
		escreva("\nElemento menor : ", menor)
		
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 377; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */