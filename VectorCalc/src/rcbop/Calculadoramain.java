package rcbop;

public class Calculadoramain {
	public static void main(String[] args) {

		int vetor[] = new int[3];
		int ponto[] = new int[3];
		String paramet[] = new String[3];
		String simet[] = new String[3];
		String redu[] = new String[3];

		System.out.println("Entre com as cordenadas do vetor");

		System.out.print("Digite a: ");
		vetor[0] = FBVLEIA.Leia(vetor[0]);
		System.out.print("Digite b: ");
		vetor[1] = FBVLEIA.Leia(vetor[1]);
		System.out.print("Digite c: ");
		vetor[2] = FBVLEIA.Leia(vetor[2]);

		System.out.println("Entre com as cordenadas do ponto");

		System.out.print("Digite X: ");
		ponto[0] = FBVLEIA.Leia(ponto[0]);
		System.out.print("Digite Y: ");
		ponto[1] = FBVLEIA.Leia(ponto[1]);
		System.out.print("Digite Z: ");
		ponto[2] = FBVLEIA.Leia(ponto[2]);

		System.out.println("\nEqua��es Param�tricas:");
		paramet[0] = Eq_Parametricas.fParametrica(0, ponto[0], vetor[0], "t");
		System.out.println(paramet[0]);
		paramet[1] = Eq_Parametricas.fParametrica(1, ponto[1], vetor[1], "t");
		System.out.println(paramet[1]);
		paramet[2] = Eq_Parametricas.fParametrica(2, ponto[2], vetor[2], "t");
		System.out.println(paramet[2]);

		System.out.println("Equa��o Reduzida:");

		redu[0] = Eq_Reduzida.fReduzida(0, ponto[0], ponto[1], ponto[2], vetor[0], vetor[1], vetor[2]);
		System.out.println(redu[0]);
		redu[1] = Eq_Reduzida.fReduzida(1, ponto[0], ponto[1], ponto[2], vetor[0], vetor[1], vetor[2]);
		System.out.println(redu[1]);

		System.out.println("Equa��es Sim�tricas:");
		simet[0] = Eq_Simetricas.fSimetrica(0, ponto[0], vetor[0]);
		simet[1] = Eq_Simetricas.fSimetrica(1, ponto[1], vetor[1]);
		simet[2] = Eq_Simetricas.fSimetrica(2, ponto[2], vetor[2]);

		System.out.println(simet[0] + " = " + simet[1] + " = " + simet[2]);

	}
}
