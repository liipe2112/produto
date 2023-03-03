package produto;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o nome do produto que você quer comprar: ");
		String nome = entrada.nextLine();
		
		System.out.println("Digite o preço do produto que você quer comprar: ");
		double preco = entrada.nextDouble();
		
		System.out.println("Digite a quantidade do produto que você quer comprar: ");
		int quantidade = entrada.nextInt();
		
		Produto produto = new Produto(nome, preco, quantidade);
		
		System.out.println("Você comprou o produto: " + nome);
		System.out.println("O valor do produto é: R$ " + preco);
		System.out.println("Você vai comprar: " + quantidade + " produto(s)");
		
	}
}
