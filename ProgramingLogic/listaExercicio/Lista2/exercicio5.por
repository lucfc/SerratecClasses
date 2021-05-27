programa
{
	
	funcao inicio()
	{
		inteiro idade
		cadeia sexo, condicaoEspecial

		escreva("Qual sua idade? ")
		leia(idade)

		escreva("Qual o seu sexo? (homem ou mulher) ")
		leia(sexo)

		escreva("Possui alguma condição especial? ")
		leia(condicaoEspecial)


		se (idade >= 60 e idade <= 120 ou condicaoEspecial != "nao" e condicaoEspecial != "não" e sexo == "homem" ou condicaoEspecial != "nao" e  condicaoEspecial != "não" e sexo == "mulher"){
			escreva("Fila preferencial")
		} senao {
			escreva(" Aguarde na fila")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 432; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */