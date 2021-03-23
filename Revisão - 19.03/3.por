programa
{
	
	funcao inicio()
	{
		inteiro total, segundos, horas, minutos
		escreva("Escreva o tempo total do evento em segundos: ")
		leia(segundos)
		horas = segundos / 3600
		minutos = (segundos % 3600) / 60
		total = (segundos % 3600) % 60

		escreva("\nO tempo de evento é de: ", horas, " hora/s, ", minutos, " minuto/s e ", total, " segundo/s.")
	}
}
 
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 264; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */