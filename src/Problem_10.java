import java.util.Arrays;

public class Problem_10 {
	
	public static void main(String args[]) {
		boolean seive[] = new boolean[2_000_001];
		
		Arrays.fill(seive, true);
		
		for(long i = 2; i < seive.length; i++) {
			if(seive[(int)i] == true) {
				for(long j = i*i; j < seive.length; j+=i) {
					seive[(int)j] = false;
				}
			}
		}
		long sum = 0;
		for(int i = 2; i < 2_000_001; i++) {
			if(seive[i])
				sum+=i;
		}
		System.out.println(sum);
	}

}
