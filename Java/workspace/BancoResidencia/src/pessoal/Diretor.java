package pessoal;

public class Diretor extends Funcionario {

	private double participacaoLucro;


	public Diretor() {
	contador++;
	}
	
	public Diretor(String nome, String cpf, double salario, double participacaoLucro) {
		super(nome, cpf, salario);
		this.participacaoLucro = participacaoLucro;
	}


	public double getParticipacaoLucro() {
		return participacaoLucro;
	}


	public void setParticipacaoLucro(double participacaoLucro) {
		this.participacaoLucro = participacaoLucro;
	}
	
	
	
}
	

