package ExeciciosJava;

import java.util.Scanner;

public class ExcerciciosCelsiusParaFarenheit {

	public static void main(String[] args) {
		//FORMULA -  C=(5*(f-32)/9).
		
		Scanner Entrada = new Scanner(System.in);
		
		System.out.println("DIGITE O VALOR EM CELSIUS:");
		
		float Celsius = Entrada.nextFloat();
				
		float farenheit = ((Celsius *9 /5 )+ 32);
		
		System.out.println("SEGUE O VALOR CONVERTIDO PARA farenheit :" + farenheit );

	}
}
