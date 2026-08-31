import java.util.Locale;
import java.util.Scanner;

public class CalculadoraDeMedias {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		String[] alunos = { "Camila", "Lucas", "Bruna", "Pedro" };

		double media = calculadoraMediaDaTurma(alunos, scanner);
		System.out.printf("Média da turma %.1f", media);

		scanner.close();
	}

	public static double calculadoraMediaDaTurma(String[] alunos, Scanner scanner) {

		double soma = 0;
		for (String aluno : alunos) {
			System.out.printf("Nota do aluno: %s ", aluno);
			double nata;
			try {
// Criando uma String para poder usar o REPLACE na linha debaixo.
				String nota = scanner.next();
//	Transformando uma String em double.
				nata = Double.valueOf(nota.replace(",", "."));
				soma += nata;
			} catch (NumberFormatException e) {
				e.printStackTrace();
				System.out.println("Foi inserido um valor texto ao invés de numérico. ");
			}
		}
		return soma / alunos.length;
	}
}