import java.util.Scanner;

public class Exercicio12{

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int salario;
		Double result = 0.00;
		System.out.println("Informe o valor do salario: ");
		salario = Integer.parseInt(teclado.nextLine());
		if (salario <= 600){
			result = salario * 1.30;			
			System.out.println("O valor aconselhado do aumento de salario e de: R$ "+result+ " com uma margem de aumento de 30%");
		}else if (salario >= 600 && salario <= 1100){
			result = salario * 1.25;		
			System.out.println("O valor aconselhado do aumento de salario e de: R$ "+result+ " com uma margem de aumento de 25%");
		}else if (salario >= 1100 && salario <= 2400){
			result = salario * 1.20;
			System.out.println("O valor aconselhado do aumento de salario e de: R$ "+result+ " com uma margem de aumento de 20%");
		}else if (salario >= 2400 && salario <= 3550){
			result = salario * 1.25;
			System.out.println("O valor aconselhado do aumento de salario e de: R$ "+result+ " com uma margem de aumento de 15%");
		}else if (salario >= 3551){
			result = salario * 1.10;
				System.out.println("O valor aconselhado do aumento de salario e de: R$ "+result+ " com uma margem de aumento de 10%");
		}else {
			System.out.println("O salario informado não tem aumento disponivel no momento.");
		}
		
	}

}
