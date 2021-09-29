package aula02;

public class Pessoa {
	
	protected String nome;
	protected String telefone;
	protected int cpf;

	public Pessoa(String nome, String telefone, int cpf) {
		super();
		this.setNome(nome);
		this.setTelefone(telefone);
		this.setCpf(cpf);
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}


}
