package pessoal;

public class OperadorCaixa extends Funcionario {

	private String terminalCaixa;

	public OperadorCaixa() {
		contador++;
	}

	public OperadorCaixa(String nome, String cpf, double salario, String terminalCaixa) {
		setNome(nome);
		setCpf(cpf);
		setSalario(salario);
		this.terminalCaixa = terminalCaixa;		
	}
	
	public String getTerminalCaixa() {
		return terminalCaixa;
	}
	
	public void setTerminalCaixa(String terminalCaixa) {
		this.terminalCaixa = terminalCaixa;
	}

	@Override
	public String toString() {
		return "OperadorCaixa [terminalCaixa=" + terminalCaixa + "]";
	}
	
	
	
}
