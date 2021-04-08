programa
{
	
	funcao inicio()
	{
		inteiro ano

		escreva("Digite um ano para verificar se ele é bissexto: ")
		leia(ano)

		VerificaAno(ano)
		
	}

	funcao VerificaAno(inteiro ano){

		se(ano % 4 == 0){
			se(ano % 100 != 0){
				escreva("O ano é bissexto\n")
				
			}senao {
				se( ano % 400 == 0){
					escreva("O ano é bissexto\n")
				}senao{
				escreva("O ano não é bissexto\n")
				}	
			}			
		}senao{
			escreva("O ano não é bissexto\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 399; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */