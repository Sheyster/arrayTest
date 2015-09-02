package vetores;

import static vetores.VetoresConst.vetor1;
import static vetores.VetoresConst.vetor2;
import static vetores.VetoresConst.vetor3;

public class RemoverDuplicadosVetores {

	public static void main(String[] args) {

		Integer vetorTemp[] = new Integer[vetor1.length + vetor2.length + vetor3.length];

		// inicializa
		for (int i = 0; i < vetor1.length; i++) {
			vetorTemp[i] = vetor1[i];
			vetorTemp[i + 4] = vetor2[i];
			vetorTemp[i + 8] = vetor3[i];
		}

		for (Integer integer : vetorTemp) {
			if (integer != null) {
				System.out.print(integer + " ");
			}
		}

		System.out.println();
		ordena(vetorTemp);

		// Integer saida[] = removeDuplicados(vetorTemp);
		Integer saida[] = duplicados(vetorTemp);
		System.out.println("----");
		for (Integer integer : saida) {
			if (integer != null) {
				System.out.print(integer + " ");
			}
		}
	}

  private static void ordena(Integer[] vetor)
  {
    int aux = -1;
    for (int i = 0; i < vetor.length; i++)
    {
      for (int j = 0; j < vetor.length; j++)
      {
        if (vetor[i] <= vetor[j])
        {
          aux = vetor[i];
          vetor[i] = vetor[j];
          vetor[j] = aux;
        }
      }
    }
  }

  private static Integer[] duplicados(Integer[] vetor)
  {
		Integer[] repete = new Integer[vetor.length];

		for (int i = 0; i < vetor.length; i++) {
			int total = 0;
			for (int j = i + 1; j < vetor.length; j++) {
				if (vetor[i] == vetor[j]) {
					total++;
				}
			}
			if (total == 1) {
				repete[i] = vetor[i];
			}
		}
		return repete;
	}

	private static Integer[] removeDuplicados(Integer[] vetor) {
		Integer unicos[] = new Integer[vetor.length];
		int indiceQtd = 0;

		for (int i = 0; i < vetor.length; i++) {
			boolean existe = false;
			// verificar se existe
			for (int j = 0; j < indiceQtd; j++) {
				// Ja existe
				if (unicos[j] == vetor[i]) {
					existe = true;
					break;
				}
			}
			// se não existe, adiciono
			if (!existe) {
				unicos[indiceQtd] = vetor[i];
				indiceQtd++;
			}
		} // fim for
		return unicos;
	}

}