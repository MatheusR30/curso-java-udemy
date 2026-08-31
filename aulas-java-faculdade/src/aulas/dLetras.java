package aulas;

public class dLetras {

	public static void main(String[] args) {
			
		try {
			diminuiLetras ltpqn = new diminuiLetras();
			ltpqn.lowCase();
		} catch (NullPointerException e) {
			System.out.println("Exceção NullPointerException identificada");
			System.out.println("Método diminuiLetras() tratado \n" + e);
		}
	}
}