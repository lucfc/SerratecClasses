package usuario;

import bancoEnum.CargoEnum;

public class Gerente extends Usuario{
	private int agencia; //indentificador
	// construtores
	public Gerente () {
		setCargo(CargoEnum.GERENTE.name());
	}
	
	public Gerente (String senha, String cpf, int agencia){
		setCpf(cpf);
		setSenha(senha);
		this.agencia = agencia;
		setCargo(CargoEnum.GERENTE.name());
	}
	
	//getter agencia, agencia s� � settada quando � criado, n�o planejamos uma forma de mudan�a de agencia do gerente
	public int getAgencia() {
		return agencia;
	}
	
}
