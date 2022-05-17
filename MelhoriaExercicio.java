package fundamentos;

import javax.swing.JOptionPane;

public class MelhoriaExercicio {

	public static void main(String[] args) {
	
		
		String valor1 = JOptionPane.showInputDialog("Primeiro salário: ").replace(",", ".");
		String valor2 = JOptionPane.showInputDialog("Segundo salário: ").replace(",", ".");
		String valor3 = JOptionPane.showInputDialog("Terceiro salário: ").replace(",", ".");
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		double numero3 = Double.parseDouble(valor3);
		
		double media = (numero1 + numero2 + numero3) / 3;
		
		JOptionPane.showMessageDialog(null,"A média do salário é: " + media);
		
		System.out.println("A média do salário é: " + media);
				}

}
