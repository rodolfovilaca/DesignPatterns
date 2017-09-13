package solution.utils;

import java.util.ArrayList;
import java.util.List;

public class SubsetSum {
	/*Retorna o subset de elementos dos quais a somatoria é igual a sum desejada
	 *A lista contem valores positivos e unicos.
	 */
	public static List<? extends ISubsetSum> getSubsetSum(List<? extends ISubsetSum> list, int sum) {
		ArrayList<ISubsetSum> subset = new ArrayList<>();
		if(list.isEmpty()){
			System.out.println("Lista de elementos deve conter ao menos uma Task");
			return subset;
		}
		for (int i = 0; i < list.size(); i++) {
			if (getSubsetSum(list, i, subset, getHighestSum(list, list.size(), sum))) {
				return subset;
			}
		}
		return subset;
	}

	private static int getHighestSum(List<? extends ISubsetSum> list, int n, int sum) {
		// Matriz da somatoria total desejada e da lista de elementos a se somar.
		boolean subset[][] = new boolean[sum + 1][n + 1];

		// primeira coluna toda true, pois se considera que com qualquer
		// conjunto se pode obter uma somatoria de 0.
		for (int i = 0; i <= n; i++)
			subset[0][i] = true;

		// nenhuma somatoria é possível com nenhum elemento.
		for (int i = 1; i <= sum; i++)
			subset[i][0] = false;

		// Vai verificando se com aqueles elementos se obtem a sum iterada.
		for (int i = 1; i <= sum; i++) {
			for (int j = 1; j <= n; j++) {
				subset[i][j] = subset[i][j - 1];
				if (i >= list.get(j - 1).getValue()) {
					subset[i][j] = subset[i][j] || subset[i - list.get(j - 1).getValue()][j - 1];
				}
			}
		}

		// itera sobre a ultima row de tras para frente até achar um valor true
		// e retorna a maior somatoria, tal que somatoria <= sum.
		int maxSum = 0;
		for (int i = sum; i > 0; i--) {
			if (subset[i][n] == true) {
				maxSum = i;
				break;
			}
		}

		return maxSum;

	}

	private static boolean getSubsetSum(List<? extends ISubsetSum> list, int index, ArrayList<ISubsetSum> subset, int sum) {
		if (index >= list.size()) {
			return false;
		}

		if (sum - list.get(index).getValue() == 0) {
			subset.add(list.get(index));
			return true;
		}

		if (sum - list.get(index).getValue() < 0) {
			return false;
		}

		sum -= list.get(index).getValue();
		for (int i = index + 1; i < list.size(); i++) {
			if (getSubsetSum(list, i, subset, sum)) {
				subset.add(list.get(index));
				return true;
			}
		}

		return false;
	}
}
