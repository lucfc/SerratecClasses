package applications;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import contas.Conta;

public class Escritor {
	
	// facilitadores
	static final String PATH_BASICO = "./temp/";
	static final String EXTENSAO = ".txt";
	// formatador para o nome do arquivo
	static DateTimeFormatter Format = DateTimeFormatter.ofPattern("ddMMyyyyss");
	static String dateString = LocalDateTime.now().format(Format);
	// formatador para a data aparecer no texto bonitinho
	static DateTimeFormatter Format2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	static String dateString2 = LocalDateTime.now().format(Format2);

	//escritor de movimenta��es
	public static void escritorMovimentacoes() throws IOException {
		// cria��o do escritor, tivemos problema na hora de abrir o codigo em outros computadores em rela��o aos caracteres brasileiros
		// tentamos usar esse StandardCharsets.UTF_8, para solucionar
		BufferedWriter escritor = new BufferedWriter(new FileWriter(PATH_BASICO + dateString + EXTENSAO,StandardCharsets.UTF_8));
		escritor.append(Menu.logoR() + "\n");
		// for para imprimir todas as movimenta��es que foram feitas, que est�o armazenadas nos vetores na classe conta
		for (int i = 0; i < Conta.getQtdMovimentacao(); i++) {
			// Isso significa que a movimenta��o realizada foi um deposito, ou um saque, ou uma transfer�ncia
			// nota que ignora os vetores que tem como TipoDaMovimentacao "0" nos casos da transfer�ncia
			if (Conta.getVetorTipoDaMovimentacao(i).equals("Deposito")) {
				escritor.append("==========Registro de Dep�sito=========\n");
				escritor.append("Realizador do deposito: \n" + Conta.getVetorCPF(i) + "\n");
				escritor.append("Ag�ncia da conta: " + Conta.getVetorAgencia(i) + "\n");
				escritor.append("Valor depositado: \nR$ " + Conta.getVetorValor(i) + "\n");
				escritor.append("Custo da movimenta��o: \nR$ 0.10\n");
				escritor.append("Saldo ap�s o deposito: \nR$ " + Conta.getVetorSaldo(i) + "\n");
				escritor.append("Data da realiza��o do deposito: \n" + Conta.getVetorTempo(i) + "\n\n");
			} else if (Conta.getVetorTipoDaMovimentacao(i).equals("Saque")) {
				escritor.append("==========Registro de Saque==========\n");
				escritor.append("Realizador do Saque: \n" + Conta.getVetorCPF(i) + "\n");
				escritor.append("Ag�ncia da conta: " + Conta.getVetorAgencia(i) + "\n");
				escritor.append("Valor sacado: \nR$ " + Conta.getVetorValor(i) + "\n");
				escritor.append("Custo da movimenta��o: \nR $0.10\n");
				escritor.append("Saldo ap�s o saque: \nR$ " + Conta.getVetorSaldo(i) + "\n");
				escritor.append("Data da realiza��o do saque: \n" + Conta.getVetorTempo(i) + "\n\n");
			} else if (Conta.getVetorTipoDaMovimentacao(i).equals("Transferencia")) {
				escritor.append("=======Registro de Transf�rencia=======\n");
				escritor.append("Realizador da transfer�ncia: \n" + Conta.getVetorCPF(i) + "\n");
				escritor.append("Ag�ncia da conta: " + Conta.getVetorAgencia(i) + "\n");
				escritor.append("Valor transferido: \nR$ " + Conta.getVetorValor(i) + "\n");
				escritor.append("Custo da movimenta��o: \nR$ 0.20\n");
				escritor.append("Saldo ap�s a transf�rencia: \nR$ " + Conta.getVetorSaldo(i) + "\n");
				escritor.append("Conta que receber� a transfer�ncia: \n" + Conta.getVetorCPFT(i) + "\n");
				escritor.append("Data da realiza��o da transfer�ncia: \n" + Conta.getVetorTempo(i) + "\n\n");
			}
		}
		escritor.close();
	}
	// escritor de relat�rio de saldo
	public static void escritorRelatorioSaldo(String nome, String cpf, double saldo) throws IOException {
		BufferedWriter escritor = new BufferedWriter(new FileWriter(PATH_BASICO + dateString + "RSaldo" + EXTENSAO,StandardCharsets.UTF_8));
		escritor.append(Menu.logoR() + "\n");
		escritor.append("===========Registro de Saldo===========\n");
		escritor.append("O seu saldo, " + nome + " � de R$" + saldo +"\n");
		escritor.append("Data da realiza��o do registro: \n" + dateString2 + "\n\n");
		escritor.close();
	}
	// escritor de relat�rio de tributacao
	public static void escritorRelatorioTributacao(String cpf) throws IOException {
		BufferedWriter escritor = new BufferedWriter(new FileWriter(PATH_BASICO + dateString+ "RTributacao" + EXTENSAO,StandardCharsets.UTF_8));
		escritor.append(Menu.logoR() + "\n");
		escritor.append("=========Registro de Tributa��o=========\n");
		escritor.append("Para cada saque foi cobrado o valor de\nR$0.10 (dez centavos).\n");
		escritor.append("Para cada dep�sito foi cobrado \no valor de R$0.10 (dez centavos).\n");
		escritor.append("Para cada transfer�ncia foi cobrado \no valor de R$0.20 (vinte centavos).\n\n");
		// faz a conta da qtdMovimentacao vezes (0,10) o pre�o da movimenta��o, por conta disso que teria que ter duas qtdMovimentacao na transfer�ncia
		escritor.append("A quantidade de transa��es foi de "+ Conta.getQtdMovimentacao() +",\ntotalizando um valor total de R$"+ Conta.getQtdMovimentacao()*0.10+".\n\n");
		// if para caso o cliente tenha seguroDeVida imprima no relat�rio dele o valor segurado
		if (MapUsuario.getMap().get(cpf).getSeguroDeVida()>=0) {
			escritor.append("O valor aplicado em seguro \nde vida � de R$"+ MapUsuario.getMap().get(cpf).getSeguroDeVida()+"\n");
		}
		escritor.append("Data da realiza��o do registro: \n" + dateString2 + "\n\n");
		escritor.close();
	}
	// escritor de relat�rio de simula��o de rendimento na poupan�a
	public static void escritorRelatorioPoupanca(double valor, int dias) throws IOException {
		BufferedWriter escritor = new BufferedWriter(new FileWriter(PATH_BASICO + dateString + "RPoupanca" + EXTENSAO,StandardCharsets.UTF_8));
		escritor.append(Menu.logoR() + "\n");
		escritor.append("===Registro de relat�rio de Poupan�a===\n");
		escritor.append("Depositando R$" + valor + " por " + dias + " dias, \nvoc� ter� um rendimento de R$" + valor*dias*0.003/30 +" !\n");
		escritor.append("Data da realiza��o do registro: \n" + dateString2 + "\n\n");
		escritor.close();
	}
	// escritor de relat�rio de quantidade de clientes da agencia do gerente, diretor ou presidente que pediu.
	public static void escritorRelatorioQtdAgencia(int count, int agencia) throws IOException {
		BufferedWriter escritor = new BufferedWriter(new FileWriter(PATH_BASICO + dateString + "RQtdAgencia" + EXTENSAO,StandardCharsets.UTF_8));
		escritor.append(Menu.logoR() + "\n");
		escritor.append("====Registro de relat�rio de Agencia====\n");
		escritor.append("\nA quantidade de contas na ag�ncia " + agencia + " \n� igual a: " + count+".\n");
		escritor.append("Data da realiza��o do registro: \n" + dateString2 + "\n\n");
		escritor.close();
	}
	// escritor de relat�rio de todas as contas presentes no banco por ordem alfab�tica
	public static void escritorRelatorioTodasContas() throws IOException {
		BufferedWriter escritor = new BufferedWriter(new FileWriter(PATH_BASICO + dateString + "RTodasContas" + EXTENSAO,StandardCharsets.UTF_8));
		escritor.append(Menu.logoR() + "\n");
		escritor.append("====Registro de relat�rio de Contas====\n");
		escritor.append("Nome       Cpf        Ag�ncia");
		// for para pegar todas as contas presentes no sistema dentro do mapa e escrever no relat�rio
		for (Conta value : MapConta.getMapS().values()) {
			escritor.append("\n"+value.getNome()+" "+value.getCpf()+" "+value.getAgencia()+"\n");
		}
		escritor.append("Data da realiza��o do registro: " + dateString2 + "\n\n");
		escritor.close();
	}
	// escritor de relat�rio da soma dos saldos de todas as contas presentes no banco
	public static void escritorRelatorioSaldoTotalBanco(double sum) throws IOException {
		BufferedWriter escritor = new BufferedWriter(new FileWriter(PATH_BASICO + dateString + "RSaldoTotalBanco" + EXTENSAO,StandardCharsets.UTF_8));
		escritor.append(Menu.logoR() + "\n");
		escritor.append("=====Registro de relat�rio de Saldo======\n");
		escritor.append("\nO valor total, em todas as contas\ndo banco, � de: R$"+ sum+".\n");
		escritor.append("Data da realiza��o do registro: \n" + dateString2 + "\n\n");
		escritor.close();
	}
}
