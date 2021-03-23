programa
{
	
	funcao inicio()
	{
		inteiro P, E, M
		leia(P)

		se (P > 50){
			E = P - 50
			escreva("O limite excedeu em ", E, " quilos")
			M = E * 4
			escreva("\nO valor da multa é de R$ ", M)
		}
		senao{
			escreva("\n \n O valor não foi excedido")
		}
	}
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 273; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */