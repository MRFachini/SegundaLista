import java.util.Scanner;


public class Exercicio2 {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int num;
		boolean running = true;
		while(running){
		System.out.println("Informe o numero desejado: ");
		num = Integer.parseInt(teclado.nextLine());
		if (num % 2 == 0) {
			System.out.println("N�mero � par: "); 
		}else {
			System.out.println("N�mero � impar: "+ num);
			}
		System.out.println("\nDeseja continuar:(digite 1 para sim, ou 2 para n�o continuar) ");
		int num1 = Integer.parseInt(teclado.nextLine());
		if (num1 == 2){
			running = false;
		}
		
		}
		
	}

}
