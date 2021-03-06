public class Recursion{
	public String name(){
		return "Castanos, Kaizen Lorenzo";
	}
	
	public int fact(int n){
		if (n<0){
			throw new IllegalArgumentException();
		}
		return facthelper(n, n-1);
	}
	public int facthelper(int a, int b){
		if (a == 0){
			return 1;
		}
		int c = a * b;
		if (b == 1){
			return c;
		}else{
			return facthelper(c, b-1);
		}
	}
	
	public int fib(int n){
		if (n<0){
			throw new IllegalArgumentException();
		}
		if (n == 0){
			return 0;
		}
		if (n == 1 || n == 2){
			return 1;
		}
		return fib(n-1) + fib(n-2);
	}
	
	public double sqrt(double n){
		return sqrthelp(n, n/2);
	}
	public double sqrthelp(double a, double b){
		if (.99*a <= b*b && 1.01*a >= b*b){
			return b;
		}
		return sqrthelp(a, (a/b+b)/2);
	}
}