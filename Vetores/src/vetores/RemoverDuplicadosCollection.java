package vetores;

import static vetores.VetoresConst.vetor1;
import static vetores.VetoresConst.vetor2;
import static vetores.VetoresConst.vetor3;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoverDuplicadosCollection {

	public static void main(String[] args) {

		Set<Integer> saida = new TreeSet<Integer>();
		Set<Integer> aux = new HashSet<Integer>();

		for (int i = 0; i < 4; i++) {
			if (!aux.add(vetor1[i])) {
				saida.add(vetor1[i]);
			}
			if (!aux.add(vetor2[i])) {
				saida.add(vetor2[i]);
			}
			if (!aux.add(vetor3[i])) {
				saida.add(vetor3[i]);
			}
		}

		System.out.println(saida);
	}

}