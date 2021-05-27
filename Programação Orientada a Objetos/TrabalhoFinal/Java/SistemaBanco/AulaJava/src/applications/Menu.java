package applications;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import contas.Conta;
import exceptions.ContaExceptions;

public class Menu {
	static Scanner sc = new Scanner(System.in);

	// fun��o para cria��o do menu inicial
	public static void bemVindo() {
		linha(); // chama fun��o "linha()" 
		System.out.println("\n|   Bem vindo ao Banco Justice League   |");
		linha(); 
		System.out.println();
	}

	// fun��o para cria��o do menu cliente
	public static void menuCLiente(Conta conta) throws ContaExceptions, IOException {
		// variavel para parar o "do"
		int i = 1;
		// do para repetir o menu caso de algum erro ou a pessoa volte de um menu mais avan�ado, s� sai do menu caso a pessoa aperte o numero de saida
		do {
			System.out.println("\nBem vinda(o), " + conta.getNome()
					+ "!\nO que voc� gostaria de fazer?\n1 - Movimenta��es\n2 - Relat�rios\n3 - Sair");
			// variavel para entrar nos casos
			String opcao = sc.next();
			Menu.linha();
			// switch case para fazer oque est� escrito no System.out.println
			switch (opcao) {
			case "1":
				menuMovimentacao(conta);
				break;
			case "2":
				menuRelatoriosCliente(conta);
				break;
			case "3":
				Escritor.escritorMovimentacoes();
				i = 2;
				break;
			default: 
				System.out.println("\nFoi digitado um valor inv�lido, \npor favor repita a opera��o!");	
				linha();
			}
		} while (i != 2);
	}

	// fun��o para cria��o do menu de relat�rios do cliente
	public static void menuRelatoriosCliente(Conta conta) throws IOException {
		// variavel para parar o "do"
		int i = 1;
		// do para repetir o menu caso de algum erro ou a pessoa volte de um menu mais avan�ado, s� sai do menu caso a pessoa aperte o numero de saida
		do {
			System.out.println(
					"\nVoc� gostaria de fazer qual tipo de \nrelat�rio\n1 - Saldo\n2 - Relat�rio de tributa��o\n3 - Simula��o rendimento poupan�a\n4 - Seguro de vida\n5 - Sair");
			// variavel para entrar nos casos
			String opcao = sc.next();
			Menu.linha();
			System.out.println();
			// switch case para fazer oque est� escrito no System.out.println
			switch (opcao) {
			// relat�rio de saldo, mostra o saldo atual da conta do login, e chama o escritor, jogando os dados nescess�rios
			case "1":
				System.out.println("O Relat�rio de saldo foi gerado!\nO saldo atual �: R$" + conta.getSaldo()+ ".");
				Menu.linha();
				Escritor.escritorRelatorioSaldo(conta.getNome(),conta.getCpf(), conta.getSaldo());
				break;
			// relat�rio de tributa��o, mostra o custo das movimenta��es da conta do login, e chama o escritor, jogando os dados nescess�rios
			case "2":
				System.out.println("Para cada saque foi cobrado o valor \nde R$0.10 (dez centavos).");
				System.out.println("Para cada dep�sito foi cobrado o valor \nde R$0.10 (dez centavos).");
				System.out.println("Para cada transfer�ncia foi cobrado o valor \nde R$0.20 (vinte centavos).");
				System.out.println("O Relat�rio de tributa��o foi gerado!\nO gasto total �: R$"
						+ conta.getQtdMovimentacao() * 0.10);
				// if para caso o usuario tenha seguro de vida
				if (MapUsuario.getMap().get(conta.getCpf()).getSeguroDeVida()>=0) {
					System.out.println("O valor aplicado em seguro de vida � \nde R$"+ MapUsuario.getMap().get(conta.getCpf()).getSeguroDeVida()+"\n");
				}
				Escritor.escritorRelatorioTributacao(conta.getCpf());
				Menu.linha();
				break;
			// relat�rio de simula��o de rendimento da poupan�a, pede dados e retorna a simula��o, e chama o escritor, jogando os dados nescess�rio
			case "3":
				System.out.println("Voc� selecionou fazer uma simula��o \nrendimento poupan�a.");
				System.out.printf("Por favor, digite o valor que quer \ncolocar na poupan�a:\nR$");
				double valor = sc.nextDouble();
				System.out.println("Por favor, digite o valor de dias \nque o dinheiro ficar� na poupan�a: ");
				int dias = sc.nextInt();
				// faz o calculo, pegamos o rendimento por m�s e dividimos pela quantidade de dias
				// como � uma simula��o n�o tratamos o fato do valor s� poder ser resgatado a cada 30 dias
				 System.out.println("Depositando R$" + valor + " por " + dias + " dias, \nvoc� ter� um rendimento de R$"
						+ valor * dias * 0.003 / 30 + "!");
				System.out.println("O Relat�rio de simula��o rendimento \nde poupan�a foi gerado.");
				linha();
				Escritor.escritorRelatorioPoupanca(valor, dias);
				break;
			// desafio proposto
			// criador de seguro de vida, pede dados e da avisos, e chama o escritor, jogando os dados nescess�rio
			case "4":
				// informativo do custo, e verifica se a pessoa quer ou n�o fazer o seguro sabendo do custo.
				System.out
						.println("Ser� debitado 20% do valor segurado.\nvoc� gostaria de continuar?\n1 - Sim\n2 - N�o");
				String opcaoSeguro = sc.next();
				linha();
				// if para decis�o feita a cima
				if (opcaoSeguro.equals("1")) {
					System.out.println("\nQual valor voc� gostaria de aplicar \nno seguro de vida?");
					double aplicacao = sc.nextDouble();
					// se o custo da aplica��o for maior que o saldo n�o permite a opera��o
					if (aplicacao * 0.2 < conta.getSaldo()) {
						// faz o debito do saldo do custo da aplica��o
						conta.setSaldo(conta.getSaldo() - aplicacao * 0.20);
						System.out.println("Seguro de vida contratado com \nsucesso!");
						linha();
						// guarda o valor aplicado
						MapUsuario.getMap().get(conta.getCpf()).setSeguroDeVida(aplicacao);
					} else {
						System.out.println("\nSaldo insuficiente para esta \nopera��o." + "\nopera��o n�o realizada.");
						linha();
					}
				}else if (opcaoSeguro.equals("2")){
					break;
				}else {
					System.out.println("\nFoi digitado um valor inv�lido, \npor favor repita a opera��o!");	
					linha();
				}
				break;
			case "5":
				i = 2;
				break;
			default: 
				System.out.println("\nFoi digitado um valor inv�lido, \npor favor repita a opera��o!");	
				linha();
			}
		} while (i != 2);

	}

	// fun��o para cria��o do menu Gerente, o menu gerente � iqual ao menu cliente por�m jogando nas fun��es especificas
	// qualquer outra diferen�a ser� comentada
	public static void menuGerente(Conta conta) throws ContaExceptions, IOException {
		int i = 1;
		do {
			System.out.println("\nBem vinda(o) Gerente, " + conta.getNome()
					+ "!\nO que voc� gostaria de fazer?\n1 - Movimenta��es\n2 - Relat�rios\n3 - Sair");
			String opcao = sc.next();
			Menu.linha();
			switch (opcao) {
			case "1":
				menuMovimentacao(conta);
				break;
			case "2":
				menuRelatoriosGerente(conta);
				break;
			case "3":
				Escritor.escritorMovimentacoes();
				i = 2;
				break;
			default: 
				System.out.println("\nFoi digitado um valor inv�lido, \npor favor repita a opera��o!");	
				linha();
			}
		} while (i != 2);
	}

	// fun��o para cria��o do menu relat�rios do Gerente, o menu relat�rios do Gerente � iqual ao menu relat�rios do cliente
	// por�m jogando nas fun��es especificas
	// qualquer outra diferen�a ser� comentada
	public static void menuRelatoriosGerente(Conta conta) throws IOException {
		int i = 1;
		do {
			System.out.println(
					"\nVoc� gostaria de fazer qual tipo de \nrelat�rio\n1 - Saldo\n2 - Relat�rio de tributa��o\n3 - Simula��o rendimento poupan�a\n4 - N�mero de contas da ag�ncia\n5 - Sair");
			String opcao = sc.next();
			Menu.linha();
			System.out.println();
			switch (opcao) {
			case "1":
				System.out.println("O Relat�rio de saldo foi gerado!\nO saldo atual �: R$" + conta.getSaldo());
				Menu.linha();
				Escritor.escritorRelatorioSaldo(conta.getNome(),conta.getCpf(),conta.getSaldo());
				break;
			case "2":
				System.out.println("Para cada saque foi cobrado o \nvalor de R$0.10 (dez centavos).");
				System.out.println("Para cada dep�sito foi cobrado o \nvalor de R$0.10 (dez centavos).");
				System.out.println("Para cada transfer�ncia foi cobrado o \nvalor de R$0.20 (vinte centavos).");
				System.out.println("O Relat�rio de tributa��o foi gerado!\nO gasto total �: R$" + conta.getQtdMovimentacao()*0.10);
				Escritor.escritorRelatorioTributacao(conta.getCpf());
				Menu.linha();
				break;
			case "3":
				System.out.println("Voc� selecionou fazer uma simula��o \nrendimento poupan�a.");
				System.out.printf("Por favor, digite o valor que quer \ncolocar na poupan�a:\nR$");
				double valor = sc.nextDouble();
				System.out.println("Por favor, digite o valor de dias \nque o dinheiro ficar� na poupan�a: ");
				int dias = sc.nextInt();
				System.out.println("Depositando R$" + valor + "\npor " + dias + " dias, \nvoc� ter� um rendimento de R$" + valor*dias*0.003/30 +"!");
				System.out.println("O Relat�rio de simula��o rendimento \npoupan�a foi gerado.");
				linha();
				Escritor.escritorRelatorioPoupanca(valor, dias);
				break;
			// caso que n�o existe no cliente
			// para pegar a quantidade de contas na agencia
			case "4":
				// variavel para contar o numero de contas
				int count = 0;
				// variar entre todas as contas do sistema
				for(Conta value : MapConta.getMap().values()) {
				  if (value.getAgencia()==conta.getAgencia()) {
				    count++;
				  }
				}
				System.out.println("A quantidade de contas na ag�ncia \n" + conta.getAgencia() + " �: " + count);
				linha();
				Escritor.escritorRelatorioQtdAgencia(count, conta.getAgencia());
				break;
			case "5":
				i=2;
				break;
			default: 
				System.out.println("\nFoi digitado um valor inv�lido, \npor favor repita a opera��o!");	
				linha();
			}
		}while (i!=2);
	}
		
	// fun��o para cria��o do menu Diretor, o menu diretor � iqual ao menu gerente por�m jogando nas fun��es especificas
	// qualquer outra diferen�a ser� comentada
	public static void menuDiretor(Conta conta) throws ContaExceptions, IOException {
		int i = 1;
		do {
			System.out.println("\nBem vinda(o) Diretora(o), " + conta.getNome()
					+ "!\nO que voc� gostaria de fazer?\n1 - Movimenta��es\n2 - Relat�rios\n3 - Sair");
			String opcao = sc.next();
			Menu.linha();
			switch (opcao) {
			case "1":
				menuMovimentacao(conta);
				break;
			case "2":
				menuRelatoriosDiretor(conta);
				break;
			case "3":
				Escritor.escritorMovimentacoes();
				i = 2;
				break;
			default: 
				System.out.println("\nFoi digitado um valor inv�lido, \npor favor repita a opera��o!");	
				linha();
			}
		} while (i != 2);
	}

	// fun��o para cria��o do menu relat�rios do Diretor, o menu relat�rios do Diretor � iqual ao menu relat�rios do gerente
	// por�m jogando nas fun��es especificas
	// qualquer outra diferen�a ser� comentada
	public static void menuRelatoriosDiretor(Conta conta) throws IOException {
		int i = 1;
		do {
			System.out.println(
					"\nVoc� gostaria de fazer qual tipo de \nrelat�rio\n1 - Saldo\n2 - Relat�rio de tributa��o\n3 - Simula��o rendimento poupan�a\n4 - N�mero de contas da ag�ncia\n5 - Nome, CPF e Ag�ncia de todas as \ncontas\n6 - Sair");
			String opcao = sc.next();
			Menu.linha();
			System.out.println();
			switch (opcao) {
			case "1":
				System.out.println("O Relat�rio de saldo foi gerado!\nO saldo atual �: R$" + conta.getSaldo());
				Menu.linha();
				Escritor.escritorRelatorioSaldo(conta.getNome(),conta.getCpf(),conta.getSaldo());
				break;
			case "2":
				System.out.println("Para cada saque foi cobrado o \nvalor de R$0.10 (dez centavos).");
				System.out.println("Para cada dep�sito foi cobrado o \nvalor de R$0.10 (dez centavos).");
				System.out.println("Para cada transfer�ncia foi cobrado o \nvalor de R$0.20 (vinte centavos).");
				System.out.println("O Relat�rio de tributa��o foi gerado!\nO gasto total �: R$"
						+ conta.getQtdMovimentacao() * 0.10);
				Escritor.escritorRelatorioTributacao(conta.getCpf());
				Menu.linha();
				break;
			case "3":
				System.out.println("Voc� selecionou fazer uma simula��o \nrendimento poupan�a.");
				System.out.printf("Por favor, digite o valor que quer \ncolocar na poupan�a:\nR$");
				double valor = sc.nextDouble();
				System.out.println("Por favor, digite o valor de dias \nque o dinheiro ficar� na poupan�a: ");
				int dias = sc.nextInt();
				System.out.println("Depositando R$" + valor + " por " + dias + " dias, \nvoc� ter� um rendimento de R$"
						+ valor * dias * 0.003 / 30 + "!");
				System.out.println("O Relat�rio de simula��o rendimento \npoupan�a foi gerado.");
				linha();
				Escritor.escritorRelatorioPoupanca(valor, dias);
				break;
			case "4":
				int count = 0;
				for (Conta value : MapConta.getMap().values()) {
					if (value.getAgencia() == conta.getAgencia()) {
						count++;
					}
				}
				System.out.println("\nA quantidade de contas na ag�ncia \n" + conta.getAgencia() + " �: " + count);
				linha();
				Escritor.escritorRelatorioQtdAgencia(count, conta.getAgencia());
				break;
			// caso que n�o existe no gerente
			// para pegar todos os nomes, cpf e agencias, de todas as contas do banco
			case "5":
				System.out.println("Nome       Cpf        Ag�ncia");
				// for para variar em todas as contas e imprimir os valores do mapa j� ordenado
				for (Conta value : MapConta.getMapS().values()) {
					System.out.println("\n"+value.getNome()+" "+value.getCpf()+" "+value.getAgencia());
				}
				linha();
				System.out.println();
				Escritor.escritorRelatorioTodasContas();
				break;
			case "6":
				i = 2;
				break;
			default: 
				System.out.println("\nFoi digitado um valor inv�lido, \npor favor repita a opera��o!");
				linha();
			}
		} while (i != 2);
	}
	
	// fun��o para cria��o do menu presidente, o menu presidente � iqual ao menu diretor por�m jogando nas fun��es especificas
	// qualquer outra diferen�a ser� comentada
	public static void menuPresidente(Conta conta) throws ContaExceptions, IOException {
		int i = 1;
		do {
			System.out.println("\nBem vinda(o) Presidente, " + conta.getNome()
					+ "!\nO que voc� gostaria de fazer?\n1 - Movimenta��es\n2 - Relat�rios\n3 - Sair");
			String opcao = sc.next();
			Menu.linha();
			switch (opcao) {
			case "1":
				menuMovimentacao(conta);
				break;
			case "2":
				menuRelatoriosPresidente(conta);
				break;
			case "3":
				Escritor.escritorMovimentacoes();
				i = 2;
				break;
			default: 
				System.out.println("\nFoi digitado um valor inv�lido, \npor favor repita a opera��o!");	
				linha();
			}
		} while (i != 2);
	}

	// fun��o para cria��o do menu relat�rios do Presidente, o menu relat�rios do Presidente � iqual ao menu relat�rios do Diretor
	// por�m jogando nas fun��es especificas
	// qualquer outra diferen�a ser� comentada
	public static void menuRelatoriosPresidente(Conta conta) throws IOException {
		int i = 1;
		do {
			System.out.println(
					"\nVoc� gostaria de fazer qual tipo de \nrelat�rio\n1 - Saldo\n2 - Relat�rio de tributa��o\n3 - simula��o rendimento poupan�a\n4 - N�mero de contas da ag�ncia\n5 - Nome, CPF e Agencia de todas as \ncontas\n6 - Valor total dentro do banco\n7 - Sair");
			String opcao = sc.next();
			Menu.linha();
			System.out.println();
			switch (opcao) {
			case "1":
				System.out.println("O Relat�rio de saldo foi gerado!\nO saldo atual �: R$" + conta.getSaldo());
				Menu.linha();
				Escritor.escritorRelatorioSaldo(conta.getNome(),conta.getCpf(),conta.getSaldo());
				break;
			case "2":
				System.out.println("Para cada saque foi cobrado o \nvalor de R$0.10 (dez centavos).");
				System.out.println("Para cada dep�sito foi cobrado o \nvalor de R$0.10 (dez centavos).");
				System.out.println("Para cada transfer�ncia foi cobrado o \nvalor de R$0.20 (vinte centavos).");
				System.out.println("O Relat�rio de tributa��o foi gerado!\nO gasto total �: R$"
						+ conta.getQtdMovimentacao() * 0.10);
				Escritor.escritorRelatorioTributacao(conta.getCpf());
				Menu.linha();
				break;
			case "3":
				System.out.println("Voc� selecionou fazer uma simula��o \nrendimento poupan�a.");
				System.out.printf("Por favor, digite o valor que quer \ncolocar na poupan�a:\nR$");
				double valor = sc.nextDouble();
				System.out.println("Por favor, digite o valor de dias que \no dinheiro ficar� na poupan�a: ");
				int dias = sc.nextInt();
				System.out.println("Depositando R$" + valor + " por " + dias + " dias, \nvoc� ter� um rendimento de R$"
						+ valor * dias * 0.003 / 30 + "!");
				System.out.println("O Relat�rio de simula��o rendimento \npoupan�a foi gerado.");
				linha();
				Escritor.escritorRelatorioPoupanca(valor, dias);
				break;
			case "4":
				int count = 0;
				for (Conta value : MapConta.getMap().values()) {
					if (value.getAgencia() == conta.getAgencia()) {
						count++;
					}
				}
				System.out.println("\nA quantidade de contas na ag�ncia " + conta.getAgencia() + " �: " + count);
				linha();
				Escritor.escritorRelatorioQtdAgencia(count, conta.getAgencia());
				break;
			case "5":
				System.out.println("Nome       Cpf        Ag�ncia");
				for (Conta value : MapConta.getMapS().values()) {
					System.out.println("\n"+value.getNome()+" "+value.getCpf()+" "+value.getAgencia());
				}
				
				linha();
				System.out.println();
				Escritor.escritorRelatorioTodasContas();
				break;
			// caso que n�o existe no Diretor
			// para pegar a soma dos saldos de todas as contas do banco
			case "6":
				// armazenador da soma
				double sum = 0;
				//for para variar em todas as contas e somar seus saldos
				for (Conta value : MapConta.getMap().values()) {
						sum=sum+value.getSaldo();
				}
				System.out.printf("\nO valor total, em todas as contas do banco, � \nde: R$"+ sum + "\n");
				linha();
				Escritor.escritorRelatorioSaldoTotalBanco(sum);
				System.out.println();
				break;
			case "7":
				i = 2;
				break;
			default: 
				System.out.println("\nFoi digitado um valor inv�lido, \npor favor repita a opera��o!");	
				linha();
			}
		} while (i != 2);
	}

	//fun��o para cria��o do menu movimenta��es, padr�o para todos os tipos de usu�rios
	public static void menuMovimentacao(Conta conta) throws ContaExceptions, IOException {
		String i = "1";
		// do para repetir o menu caso de algum erro ou a pessoa volte de um menu mais avan�ado, s� sai do menu caso a pessoa aperte o numero de saida
		do {
			System.out.println(
					"\nVoc� gostaria de fazer qual tipo de \nmovimenta��o?\n1 - Depositar\n2 - Sacar\n3 - Transferir\n4 - Sair");
			String opcao = sc.next();
			Menu.linha();
			switch (opcao) {
			// caso do desposito, pede um valor para o usuario e joga na fun��o que deposita na conta logada
			case "1":
				// tratamento de erro caso valor do deposito seja menor ou iqual a 0
				try {
					System.out.println("\nDigite o valor que gostaria de \ndepositar: ");
					Double valor = sc.nextDouble();
					Menu.linha();
					System.out.println();
					conta.depositar(valor);

				} catch (ContaExceptions e) {
					System.out.println(e);
					linha();
				} catch (Exception e) {
					System.out.println("\nValor digitado inv�lido. \nPor favor tente novamente. "+e);
					linha();
				}
				break;
			// caso do saque, pede um valor para o usuario e joga na fun��o que saca na conta logada
			case "2":
				try {
					System.out.println("\nDigite o valor que gostaria de sacar: ");
					double valor = sc.nextDouble();
					Menu.linha();
					System.out.println();
					conta.sacar(valor);

				} catch (ContaExceptions e) {
					System.out.println(e);
				}
				break;
			// caso da transfer�ncia, pede um valor para o usuario e uma conta destino. Joga na fun��o que transfere na conta logada para conta destino.
			case "3":
				try {
					System.out.println("\nDigite o valor que gostaria de \ntransferir: ");
					double valor = sc.nextDouble();
					System.out.println("Digite o cpf da conta que gostaria \nde transferir para: ");
					String cpf = sc.next();
					Menu.linha();
					System.out.println();
					conta.transfere(valor, cpf);

				} catch (ContaExceptions e) {
					System.out.println(e);
					linha();
				} catch (Exception e) {
					System.out.println("Valor digitado inv�lido. \nPor favor tente novamente.");
					linha();
				}
				break;
			case "4":
				i = "2";
				break;
			default:
				System.out.println("\nFoi digitado um valor inv�lido, \npor favor repita a opera��o!");
				linha();
			}
		} while (i != "2");
	}
	
	//fun��o para cria��o da logo
	public static String logo() {
		
		return ("\n      %%%%%%%%%%%%%.%%%%%%%%%%%%%      \r\n"
				+ "      %%                       %%       \r\n"
				+ "      %%    %%%%%%% %%%        %%       \r\n"
				+ "      %%        %%% %%%        %%       \r\n"
				+ "      %%        %%% %%%        %%       \r\n"
				+ "      %%        %%   %%        %%       \r\n"
				+ "      %%   /%.  %%% %%%        %%       \r\n"
				+ "      %%  %%%.  %%% %%%        %%       \r\n"
				+ "      %%  %%%%%%%%% %%%/%%%%   %%       \r\n"
				+ "      %%   #%%%%%%  %%%%%%     %%       \r\n"
				+ "      %%                       %%       \r\n"
				+ "      %%%%%%%%%%%%%.%%%%%%%%%%%%%       \r\n");
	}
	
public static String logoR() {
		
		return ("      @@@@@@@@@@@@@.@@@@@@@@@@@@@      \r\n"
				+ "      @@                       @@       \r\n"
				+ "      @@    @@@@@@@ @@@        @@       \r\n"
				+ "      @@        @@@ @@@        @@       \r\n"
				+ "      @@        @@@ @@@        @@       \r\n"
				+ "      @@        @@   @@        @@       \r\n"
				+ "      @@   /@.  @@@ @@@        @@       \r\n"
				+ "      @@  @@@.  @@@ @@@        @@       \r\n"
				+ "      @@  @@@@@@@@@ @@@/@@@@   @@       \r\n"
				+ "      @@   #@@@@@@  @@@@@@     @@       \r\n"
				+ "      @@                       @@       \r\n"
				+ "      @@@@@@@@@@@@@.@@@@@@@@@@@@@       \r\n");
	}
	
	//fun��o para cria��o de linhas"\n"
	public static void linha() {
		for (int i=0;i <= 40;i++) {
			System.out.print("=");
		}
	}

	public static String erroMenu() {
		return "\nErro encontrado: ";
	}
	
}