programa
{
	
	funcao inicio()
	{
		real B, A, area
		escreva("Insira o valor da base e da altura do triângulo, respectivamente, para calcular sua área: ")
		leia(B) leia (A)

		se(B > 0 e A > 0){
			area = (B*A) / 2
			escreva("\nA área do triângulo é de: ", area)			
		}
		senao{
			escreva("\nO valores estão inválidos. Insira valores positivos e maiores do que 0.")
		}
	}
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 371; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */