package rise.sun.lessons.codility;

import java.util.Arrays;

public class PermMissingElem {

	public int solution(int[] A) {
		int len = A.length;
		int sum = 0;
		for (int i = 1; i <= len + 1; i++) {
			sum += i;
		}
		return sum - Arrays.stream(A).sum();
	}
}
