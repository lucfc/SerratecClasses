package contas;

public class ContaPoupanca extends Conta {
	private int tipo = 2; //indentificador
	
	//construtores
	public ContaPoupanca (){
		
	}
	public ContaPoupanca(String nome,String cpf, int agencia, double saldo) {
		setNome(nome);
		setCpf(cpf);
		setAgencia(agencia);
		setSaldo(saldo);
	}
	//getter do "tipo", n�o tem setter pq n�o planejamos uma mudan�a de tipo de conta, ou � poupan�a ou � corrente
	public int getTipo() {
		return tipo;
	}

}
