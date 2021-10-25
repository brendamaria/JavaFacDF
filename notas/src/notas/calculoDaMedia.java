package notas;

import javax.swing.JOptionPane;

public class calculoDaMedia {

	
	public static void main(String[] args) {
		
		int notaA = Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira nota: "));
		int notaB = Integer.parseInt(JOptionPane.showInputDialog("Digite a segunda nota: "));
		int notaC = Integer.parseInt(JOptionPane.showInputDialog("Digite a terceira nota: "));
		int notaD = Integer.parseInt(JOptionPane.showInputDialog("Digite a quarta nota: "));

		int media = (notaA + notaB + notaC + notaD)/4;
		
		JOptionPane.showMessageDialog(null, "A sua media é: " + media, "RESULTADO!",JOptionPane.WARNING_MESSAGE);
	}
}
