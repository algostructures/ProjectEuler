
import java.io.*;
import java.util.*;

public class Problem_2 {
	final static long MOD = 1000000007; 
	public static void main(String[] args) {
		int first = 1;
		int second = 2;
		int fib = 0;
		int sum = 0; 
		while(fib < 4000000) {
			if(fib % 2 == 0) {
				sum += fib;
			}
			fib = first + second;
			first = second;
			second = fib;
		}
		System.out.println(sum+2);

	}
	
}
