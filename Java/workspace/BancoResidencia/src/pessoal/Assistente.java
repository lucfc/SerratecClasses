package pessoal;

public class Assistente extends Funcionario{
	
	private String funcionarioAssistido;

	public Assistente() {
		contador++;
	}

	public Assistente(String nome, String cpf, double salario, String funcionario) {
		super(nome, cpf, salario);
		this.funcionarioAssistido = funcionario;
	}
	
	
	public String getFuncionarioAssistido() {
		return funcionarioAssistido;
	}
	
	public void setFuncionarioAssitido (String funcionario) {
		this.funcionarioAssistido = funcionario;
	}
	
}

