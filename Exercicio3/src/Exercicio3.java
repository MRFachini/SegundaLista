
import java.util.Scanner;

public class Exercicio3 {
	
public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int num;
		int num2;
		int rusult;		
		boolean running = true;		
		while(running){
		System.out.println("Informe o numero desejado: ");
		num = Integer.parseInt(teclado.nextLine());
		System.out.println("Informe o segundo numero desejado: ");
		num2 = Integer.parseInt(teclado.nextLine());
		if (num % num2 == 0) {			
			rusult = (num / num2);
		System.out.println("Os N�meros s�o Divis�veis: "+ num+ " / " +num2+ " = " + rusult); 
	}else {
		rusult = (num / num2);
		System.out.println("Os N�mero n�o s�o Divis�veis: "+ num+ " / " +num2+ " = " + rusult);
		}
	System.out.println("\nDeseja continuar:(digite 1 para sim, ou 2 para n�o continuar) ");
	int num1 = Integer.parseInt(teclado.nextLine());
	if (num1 == 2){
		running = false;
			}
	
		}

	}
}
