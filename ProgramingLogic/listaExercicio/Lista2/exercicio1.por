programa
{
	
	funcao inicio()
	{
		inteiro lado1, lado2, lado3, triangulo

		escreva("Coloque um valor para o primeiro ângulo do triângulo: ")
		leia(lado1)

		escreva("Coloque um valor para o segundo ângulo do triângulo: ")
		leia(lado2)

		escreva("Coloque um valor para o terceiro ângulo do triângulo: ")
		leia(lado3)

		triangulo = lado1 + lado2 + lado3

		se(triangulo < 180 ou triangulo >180){
			escreva("O triângulo não é válido")
		} senao {
			escreva("O triângulo é válido")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 490; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */