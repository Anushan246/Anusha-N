import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a:");
		int a=sc.nextInt();
		
		int count=0,num=1;
		while(count<a) {
			System.out.print(num +" ");
			num+=2;
			count++;
		}

	}

}
