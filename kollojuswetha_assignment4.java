import java.util.*;
public class kollojuswetha_assignment4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number:");
		long num = sc.nextLong();
		num = Math.abs(num);
		long dig;
		int count1=0,count2=0;
	
		while(num!=0) {
			dig=num%10;
			if(dig%2==0) {
				count1++;
			}
			else {
				count2++;
			}
			num=num/10;
		}
		System.out.println("odd digit: "+count2);
		System.out.println("Even digit: "+count1);
	}

}
