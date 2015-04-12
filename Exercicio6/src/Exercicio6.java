import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String senha;
		boolean running = true;	
		while(running){
		System.out.println("Informe a senha: ");
		senha = teclado.nextLine();
		if (senha.equals("batatafrita")){
			System.out.println("“Acesso permitido”");
		}else{
			System.out.println("“Você não tem acesso ao sistema”");
		}
		System.out.println("\nDeseja continuar:(digite 1 para sim, ou 2 para nâo continuar) ");
		int num1 = Integer.parseInt(teclado.nextLine());
		if (num1 == 2){
			running = false;
				}
			
		}

	}

}
