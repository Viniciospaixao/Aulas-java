package ExeciciosJava;

import java.util.Scanner;

public class ExcercicioSalarioMensal {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("DIGITE QUANTO VC GANHA POR HORA");
		double Valordia = Scan.nextDouble();
		
		System.out.println("DIGITE QUANTIDADE DE HORAS MENSAIS");
		double Horas = Scan.nextDouble();
		
		double Resultado = Valordia * Horas;
		
		System.out.println("SEGUE O VALOR A RECEBER MENSALMENTE :" + Resultado);
		
	}

}
