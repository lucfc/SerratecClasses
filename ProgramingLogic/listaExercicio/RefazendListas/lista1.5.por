programa
{
	
	funcao inicio()
	{
		inteiro n1, n2

		escreva("n1: ")
		leia(n1)

		escreva("n2: ")
		leia(n2)

		se(n2 > n1){
			escreva(n2, ">", n1)
		}senao{
			se(n1 > n2){
				escreva(n1, ">", n2)
			}senao{
				escreva("São iguais")
			}
		}
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 247; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */