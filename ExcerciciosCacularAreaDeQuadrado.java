package ExeciciosJava;

import java.util.Scanner;

public class ExcerciciosCacularAreaDeQuadrado {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("DIGITE O VALOR DA BASE DO QUADRADO:");
		int Base = Scan.nextInt();
		
		System.out.println("DIGITE O VALOR DA ALTURA DO QUADRADO:");
		int Altura = Scan.nextInt();
		
		int Resultado = Base * Altura * 2;
		
		System.out.println("SEGUE RESULTADO DO DOBRO DA AREA DO QUADRADO : " + Resultado);
		System.out.println("SEGUE RESULTADO DA AREA DO QUADRADO DIVIDIDO POR 4 : " + Resultado / 4);
		
		
	}

}
