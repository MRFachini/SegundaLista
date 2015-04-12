import java.util.Scanner;

public class Exercicio8{

	public static void main(String[] args) {		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int num;
		int num1;
		int num2;
		int result = 0, result1 = 0, result2 = 0;
		
		boolean running = true;
		
		while(running){
		System.out.println("Informe o numero desejado: ");
		num = Integer.parseInt(teclado.nextLine());
		System.out.println("Informe o segundo numero desejado: ");
		num1 = Integer.parseInt(teclado.nextLine());
		System.out.println("Informe o terceiro numero desejado: ");
		num2 = Integer.parseInt(teclado.nextLine());
		if (num >= 0 && num1 >= 0 && num2 >= 0){
			if (num > num1 && num > num2 && num1 > num2){
				result = num;
				result1 = num1;
				result2 = num2;
			}else if (num > num1 && num > num2 && num2 > num1){
				result = num;
				result1 = num2;
				result2 = num1;
			}else if (num1 > num && num1 > num2 && num > num2){
				result = num1;
				result1 = num;
				result2 = num2;
			}else if (num1 > num && num1 > num2 && num2 > num){
				result = num1;
				result1 = num2;
				result2 = num;
			}else if (num2 > num && num2 > num1 && num > num1){
				result = num2;
				result1 = num;
				result2 = num1;
			}else if (num2 > num && num2 > num1 && num1 > num){
				result = num2;
				result1 = num1;
				result2 = num;
			}else if (num == num1 && num == num2){
				System.out.println("Todos os numeros são iguais " + num + " " + num1 + " " + num2);
			}
		}else {
			System.out.println("Os numeros informados são negativos "+ num + " " + num1 + " " + num2);
		}
		System.out.println(
				"O numero "+result + " e o maior numero e o "
						+result1 +" e o numero do meio e o numero "
							+result2 +" e o menor numero");
		
		System.out.println("\nDeseja continuar:(digite 1 para sim, ou 2 para nâo continuar) ");
		int num4 = Integer.parseInt(teclado.nextLine());
		if (num4 == 2){
			running = false;
			}
		}

	}
}
