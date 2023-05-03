/*Defina uma classe ContaPoupanca com as características a seguir. Use um atributo
de classe para armazenar a taxa de rendimento anual de todas as contas. Cada
objeto da classe deve ter um atributo privado indicando a quantidade atual
depositada. Forneça um método para calcular o rendimento mensal multiplicando
o rendimento anual dividido por 12 pelo saldo e, em seguida, o rendimento deve
ser incorporado no saldo. Forneça também um método estático para modificar a
taxa de rendimento anual.

Escreva um programa para testar sua classe: construa dois objetos da classe com
saldos definidos por você. Defina uma taxa de rendimento anual de 4%. Calcule o
rendimento mensal para cada um dos 12 meses e mostre os novos saldos para cada
uma das poupanças. Em seguida, defina uma taxa de rendimento anual de 5%, e
calcule o rendimento do próximo mês mostrando o novo saldo das duas poupanças.
 */

public class Main {
	public static void main(String[] args) {

		ContaPoupanca conta1 = new ContaPoupanca("Thiago Alves", 0);
		ContaPoupanca conta2 = new ContaPoupanca("Fulano da Silva", 1000);

		ContaPoupanca.mudaTaxaRendimentoAnual(0.04);

		for (int i = 0; i < 12; i++){
			conta1.rendimentoMensal();
			conta2.rendimentoMensal();
		}

		System.out.printf("Novo saldo da conta 1: %.2f%n", conta1.getQuantidadeAtualDepositada());
		System.out.printf("Novo saldo da conta 2: %.2f%n", conta2.getQuantidadeAtualDepositada());

		ContaPoupanca.mudaTaxaRendimentoAnual(0.05);
		conta1.rendimentoMensal();
		conta2.rendimentoMensal();

		System.out.printf("Novo saldo da conta 1: %.2f%n", conta1.getQuantidadeAtualDepositada());
		System.out.printf("Novo saldo da conta 2: %.2f", conta2.getQuantidadeAtualDepositada());

	}
}