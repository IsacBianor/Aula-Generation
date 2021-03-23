programa
{
	
	funcao inicio()
	{
		inteiro idade
		escreva("Insira sua idade para classificação da categoria de acordo com sua idade: ")
		leia(idade)

		se(idade >= 5 e idade <=7){
			escreva("\nVocê está na categoria Infantil A.")
		}
		se(idade >=8 e idade <=11){
			escreva("\nVocê está na categoria Infantil B.")
		}
		se(idade >=12 e idade <=13){
			escreva("\nVocê está na categoria Juvenil A.")
		}
		se(idade >=14 e idade <=17){
			escreva("\nVocê está na categoria Juvenil B.")
		}
		se(idade>=18){
			escreva("\nVocê está na categoria Adultos.")
		}
		senao{
			escreva("\nVocê não tem idade suficiente para estar numa categoria")
		}
	}
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 646; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */