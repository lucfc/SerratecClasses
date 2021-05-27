programa
{		
	// o numero de linhas da matriz 1 tem que ser igual ao número de colunas da matriz 2
	
		const inteiro mat1Linha = 3, mat1Coluna = 2, mat2Linha = 2, mat2Coluna = 3 
		inteiro mat1[mat1Linha][mat1Coluna]={{3,1},{2,5},{0,4}}
		inteiro mat2[mat2Linha][mat2Coluna]={{1,3,2},{-1,0,5}}
		inteiro mat[mat1Linha][mat2Coluna], i = 0, j = 3, k 

	funcao inicio()
	{	
	 
	/*
	 *
		escreva("Insira valores para a Matriz 1\n")
		matriz1()
		limpa()

		escreva("Insira valores para a Matriz 2\n")
		matriz2()
		limpa()

	 */
		escreva("\t\tAs matrizes 1 e 2 são:\n\n")
		escreva("\t matriz 1  \t\t      matriz 2 \n\n")
	 	para(i = 0; i < mat1Linha; i++){
	 		para(j = 0; j < mat1Coluna;j++){
	 			escreva("\t", mat1[i][j])
	 		}
	 		escreva("\t")
	 		se(i < mat2Linha){
	 		para(k = 0; k <mat2Coluna; k++){
 				escreva("\t", mat2[i][k])	 			
	 		}
	 		}
	 		escreva("\n")
	 	}

		escreva("\n")
		para( i = 0; i < 3; i++){
			para( j= 0; j < 3; j++){
				para(k = 0; k < 2; k++){
					
				mat[i][j]= mat[i][j] + mat1[i][k]*mat2[k][j]
				
				}
			}
		}

		escreva("    A multiplicação da matriz 1 com a matriz 2 é:\n\n")
		para(i=0; i < 3; i++){
			para(j =0; j < 3; j++){
				escreva("      \t ",mat[i][j])
			}
			escreva("\n")
		}
	}

	funcao matriz1(){
		para(i = 0; i < mat1Linha; i++){
			para(j = 0; j < mat1Coluna; j++){
				escreva("Insira o valor para a linha ",i + 1," coluna ",j + 1," : ")
				leia(mat1[i][j])
			}
		}
	}


	funcao matriz2(){
		para(i = 0; i < mat2Linha; i++){
			para(j = 0; j < mat2Coluna; j++){
				escreva("Insira o valor para a linha ",i + 1," coluna ",j + 1," : ")
				leia(mat2[i][j])
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1194; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */