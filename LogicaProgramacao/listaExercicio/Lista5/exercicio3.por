programa
{
	
	funcao inicio()
	{
		inteiro vetorNumero[5], repetido, i = 0

		vetorNumero[0] = 1
		vetorNumero[1] = 2
		vetorNumero[2] = 1
		vetorNumero[3] = 1
		vetorNumero[4] = 1



		para (i; i < 5; i++){
			repetido = vetorNumero[i]
			para(inteiro j= i; j < 5; j++){
				se(j != i){
					se(repetido == vetorNumero[j]){
					escreva("\nO numero ",repetido, " está sendo repetido na posição ",i+1,
					" do vetor com a posição ", j+1," do vetor ")
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
 * @POSICAO-CURSOR = 143; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {vetorNumero, 6, 10, 11}-{repetido, 6, 26, 8}-{i, 6, 36, 1}-{j, 18, 16, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */