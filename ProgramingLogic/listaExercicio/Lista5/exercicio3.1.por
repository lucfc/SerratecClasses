programa
{
	
	funcao inicio()
	{	
		const inteiro tamanho = 5
		inteiro vetorNumero[tamanho], repetido, i = 0

		para(i = 0; i < tamanho; i++){
			escreva("Digite um numero para o vetor: ")
			leia(vetorNumero[i])
		}

	
		para (i = 0; i < 5; i++){
			para(inteiro j= i; j < 5; j++){
				se(j != i){
					se(vetorNumero[i] == vetorNumero[j]){
					escreva("\nO numero ",vetorNumero[i], " está sendo repetido na posição ",i+1,
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
 * @POSICAO-CURSOR = 220; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {vetorNumero, 7, 10, 11}-{repetido, 7, 32, 8}-{i, 7, 42, 1}-{j, 16, 16, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */