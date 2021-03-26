package IsacProjeto;
import java.util.Scanner;
public class Teste1 {
	public static void main(String[] args)
	{
		float x;
		Scanner idade = new Scanner(System.in);
		
		System.out.println("Insira a sua idade para ser realocade para uma categoria: ");
		x = idade.nextFloat();
		
		if (x >= 10 && x <= 14)
		{
			System.out.println("Você está na categoria infantil.");
		}
		else if (x >= 15 && x <= 17)
		{
			System.out.println("Você está na categoria juvenil.");
		}
		else if (x >= 18 && x <= 25)
		{
			System.out.println("Você está na categoria adulte.");
		}
		else
		{
			System.out.println("Você nao tem idade para nenhuma categoria disponível.");
		}

	}
/*10-14 infantil
 15-17 juvenil
 18-25 adulto*/
}

	


