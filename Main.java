/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	/*public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Informe seu login: ");
        String loginUser = sc.nextLine();
        System.out.println("Informe sua senha: ");
        String passUser = sc.nextLine();

        String stanLogin = "usuario3002@gmail.com";
        String stanPass = "senha123";

        if (loginUser.equals(stanLogin) && passUser.equals(stanPass)) {
            System.out.println("Login bem sucedido. Bem-vindo!");
        } else {
            System.out.println("Login ou senha incorretos.");
        }

	}*/
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Informe o primeiro valor: ");
	    double n1 = sc.nextDouble();
	    System.out.println("Informe o segundo valor: ");
	    double n2 = sc.nextDouble();
	    
	    double soma = n1 + n2;
	    
	    System.out.println("A soma dos números: " + n1 + " + " + n2 + " é: " + soma);
	}
}
