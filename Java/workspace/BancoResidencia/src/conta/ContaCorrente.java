package conta;

public class ContaCorrente extends Conta{

	private int investimento; 
	private int tarifa;
	
	public ContaCorrente() {
		contado++;
	}
	
	
	
	public ContaCorrente(int numero, String nome, String sobrenome, double saldo, int investimento, int tarifa) {
		super(numero, nome, sobrenome, saldo);
		this.investimento = investimento;
		this.tarifa = tarifa;
	
	}



	public int getInvestimento() {
		return investimento;
	}
	
	public void SetInvestimento(int investimento) {
		this.investimento = investimento;
	}
	public int getTarifa() {
		return tarifa;
	}
	public void setTarifa(int tarifa) {
		this.tarifa = tarifa;
	}

	@Override
	public String toString() {
		return "ContaCorrente [investimento=" + investimento + ", tarifa=" + tarifa + ", verSaldo()=" + verSaldo()
				+ ", getNumero()=" + getNumero() + ", getNome()=" + getNome() + ", getSobreNome()=" + getSobreNome()
				+"]";
	}
	
	
	
}
