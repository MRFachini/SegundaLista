package br.com.reges.Exercicio1;

	import java.util.Scanner;
	/**
	 * Classe que le dois valores e retorna ao usuario se s�o iguais ou diferentes.
	 * 
	 * 
	 * @author Matheus Roberto Fachini
	 *
	 */

	public class Exercicio1{
		
		public static void main(String[] args) {
			
			@SuppressWarnings("resource")
			Scanner teclado = new Scanner(System.in);

			int num1 = 0;
			int num2 = 0;

			System.out.println("Informe o primeiro numero: ");
			num1 = Integer.parseInt(teclado.nextLine());
			System.out.println("Informe o segundo numero: ");
			num2 = Integer.parseInt(teclado.nextLine());
			if (num1 == num2){
				System.out.println("Os numeros "+num1 + " e " + num2 +" s�o iguais ");
			}else{
				System.out.println("Os numeros "+num1 + " e " + num2 +" s�o diferentes ");
			}
		}

	}

	

