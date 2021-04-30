package conta;

public class Conta {
	
	private int numero;
	private String nome;
	private String sobrenome;
	private double saldo;
	public static int contado;
	
	
	public Conta() {
		// System.out.println("Conta criada");
		contado++;
	}
	
	
	public Conta(int numero, String nome, String sobrenome, double saldo) {
		super();
		this.numero = numero;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.saldo = saldo;
		contado++;
	}



	//funcao ver saldo
	public double verSaldo() {
		return this.saldo;
	}
		
	// Funcao sacar
	public boolean sacar(double valor) {
		
		if(this.saldo > valor) {
			this.saldo = this.saldo - valor;
			return true;
		}else {
			System.out.println("Saldo insuficiente");
			return false;
		}
	}
	
	//funcao deposito
	public void depositar (double valor) {
		this.saldo = this.saldo + valor ;
	}
		
	//funcao transfere
	public void transfere (Conta destino, double valor) {

		if(this.saldo > valor) {
			sacar(valor);
			destino.depositar(valor);
		}else {
			System.out.println("Saldo insuficiente");
		}
	}

	
	// Get and Set numero/nome/sobrenome
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobreNome () {
		return sobrenome;
	}

	public void setSobreNome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	
	
	// mostra infromações da conta
	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", nome=" + nome + ", sobrenome=" + sobrenome + ", saldo=" + saldo + "]";
	}
	
	

}
