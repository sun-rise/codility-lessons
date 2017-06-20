package rise.sun.lessons.codility;

public class CyclicRotation {

	public int[] solution(int[] A, int K) {
		int len = A.length;
		int[] R = new int[len];
		for (int i = 0; i < len; i++) {
			R[(K + i) % len] = A[i];
		}
		return R;
	}
}
