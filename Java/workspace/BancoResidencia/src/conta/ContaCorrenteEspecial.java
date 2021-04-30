package conta;

public class ContaCorrenteEspecial extends ContaCorrente{

	private int cartaoDeCredito;
	
	public ContaCorrenteEspecial() {
		contado++;
	}
	
	public ContaCorrenteEspecial(int numero, String nome, String sobrenome, double saldo, int investimento, int tarifa, int cartaoDeCredito) {
		super(numero, nome, sobrenome, saldo, investimento, tarifa);
		this.cartaoDeCredito = cartaoDeCredito;
	}

	public int getCartaoDeCredito() {
		return cartaoDeCredito;
	}

	public void setCartaoDeCredito(int cartaoDeCredito) {
		this.cartaoDeCredito = cartaoDeCredito;
	}
	
	
	
}
