package LacosDeRepeticao0504;

public class UmFor {
	public static void main(String[] args) {
		/*Informar todos os números de 1000 a 1999 que quando divididos por 11
obtemos resto = 5.*/
		int n;
		
		for(n=1000; n<=1999; n++)
		{
			if(n%11 ==5)
			{
				System.out.println(n);
			}
		
		}
	}

}
