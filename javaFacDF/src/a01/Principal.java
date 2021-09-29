package a01;

public class Principal {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Chuveiro","lorenzetti", -50, 5.66);
		
//		p1.setNome("Chuveiro"); 
//		p1.setFabricante("lorenzetti");
//		p1.setPreco(5.66);
//		p1.setQuantidade(50);
	
		System.out.println("O produto: " + p1.getNome() + ", da marca: " + p1.getFabricante() + ", possui: " + p1.getQuantidade() +
				" unidades");
	}
}
