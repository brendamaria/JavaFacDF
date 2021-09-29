package aula02;

public class Cliente extends Pessoa {
	
	private double margem;
	private double saldo;
	private double desconto;

	public Cliente(String nome, String telefone, int cpf) {
		super(nome, telefone, cpf);
		this.setMargem(margem);
		this.setSaldo(saldo);
		this.setDesconto(desconto);
		
	}

	public double getMargem() {
		return margem;
	}
	public void setMargem(double margem) {
		this.margem = margem;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	

}
