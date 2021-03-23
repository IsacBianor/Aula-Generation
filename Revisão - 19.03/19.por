programa
{
	
	funcao inicio()
	{
		real num, somanum=0, medianum, totalnum, contnum=0
		escreva("Introduza um valor numérico: ")
		leia(num)

		enquanto(num>=0){
			contnum++
			somanum = somanum + num
			escreva("\nIntroduza um valor numérico negativo para o programa parar.\nIntroduza um valor numérico positivo: ")
			leia(num)
		}
		medianum = somanum / contnum

		escreva("\nResultado da soma: ",somanum, "\n","Resultado da média: ", medianum, "\n","Total de valores lidos: ", contnum)
		
	}
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 385; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */