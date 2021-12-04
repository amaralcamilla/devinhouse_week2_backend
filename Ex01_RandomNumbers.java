//Crie um programa em Java que, ao executar, escreve na tela um número aleatório entre 0 e 1.

package exercises;
import java.util.Random;

public class Ex01_RandomNumbers {
	
	public static void main(String[] args) {
		Random generator = new Random();
		
		System.out.printf("%f%n", generator.nextFloat());
		System.out.printf("%.3f", generator.nextDouble());
	}
}
