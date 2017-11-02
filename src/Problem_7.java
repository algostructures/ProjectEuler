
public class Problem_7 {
	
	public static void main(String args[]) {
		int count = 1000000 +1;
		int ccount = 1;
		int numbers = 2;
		while(ccount != count) {
			if(isPrime(numbers)) {
				ccount++;
			}
			numbers++;
		}
		System.out.println(numbers-1);
	}
	
	public static boolean isPrime(int number) {
		if(number == 2) 
			return true;
		
		for(int i = 2; i <= Math.sqrt(number); i++) {
			if(number % i == 0)
				return false;
		}
		return true;
	}

}
