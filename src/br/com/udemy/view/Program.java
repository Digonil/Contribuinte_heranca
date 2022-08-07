package br.com.udemy.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import br.com.udemy.entities.Contribuintes;
import br.com.udemy.entities.PessoaFisica;
import br.com.udemy.entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		List<Contribuintes> lista = new ArrayList();

		System.out.println("Entre com o número de contribuintes: ");
		Integer n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.println("Tipo de contribuinte: 1 - Pessoa Fisica ou 2 - Pessoa Juridica: ");
			Integer tipoContribuinte = sc.nextInt();

			System.out.println("Digite o nome do contribuinte: ");
			String name = sc.next();

			System.out.println("Digite a renda anual do contribuinte: ");
			Double rendaAnual = sc.nextDouble();

			if (tipoContribuinte == 1) {
				System.out.println("Digite os gastos com saúde: ");
				Double gastosSaude = sc.nextDouble();

				lista.add(new PessoaFisica(name, rendaAnual, gastosSaude));
			}

			if (tipoContribuinte == 2) {
				System.out.println("Digite o número de funcionários: ");
				Integer numeroFuncionarios = sc.nextInt();

				lista.add(new PessoaJuridica(name, rendaAnual, numeroFuncionarios));
			}

		}
		System.out.println("Taxes Paid: ");
		for (Contribuintes contribuinte : lista) {
			System.out.println("O contribuinte " + contribuinte.getName() + " pagou uma taxa de $ "
					+ contribuinte.calcularImposto() + ".");
		}
		Double sum = 0.0;
		for (Contribuintes contribuinte : lista) {
			sum += contribuinte.calcularImposto();

		}
		System.out.println("O valor total de imposto pago é de $ " + sum);

		sc.close();
	}

}
