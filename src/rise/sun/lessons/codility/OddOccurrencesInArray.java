package rise.sun.lessons.codility;
import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArray {

	private Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
	
	public int solution(int A[]) {
		for (int i = 0; i < A.length; i++) {
			int value = A[i];
			if (!map.containsKey(value)) {
				map.put(value, true);
			} else {
				map.remove(value);
			}
		}
		return map.keySet().iterator().next();
	}
}
