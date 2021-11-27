package ExeciciosJava;

import java.util.Scanner;

public class ExcerciciosTranformandoMetroEmCentimentros {

	public static void main(String[] args) {
		
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("DIGITE A QUANTIDADE DE METROS PARA CONVERÇÃO");
		int metros = Scan.nextInt();
		
		int centimetros = metros * 100;
		
		System.out.println("VALOR CONVERTIDO PARA CENTIMETROS = " + centimetros );

	}

}
