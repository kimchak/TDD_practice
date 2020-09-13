package arithmetic;

public final class Exercise02Factorial {

	public static final int factorial(int x) {
		if (x<0) throw new IllegalArgumentException();
		// TODO: implement
		if (x<2) return 1;
		else return factorial(x-1)*x;
		}
	}
	
//æwiczenie - przepisz przez for : result = result*x
//int result =1;
//for (int i=2; i<=x; i++) {
//	result=result*1;
//}
//return result;


//public static final int factorial(int x) {
//int wynik=1;
//for(;0<x;x--)
//{
//wynik*=x;
//}
//return wynik;
//}