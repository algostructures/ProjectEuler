
public class Problem_9 {
	/*
	 * Learning : Every Pythagorian Tripelet can be written as
	 * 	a=2mn, b=m^2+n^2, c=m2-n2
	 * 
	 * */

	public static void main(String[] args) {
		for(int i = 1; i < 1000; i++) {
			for(int j = 1; j < 1000; j++) {
				for(int k = 1; k < 1000; k++) {
					if(i+j+k==1000) {
						if(i*i + j*j == k*k || j*j + k*k == i*i || i*i+k*k == j*j)
							System.out.println(i*j*k);
					}
				}
			}
		}
	}

}
