programa
{
	
	funcao inicio()
	{
		real pol
		escreva("Introduza o índice de poluição: ")
		leia(pol)

		se(pol >= 0.3 e pol< 0.4){
			escreva("\nIndústrias do 1º grupo estão intimadas a suspenderem atividades.")
		}
		se(pol>= 0.4 e pol <0.5){
			escreva("\nIndústrias dos 1º e 2º grupos estão intimadas a suspenderem atividades.")
		}
		se(pol >=0.5){
			escreva("\nIndústrias dos 1º, 2º e 3º grupos paralizaram suas atividades.")
		}
		senao{
			escreva("\nÍndices de poluição estão aceitáveis.")
		}
	}
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 353; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */