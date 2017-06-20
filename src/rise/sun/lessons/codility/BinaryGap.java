package rise.sun.lessons.codility;

public class BinaryGap {

	public int solution(int N) {
		int gap = 0;
		int maxGap = 0;
		String binary = Integer.toBinaryString(N);
		
		boolean doCount = false;
		int len = binary.length();
		for (int i = 0; i < len; i++) {
			char ch = binary.charAt(i);
			
			if (i  == len - 2 && '0' == binary.charAt(i + 1)) {
				break;
			}
			if ('1' == ch) {
				maxGap = (gap > maxGap) ? gap : maxGap;
				gap = 0;
				doCount = false;
				if (i  < len - 2 && '0' == binary.charAt(i + 1)) {
					doCount = true;
				}
			} else if ('0' == ch && doCount) {
				gap++;
			}
		}
		return maxGap;
	}
}
