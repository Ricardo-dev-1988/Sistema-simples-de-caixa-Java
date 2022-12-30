import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double total = 0.0;
		double dinheiroRestante = 0.0;
		double troco;
		char resp;

		do {
			System.out.print("Preço unitário do produto: R$");
			double preco = sc.nextDouble();
			System.out.print("Quantidade comprada: ");
			int quantidade = sc.nextInt();

			total += (double) preco * quantidade;
			System.out.printf("Total = R$%.2f%n", total);
			System.out.print("\nDeseja comprar mais (S/N)? ");
			resp = sc.next().charAt(0);
		} while (resp == 'S' || resp == 's');

		System.out.print("Dinheiro recebido: R$");
		double valorRecebido = sc.nextDouble();

		do {

			if (valorRecebido < total) {
				dinheiroRestante = total - valorRecebido;
				System.out.printf("\nFalta = R$%.2f%n", dinheiroRestante);

				System.out.print("Dinheiro recebido: R$");
				valorRecebido += sc.nextDouble();
			}

		} while (valorRecebido < total);

		troco = valorRecebido - total;
		System.out.printf("\nTroco = R$%.2f", troco);

		System.out.println("\nAGRADECEMOS PELA PREFERÊNCIA!");

		sc.close();
	}
}
