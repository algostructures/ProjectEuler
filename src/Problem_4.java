
public class Problem_4 {
	public static void main(String arg[]) {
		int small = Integer.MIN_VALUE;
		for(int i = 100; i <= 999; i++) {
			for(int j = 100; j <= 999; j++) {
				if(small < i * j && isPalin(i*j)) {
					small = i * j;
				}
			}
		}
		System.out.println(small);
	}

	private static boolean isPalin(int i) {
		return ((""+i).equals(new StringBuilder(""+i).reverse().toString()));
	}
}
