programa
{
	funcao inicio()
	{
		real nota1, nota2, media
		inteiro alunos, i = 0
		
		escreva("Números de alunos: ")
		leia(alunos)
				
		enquanto (i < alunos){
			escreva("\nDigite a nta do aluno ", i + 1, " : ")
			leia(nota1)

			escreva("Digite outro número: ")
			leia(nota2)

			media = mediaAlunos(nota1,nota2)
			
			alunoPassou(media, i)
			
			i++
		}	
	}

	funcao alunoPassou(real media, inteiro idAluno){
		
		se (media >= 7){
				escreva("O aluno ", idAluno+1, " passou\n")
			}senao{
				escreva("O aluno ", idAluno+1, " não passou\n")
			}
	}

	funcao real mediaAlunos(real n1, real n2){

		retorne (n1 + n2)/2
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 355; 
 * @DOBRAMENTO-CODIGO = [29, 25, 34];
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */