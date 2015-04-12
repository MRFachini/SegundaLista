import java.util.Scanner;

public class Exercicio5{

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int num;
		int num2;
		int aux;		
		boolean running = true;		
		while(running){
		System.out.println("Informe o numero desejado: ");
		num = Integer.parseInt(teclado.nextLine());
		System.out.println("Informe o segundo numero desejado: ");
		num2 = Integer.parseInt(teclado.nextLine());		
		if (num > num2){
			System.out.println("O numero " + num + " e maior que o numero " + num2 + " então a ordem e mantida.");			
		}else if (num < num2){
			aux = num;
			num = num2;			
			System.out.println("O numero " + aux + " e menor que o numero " + num2 + " então a ordem e alterada para: " + num + " " + aux + ".");
		}
		System.out.println("\n Deseja continuar:(digite 1 para sim, ou 2 para nâo continuar) ");
		int num1 = Integer.parseInt(teclado.nextLine());
		if (num1 == 2){
			running = false;
				}
		}

	}

}
