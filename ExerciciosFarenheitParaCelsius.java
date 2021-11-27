package ExeciciosJava;

import java.util.Scanner;

public class ExerciciosFarenheitParaCelsius {

	public static void main(String[] args) {
		//FORMULA -  C=(5*(f-32)/9).
		
		Scanner Entrada = new Scanner(System.in);
		
		System.out.println("DIGITE O VALOR EM FARENHEIT:");
		
		float farenheit = Entrada.nextFloat();
				
		float Celsius = (5*(farenheit - 32)/9);
		
		System.out.println("SEGUE O VALOR CONVERTIDO PARA CELSIUS :" + Celsius);

	}

}
