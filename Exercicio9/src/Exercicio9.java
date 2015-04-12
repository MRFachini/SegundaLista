import java.util.Scanner;

public class Exercicio9{

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String nome;
		int nota, nota1, nota2;
		int falta;
		Double result, result1;
		System.out.println("Informe o nome do aluno: ");
		nome = teclado.nextLine();
		System.out.println("Informe a primeira nota do aluno: ");
		nota = Integer.parseInt(teclado.nextLine());
		System.out.println("Informe a segunda nota do aluno: ");
		nota1 = Integer.parseInt(teclado.nextLine());
		System.out.println("Informe a terceira nota do aluno: ");
		nota2 = Integer.parseInt(teclado.nextLine());
		System.out.println("Informe a quantidade de falta do aluno: ");
		falta = Integer.parseInt(teclado.nextLine());
		result = (falta * 1.25);
		result1 = (double) ((nota + nota1 + nota2) /3);
		
		if (result <= 25.0 && result1 >= 7.0){
			System.out.println("O aluno "+nome+" esta aprovado com uma media de "+result1+" e uma porcentagem de falta de "+result+" %");
		}else{
			System.out.println("O aluno esta REPROVADO");
		}
	}
}
