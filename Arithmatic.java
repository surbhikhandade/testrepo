package Polymorphism;

public class Arithmatic {

		void sum (int a) {
		System.out.println(a+a);
		}
		
		void sum(double a) {
			
			System.out.println(a+a);
		}
		
		void sum1(double a,double b) {
			System.out.println(a+b);
		}
		int sum (int a,int b) {
			return a+b;
		}
		void sum (int a,double b)
		{
			System.out.println(a+b);
		}
		void sum(double a,double b)
		{
			System.out.println(a+b);
		}
}//class end

class TestArithmatic {
		public static void main(String[] args) {
				
			Arithmatic ar = new Arithmatic ();
			ar.sum(10);
			ar.sum(10.5);
			ar.sum(10.5,20.5);
			ar.sum(10,20.9);
			ar.sum(10.5,20);
			ar.sum(10,10);
			
			
		}
}//class end	
