programa

{
	
	funcao inicio()
	{	
		const inteiro tamanhoX = 4, tamanhoY=4
		inteiro vetorMatriz[tamanhoX][tamanhoY], i = 0, j, soma = 0


		para(i; i<tamanhoX;i++){
			para(j = 0; j<tamanhoY;j++){
				escreva("Digite os valores da matriz (i)",i, " e (j)", j, " : ")
			leia(vetorMatriz[i][j])
			}
		}

		i = 0
		j = 0
		enquanto(i<tamanhoX e j<tamanhoY e i == j){
			soma = soma + vetorMatriz[i][j]

			i++
			j++

		}
		escreva("A soma da diagonal da matriz é: ",soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 265; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {vetorMatriz, 8, 10, 11}-{i, 8, 43, 1}-{j, 8, 50, 1}-{soma, 8, 53, 4};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */