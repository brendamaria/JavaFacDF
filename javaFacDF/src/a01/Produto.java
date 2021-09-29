package a01;

public class Produto {

	private String nome;
	private String fabricante;
	private int quantidade;
	private double preco;
	
	public Produto(String nome, String fabricante, int quantidade, double preco) {
		super();
		this.setNome(nome);
		this.setFabricante(fabricante);
		this.setQuantidade(quantidade);
		this.setPreco(preco);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getFabricante() {
		return fabricante;
	}
	
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		if(quantidade<0) {
			System.out.println("O estoque não pode ser negativo!!");
		}else {
			this.quantidade = quantidade;			
		}
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}

}
