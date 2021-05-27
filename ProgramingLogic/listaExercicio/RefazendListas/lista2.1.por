programa
{
	
	funcao inicio()
	{
		inteiro a1, a2, a3

		escreva("angulo1 ")
		leia(a1)

		escreva("angulo2 ")
		leia(a2)

		escreva("angulo2 ")
		leia(a3)

		se ( (a1 + a2 + a3) != 180 ou a1 == 0 ou a2 == 0 ou a3 == 0){
			escreva("O triangulo nao é valido")
		}senao{
			escreva ("É um triangulo")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 225; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */