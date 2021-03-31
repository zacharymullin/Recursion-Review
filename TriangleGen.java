public class TriangleGen{
	
	static int count = 1;
	
	public static void triangle(int n){
		if(n != 0){
			printStars(n);
			triangle(n-1);
		}
	}
	
	public static void reverseTriangle(int n){
		if(n + 1 != count){
			printStars(count);
			count++;
			reverseTriangle(n);
		}
		else if(n + 1 == count){
			count = 1;
		}
	}
	
	public static void printStars(int n){
		for(int i = 0; i < n; i++){
			System.out.print("*");
		}
		System.out.println("");
	}
}