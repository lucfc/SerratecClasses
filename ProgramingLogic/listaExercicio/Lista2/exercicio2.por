programa
{
	
	funcao inicio()
	{
		inteiro lado1, lado2, lado3

		escreva("Coloque o valor do lado 1: ")
		leia(lado1)

		escreva("Coloque o valor do lado 2: ")
		leia(lado2)

		escreva("Coloque o valor do lado 3: ")
		leia(lado3)

		se(lado1+lado2< lado3 ou lado2+lado3< lado1 ou lado1+lado3 < lado2 e lado1 == 0 e lado2 ==0 e lado3 ==0){
			escreva("Ele não pode ser um triângulo")
		}senao{
			se(lado1 == lado2 e lado1 == lado3){
				escreva("O triângulo é equilátero")
			}senao {
				se(lado1 == lado2 e lado1 != lado3 ou lado1 != lado2 e lado1 == lado3 ou lado1 != lado2 e lado2 == lado3){
						escreva("O triângulo é isósceles")
				}senao {
					escreva("O triângulo é escaleno")
				}	
			}
		}	
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 585; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */