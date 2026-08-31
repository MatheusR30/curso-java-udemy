package aulas;

import javax.swing.JOptionPane;

public class diminuiLetras {
	  
	public static void lowCase() throws NullPointerException
	{
		String word = null;
		String newWord = null;
		
		word = JOptionPane.showInputDialog(null, "Digite um nome: ");
				
		newWord = word.toLowerCase();
		
		System.out.println("A palavra informada é: "+ word);
		System.out.println("A palavra corrigida é: "+ newWord);
	}
}
