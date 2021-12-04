//Crie um programa em Java que, utilizando a classe Scanner, pergunte ao usuário seu sobrenome, depois seu nome, e então escreva na tela, em uma única “string”, o nome completo do usuário.

package exercises;
import java.util.Scanner;

public class Ex02_CompleteName {
	public static void main(String[] args) {
		String name, lastname;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Digite o seu sobrenome: ");
		lastname = keyboard.nextLine();
		System.out.println("Digite o seu nome: ");
		name = keyboard.nextLine();
		System.out.printf("Seu nome é "+ name + " " + lastname);
	}
}
