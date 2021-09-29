package aula02;

public class Funcionario extends Pessoa {
	
	private double salario;
	private double gratificacao;
	private double desconto;
	
	
	public Funcionario(String nome, String telefone, int cpf, double salario, double gratificacao, double desconto) {
		super(nome, telefone, cpf);
		this.salario = salario;
		this.gratificacao = gratificacao;
		this.desconto = desconto;
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getGratificacao() {
		return gratificacao;
	}
	public void setGratificacao(double gratificacao) {
		this.gratificacao = gratificacao;
	}
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

}
