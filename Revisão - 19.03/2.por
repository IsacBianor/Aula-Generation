programa
{
	
	funcao inicio()
	{
		inteiro dias, anos, meses, resultado1, resultado2
		escreva("Escreva sua idade em número de dias: ")
		leia(dias)
		anos = (dias / 365)
		meses = (dias % 365) / 30
		resultado1 = (dias % 365) %30
		escreva( "Sua idade é de: ", anos, " ano/s, " , meses, " mes/es  ", resultado1, " e dia/s.")
	}
}



/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 326; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */