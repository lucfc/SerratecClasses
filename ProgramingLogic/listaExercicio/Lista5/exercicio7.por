programa
{
	
	funcao inicio()
	{	
		inteiro mat1[3][2]={{3,1},{2,-1},{0,4}}
		inteiro mat2[2][3]={{1,-1,2},{3,0,5}}
		inteiro mat[3][3]

		
		para(inteiro i = 0; i < 3; i++){
			para(inteiro j= 0; j < 3; j++){
				para(inteiro k = 0; k < 2; k++){
					
				mat[i][j]= mat[i][j] + mat1[i][k]*mat2[k][j]
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
 * @POSICAO-CURSOR = 141; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {mat1, 6, 10, 4}-{mat2, 7, 10, 4}-{mat, 8, 10, 3}-{i, 11, 15, 1}-{j, 12, 16, 1}-{k, 13, 17, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */