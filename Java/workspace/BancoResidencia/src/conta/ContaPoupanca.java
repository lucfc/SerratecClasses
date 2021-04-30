package conta;

public class ContaPoupanca extends Conta{
	private int vencimento;
	private double rendimento;
	
	
	public ContaPoupanca() {
		contado++;
	}
	
	
	public ContaPoupanca(int numero, String nome, String sobrenome, double saldo, int vencimento, double rendimento) {
		super(numero, nome, sobrenome, saldo);
		this.vencimento = vencimento;
		this.rendimento = rendimento;

	}


	public int getVencimento() {
		return vencimento;
	}
	public void setVencimento(int vencimento) {
		this.vencimento = vencimento;
	}
	public double getRendimento() {
		return rendimento;
	}
	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}

	@Override
	public String toString() {
		return "ContaPoupanca [vencimento=" + vencimento + ", rendimento=" + rendimento + ", verSaldo()=" + verSaldo()
				+ ", getNumero()=" + getNumero() + ", getNome()=" + getNome() + ", getSobreNome()=" + getSobreNome()
				+ "]";
	}

	
}
