package ExeciciosJava;

import java.util.Scanner;

public class ExercicioDeMedia {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("Digite a NOTA1");
		int NOTA1 = Scan.nextInt();
		System.out.println("Digite a NOTA2");
		int NOTA2 = Scan.nextInt();
		System.out.println("Digite a NOTA3");
		int NOTA3 = Scan.nextInt();
		System.out.println("Digite a NOTA4");
		int NOTA4 = Scan.nextInt();
		
		System.out.println("NOTA 1 INSERIDA :" + NOTA1);
		System.out.println("NOTA 2 INSERIDA :" + NOTA2);
		System.out.println("NOTA 3 INSERIDA :" + NOTA3);
		System.out.println("NOTA 4 INSERIDA :" + NOTA4);
		
		int Media = ((NOTA1 + NOTA2 + NOTA3 + NOTA4)/4);
		
		System.out.println("SUA MEDIA FINAL É:" + Media);
		
	}

}
