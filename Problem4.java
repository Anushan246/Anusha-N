
public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {1,2,8,9,12,46,76,82,15,20,30};
		
		for(int i=1;i<=9;i++) {
			int count=0;
			for(int num:arr) {
				if(num%i==0) count++;
				
				
			}
			System.out.println(i + ": "+count);
		}

	}

}
