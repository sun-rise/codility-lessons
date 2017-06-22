package rise.sun.lessons.codility;

import java.util.Arrays;

public class TapeEquilibrium {
	public int solution(int[] A) {
		int sum = Arrays.stream(A).sum();
		
		int min = Integer.MAX_VALUE;
		int frontSum = 0;
		int len = A.length;
		for (int i = 0; i < len - 1; i++) {
			frontSum += A[i];
			min = Math.min(min, Math.abs((frontSum * 2) - sum));
		}
		return min;
	}
}
