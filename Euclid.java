public class Euclid{
	public static int GCD(int a, int b){
		a = Math.abs(a);
		b = Math.abs(b);
		if(a == b) return a;
		int small = Math.min(a,b);
		int big = Math.max(a,b);
		System.out.println("output: " + small + " " + big);
		return GCD(small, big-small);
	}
}