package vetores;

import static vetores.VetoresConst.vetor1;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class RemoverDuplicados {

	public static void main(String[] args) {
		Set<Integer> array = new TreeSet<Integer>();
		array.addAll(Arrays.asList(vetor1));
		System.out.println("Resultado: " + array);
	}

}
