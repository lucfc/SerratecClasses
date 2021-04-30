package principal;

import conta.Conta;
import conta.ContaCorrente;
import conta.ContaCorrenteEspecial;
import conta.ContaPoupanca;
import pessoal.Funcionario;
import pessoal.Gerente;
import pessoal.Diretor;
import pessoal.Assistente;
import pessoal.OperadorCaixa;


public class Principal {

	public static void main(String[] args) {
			
		Conta conta1 = new Conta(1, "Lucas" , "Carvalho",200);
	
		Conta conta2 = new Conta(2, "Marcelo","Collares", 200);
		
		Conta conta3 = new Conta(3,  "Rafael", "Carvalho", 200);
	
		ContaCorrente conta4 = new ContaCorrente(4,"Math","Pqsv",1000, 20000, 23);
		
		ContaPoupanca conta5 = new ContaPoupanca(5,"wadsath","dscvsv",1000, 20000, 23);
		
		ContaPoupanca conta6 = new ContaPoupanca(5,"dvh", "mrgv",1000, 20000, 23);
		
		ContaCorrente conta7 = new ContaCorrente(7,"llfh","assv",2100, 2020, 21);
		
		ContaCorrenteEspecial conta8 = new ContaCorrenteEspecial(8,"llfh","assv",2100, 2020, 21, 22344422);
		
		
		
						
		Funcionario gerente = new Gerente("Gerente 1", "1234", 1000, 123322); // nome/cpf/salario/numfunc
			
		Diretor diretor = new Diretor("Dire 1", "1234", 12344, 12344);
		
		Assistente assistente = new Assistente("adnes","2243444", 1220,"Assistente diretor");
		
		OperadorCaixa operador = new OperadorCaixa("Reginaldo", "1222233", 2000, "Terminal 1");
		

		System.out.println(diretor.toString());
		System.out.println("Número de Funcionários totais: " + Funcionario.contador);
		System.out.println("Número de contas totais: " + Conta.contado);

		
		System.out.println("Bonificacao do diretor: " + diretor.getParticipacaoLucro());
		System.out.println("Bonificacao do Gerente: " + gerente.getBonificacao());
		System.out.println("Bonificacao do Gerente + salario : " + (gerente.getBonificacao() + gerente.getSalario()));

	}

}
