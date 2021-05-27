programa
{
	
	funcao inicio()
	{
		cadeia simbolo
		inteiro n1, n2
		real divisao

		escreva("Digite um número: ")
		leia(n1)

		escreva("Digite outro número: ")
		leia(n2)

		escreva("Qual operaçao matemátiva você quer fazer? (soma(+), subtracao(-), multiplicacao(*), divisao(/) ")
		leia(simbolo)

		divisao = n1 / n2

		se(simbolo == "+" ou simbolo == "soma"){
			escreva(n1," ", simbolo = "+" ," ", n2, " = ", n1 + n2)
		} senao{
			se (simbolo == "-" ou simbolo == "subtracao"){
			escreva(n1," ", simbolo = "-" ," ", n2, " = ", n1 - n2)
			} senao{
				se (simbolo == "*" ou simbolo == "multiplicacao"){
				escreva(n1," ", simbolo = "*" ," ", n2, " = ", n1 * n2)
				} senao {
					se (simbolo == "/" ou simbolo == "divisao"){
					escreva(n1," ", simbolo = "/" ," ", n2, " = ", divisao)
					} senao{
						escreva("Não é uma operação valida")
					}
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
 * @POSICAO-CURSOR = 776; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */