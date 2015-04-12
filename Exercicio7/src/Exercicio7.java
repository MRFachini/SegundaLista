import java.util.Scanner;
	public class Exercicio7 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int num;
		int num1;
		int num2;
		boolean running = true;
		while(running){
			System.out.println("Informe o numero : ");
				num = Integer.parseInt(teclado.nextLine());
			System.out.println("Informe o segundo numero : ");
				num1 = Integer.parseInt(teclado.nextLine());
			System.out.println("Informe o terceiro numero : ");
				num2 = Integer.parseInt(teclado.nextLine());
		if (num == num1 && num1 == num2 && num == num2){
			System.out.println("O formato do triangulo seria um Equilatero");		
		}else if (num != num1 && num1 != num2 && num != num2) {
			System.out.println("O triangulo seria um Escaleno");			
		}else if ((num1 == num2) && (num != num2) /*|| (num != num1) && (num1 == num2)*/) {
			System.out.println("O triangulo seria um Isosceles");			
		}else if ((num1 != num2) && (num == num2) /*|| (num1 != num) && (num1 == num2)*/){
			System.out.println("O triangulo seria um Isosceles");			
		}else if ((num2 != num1) && (num1 == num) /*|| (num2 != num) && (num1 == num)*/){
			System.out.println("O triangulo seria um Isosceles");
		}
		System.out.println("\nDeseja continuar:(digite 1 para sim, ou 2 para nâo continuar) ");
		int num4 = Integer.parseInt(teclado.nextLine());
		if (num4 == 2){
			running = false;
			}
		}
	}
}
