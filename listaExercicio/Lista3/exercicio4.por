programa
{
	
	funcao inicio()
	{
		inteiro numero

		escreva("Digite um número: ")
		leia(numero)

		para (inteiro i = 1; i <= numero; i++){
			escreva("\n")
			para(inteiro j = numero ; j >= i; j--){
				escreva(" ")
			} 
			para(inteiro k = 1; k <= i; k++){
					escreva("*")
					para(inteiro l = k; l <=k; l++){
						escreva(" ")
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
 * @POSICAO-CURSOR = 339; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {i, 11, 16, 1}-{j, 13, 16, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */