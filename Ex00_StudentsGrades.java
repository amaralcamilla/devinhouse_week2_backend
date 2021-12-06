package exercises;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Ex00_StudentsGrades {
	
	private static Scanner keyboard;
	
	public static void main(String[] args) {
		keyboard = new Scanner(System.in);
		
		Map<String, List <Integer>> mapaDeNotas = new HashMap<String, List<Integer>>();
		
		System.out.println("Número de alunos: ");
		int qtdAlunos = keyboard.nextInt();
		
		System.out.println("Quantidade de notas: ");
		int qtdNotas = keyboard.nextInt();

		//Iteração para pegar o nome dos alunos.
		for (int i = 0; i < qtdAlunos; i++) {
			System.out.printf("Digite o nome do aluno %s:  ", i + 1);
			String nomeAluno = keyboard.next();
			
			//For dentro do for => Cada iteração gerará uma lista nova 
			//(uma lista de notas para cada aluno, para que não misture as notas). 
			List<Integer> notas = new ArrayList <Integer>();
			
			notas.clear(); //Se quiser criar a lista antes de fazer o for do nome dos alunos, precisa limpar os dados do aluno que foi iterado anteriormente, com o .clear().
			
			//Iteração para pegar a nota de cada aluno.
			for (int j = 0; j < qtdNotas; j++) {
				System.out.printf("Digite a nota %s do aluno %s:  ", j+1, nomeAluno);
				int nota = keyboard.nextInt();
				notas.add(nota);
				}
			
			mapaDeNotas.put(nomeAluno, notas);
		 }
		
		mapaDeNotas.forEach((nome, listaDeNotas) -> {
			System.out.println(String.format("A nota do aluno %s é", nome));
			
			listaDeNotas.forEach((nota)->{
				System.out.printf("\t %s %n", nota);
			});
			int somaNotasAluno = 0;
			
			for (int nota: listaDeNotas) {
				somaNotasAluno += nota;
			}
			int mediaAluno = somaNotasAluno / listaDeNotas.size();
			System.out.println(String.format("\tA média é: %s ", mediaAluno));
			
	});
		}
}
