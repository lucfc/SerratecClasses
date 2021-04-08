programa
{
	
	funcao inicio()
	{
		real n1, n2, novaOperacao
		cadeia operacao
		
		escreva ("Digite o primeiro numero: ")
		leia(n1)
		
		escreva ("Digite o primeiro numero: ")
		leia(n2)

		escreva ("Digite uma operaçao:(+,-,*,/) ")
		leia(operacao)

		enquanto (operacao != "+" e operacao != "-" e operacao != "*" e operacao != "/"){
			escreva("Digite uma operacao valida ")
			leia(operacao)	
		}

		
		se (operacao == "+"){
				real soma
				soma = somar(n1,n2)
				escreva(soma)
			}senao {
				se(operacao == "-"){
					real subtracao
					subtracao = subtrair(n1,n2)
					escreva(subtracao)
				}senao{
					se(operacao == "*"){
						real multiplicacao 
	
						multiplicacao = multiplicar(n1,n2)
						escreva(multiplicacao)
					}senao{
						se(operacao == "/"){
							real divisao 
	
							divisao = dividir(n1,n2)
							escreva(divisao)
						}senao{
							escreva("Não e uma operação válida\n")
							limpa()
						}
					}
				}
			}		

		escreva("\nDeseja fazer uma nova operação, 1-SIM, 2-NAO\n")
		leia(novaOperacao)

		se(novaOperacao == 1){
			inicio()
		}senao{
			escreva("O programa acabou")
		}
		
	}

	
	funcao real somar(real n1,real n2){
		
		
		real soma 
		soma = n1 + n2

		retorne soma
	}

	funcao real subtrair(real n1, real n2){
		real subtracao
		subtracao = n1 - n2

		retorne subtracao
	}

	funcao real multiplicar(real n1, real n2){
		 real multiplicacao

		 multiplicacao = n1 * n2
		 retorne multiplicacao
	}

	funcao real dividir(real n1, real n2){
		
		real divisao

		divisao = n1 / n2
		retorne divisao
	}

}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 376; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */