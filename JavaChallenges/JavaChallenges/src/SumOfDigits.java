//	Digital root is the recursive sum of all the digits in a number.
//	
//	Given n, take the sum of the digits of n. If that value has more than one digit,
//	continue reducing in this way until a single-digit number is produced. The input will
//  be a non-negative integer.
//	
//	Examples
//	    16  -->  1 + 6 = 7
//	   942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
//	132189  -->  1 + 3 + 2 + 1 + 8 + 9 = 24  -->  2 + 4 = 6
//	493193  -->  4 + 9 + 3 + 1 + 9 + 3 = 29  -->  2 + 9 = 11  -->  1 + 1 = 2

public class SumOfDigits {

	public static void main(String[] args) {
		System.out.println(digitalRoot(942));
	}
	
	public static int digital_root(int n) {

		int sum = n;
		
		do {
			String stringNum = Integer.toString(sum);
			int digitCount = (int) Math.log10(sum) + 1;
			int[] digitArr = new int[digitCount];
			
			for (int i = 0; i < stringNum.length(); i++) {
				digitArr[i] = stringNum.charAt(i) - 48;
			}
			
			sum = 0;
			
			for (int digit = 0; digit < digitArr.length; digit++) {
				sum = sum + digitArr[digit];
			}
		} while ((int) Math.log10(sum) > 0);
		
		return sum;
	}
	
	public static int digitalRoot(int n) {
		while (n >= 10) {
			int sum = 0;
			System.out.println(n + " is greater than or equal to 10");
			while (n > 0) {
				sum += n % 10;
				n /= 10;
				
				System.out.println(sum + " " + n);
			}
			
			n = sum;
		}
		
		return n;
	}
}
