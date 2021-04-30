package pessoal;

public class Gerente extends Funcionario {

	private int numFuncionarios;
	private int senha;

	public Gerente() {
		contador++;
	}

	public Gerente(String nome, String cpf, double salario, int numFuncionarios) {
		setNome(nome);
		setCpf(cpf);
		setSalario(salario);
		this.numFuncionarios = numFuncionarios;
	}
	
	public double getBonificacao() {
		double bonificacao = this.salario * 0.15 + super.getBonificacao()*.10 ;
		return bonificacao ;
	}
	
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
		System.out.println("Acesso Permitido!");
		return true;
		} else {
		System.out.println("Acesso Negado!");
		return false;
		}
		}

	public int getNumFuncionarios() {
		return numFuncionarios;
	}

	public void setNumFuncionarios(int numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}

	
	@Override
	public String toString() {
		return "Gerente [numFuncionarios=" + numFuncionarios + ", getNome()=" + getNome() + ", getCpf()=" + getCpf()
				+ ", getSalario()=" + getSalario() + "]";
	}
	
	
	
}
