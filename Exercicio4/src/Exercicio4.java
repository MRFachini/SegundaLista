import java.util.Scanner;

	public class Exercicio4 {

		public static void main(String[] args) {
		
			@SuppressWarnings("resource")
			Scanner teclado = new Scanner(System.in);

			int num;
			int num2;
			
			boolean running = true;
			
			while(running){
			
			System.out.println("Informe o numero desejado: ");
			num = Integer.parseInt(teclado.nextLine());
			System.out.println("Informe o segundo numero desejado: ");
			num2 = Integer.parseInt(teclado.nextLine());			
			if (num > num2){
				System.out.println("O numero " + num + " e maior que o numero " + num2);
				
			}else if (num2 > num){
				System.out.println("O numero " + num2 + " e maior que o numero " + num);				
			}else if (num == num2){
				System.out.println("O numero " + num + " e o numero " + num2 + " são iguais.");			
			}
			System.out.println("\nDeseja continuar:(digite 1 para sim, ou 2 para nâo continuar) ");
			int num1 = Integer.parseInt(teclado.nextLine());
			if (num1 == 2){
				running = false;
					}
			
			}

		}

	}
