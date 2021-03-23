programa
{
	
	funcao inicio()
	{
		inteiro num

		escreva("Entre com um número: ")
		leia(num)
		escreva(num)

		enquanto(num<=100)
		{
			num = num*3
			se(num>100)
			{
				escreva(" ")
			}
			senao
			{
			escreva(", ",num)
			}
			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 232; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */