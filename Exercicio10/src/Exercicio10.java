import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int num;		
		boolean result = false;
		System.out.println("Informe o numero desejado: ");
		num = Integer.parseInt(teclado.nextLine());		
		for (int i = 20; num >= i && num <= 90;i++){
			result  = true;			
		}
		if (result  == true){
			System.out.println("O numero esta compreendido entra 20 e 90 - " + num);			
		}else {
			System.out.println("O numero e menor que 20 - " +num);
		}
	}

}
