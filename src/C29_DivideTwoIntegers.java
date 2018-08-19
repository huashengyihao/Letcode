
public class C29_DivideTwoIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a = 2099999999;
//		int b = 2022222222;
//		System.out.println(a+b);
		System.out.println(divide(2147483647, 1));
	}

	public static int divide(int dividend, int divisor) {
		long d1 = dividend;
		long d2 = divisor;
		long count = 0;
		long tmpDividend = Math.abs(d1);
		long tmpDivisor = Math.abs(d2);
		int markDividend = 0;
		int markDivisor = 0;
		
        if (d1 + d2 > dividend) {
        	markDivisor = 1;
        } else {
        	markDivisor = -1;
        }
        if (d2 + d1 > divisor) {
        	markDividend = 1;
        } else {
        	markDividend = -1;
        }
        if (tmpDivisor == 1) {
        	count = tmpDividend;
        } else {
	    	while (tmpDividend - tmpDivisor >= 0) {
	        	tmpDividend = tmpDividend - tmpDivisor;
	        	count++;
	        }
        }
    	if (count >= Math.pow(2, 31) && markDivisor * markDividend == 1) {
    		count--;
    	}
		return (int) (count * markDivisor * markDividend);
    }
}
