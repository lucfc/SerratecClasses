package conta;

public class ContaPoupancaEspecial extends ContaPoupanca{
	
	private int cartaoDeDebito;

	public ContaPoupancaEspecial() {
		contado++;
	}

	
	public ContaPoupancaEspecial(int numero, String nome, String sobrenome, double saldo, int vencimento, double rendimento, int cartaoDeDebito) {
		super(numero, nome, sobrenome, saldo, vencimento, rendimento);
		this.cartaoDeDebito = cartaoDeDebito;
	}
	
	public int getCartaoDeDebito() {
		return cartaoDeDebito;
	}

	public void setCartaoDeDebito(int cartaoDeDebito) {
		this.cartaoDeDebito = cartaoDeDebito;
	}
	

}
