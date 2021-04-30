package pessoal;

public class Funcionario {

	private String nome;
	private String cpf;
	protected double salario;
	public static int contador;
	
	
	public Funcionario() {
		contador++;	
	}
	
	public Funcionario(String nome, String cpf, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		contador++;
	}
	
	
	public double getBonificacao() {
		double bonificacao =  this.salario * 0.10;
		return bonificacao;
	}
	
	
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", cpf=" + cpf + ", salario=" + salario + "]";
	}
	
	
	
}
