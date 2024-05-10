import java.util.Scanner;

public class verificacaoDeUsuarioESenha {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		boolean usuario = false;
		boolean password = false;
		String nome;
		String senha;
		
		do {
			System.out.print("Digite seu nome: ");
			nome = scan.next();
			
			if(!nome.equalsIgnoreCase("Cris")) {
				System.out.println("Usuário inválido, digite novamente!");
				
			}else {
				usuario = true;
			}
		}while (!usuario);
		
		do {
			System.out.print("Digite sua senha: ");
			senha = scan.next();
			
			if(!senha.equalsIgnoreCase("1234")) {
				System.out.println("Senha inválida, digite novamente!");
			}else {
				password = true;
				System.out.println("Login realizado com sucesso!");
			}
		}while (!password);
	

	}

}
