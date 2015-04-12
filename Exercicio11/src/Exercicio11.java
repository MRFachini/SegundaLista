import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int num;
		Double result;
		

		System.out.println("Informe o valor do produto comprado: ");
		num = Integer.parseInt(teclado.nextLine());
		if (num <= 20){		
			result = (num * 1.45);			
			System.out.println("O valor aconselhado e de: R$ "+result+ " com uma margem de lucro de 45%");
		}else {			
			result = (num * 1.30);			
			System.out.println("O valor aconselhado e de: R$ "+result+ " com uma margem de lucro de 30%");
		}

	}

}