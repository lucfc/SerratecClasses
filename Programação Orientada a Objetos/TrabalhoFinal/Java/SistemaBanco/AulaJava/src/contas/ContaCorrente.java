package contas;

public class ContaCorrente extends Conta {
	
	private int tipo = 1; //indentificador
	
	// construtores
	public ContaCorrente() {
		
	}
	
	public ContaCorrente(String nome, String cpf, int agencia, double saldo) {
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
