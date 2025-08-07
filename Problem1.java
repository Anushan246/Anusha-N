import java.util.Scanner;

class Calculator{
	double calculate(double a, double b, String op) {
		switch(op) {
		case "add":return a+b;
		case "sub":return a-b;
		case "mul":return a*b;
		case "div": return b!=0 ? a/b:0;
		default :return 0;

		}
	}
}

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Calculator c=new Calculator();

		System.out.println("Enter a:");
		double a=sc.nextDouble();

		System.out.println("Enter b:");
		double b=sc.nextDouble();

		System.out.println("Enter operation (add/sub/mul/div):");
		String op=sc.next();

		double result=c.calculate(a, b, op);
		System.out.println("Result: "+result);


	}

}
