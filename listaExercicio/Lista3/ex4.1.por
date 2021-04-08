programa
{
	
	funcao inicio()
	{
		inteiro num
	
		escreva("Formato Pirâmide\n")

		escreva("Digite um número: ")
		leia(num)


		inteiro i = 1, j = num, k = 1, l = k
		enquanto (i <= num){
			escreva("\n")
			
			enquanto(j >= i){
				escreva(" ")
				j--
			}
			j = num
			enquanto(k <= i){
				escreva("*")

				
				enquanto(l == k){
					escreva(" ")
					l++
				}
				k++
			}
			
			k=1
			l = k
			i++
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 361; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {i, 14, 10, 1}-{j, 14, 17, 1}-{k, 14, 26, 1}-{l, 14, 33, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */