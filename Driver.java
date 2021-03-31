public class Driver{
	public static void main(String[] args){
		System.out.println("Euclid:");
		System.out.println(Euclid.GCD(105,252));
		System.out.println("Triangle:");
		TriangleGen.triangle(5);
		System.out.println("Reverse Triangle:");
		TriangleGen.reverseTriangle(15);
		System.out.println("Strings - Reverse:");
		System.out.println(Strings.reverse("here is a test string"));
		System.out.println("Strings - Palindrome:");
		System.out.println("racecar - " + Strings.isPalindrome("racecar"));
		System.out.println("yeey - " + Strings.isPalindrome("yeey"));
		System.out.println("palindrome - " + Strings.isPalindrome("palindrome"));
		System.out.println("end - " + Strings.isPalindrome("end"));
	}
}