package fundamentos;

import javax.swing.JOptionPane;

public class MelhoriaExercicio {

	public static void main(String[] args) {
	
		
		String valor1 = JOptionPane.showInputDialog("Primeiro sal�rio: ").replace(",", ".");
		String valor2 = JOptionPane.showInputDialog("Segundo sal�rio: ").replace(",", ".");
		String valor3 = JOptionPane.showInputDialog("Terceiro sal�rio: ").replace(",", ".");
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		double numero3 = Double.parseDouble(valor3);
		
		double media = (numero1 + numero2 + numero3) / 3;
		
		JOptionPane.showMessageDialog(null,"A m�dia do sal�rio �: " + media);
		
		System.out.println("A m�dia do sal�rio �: " + media);
				}

}
