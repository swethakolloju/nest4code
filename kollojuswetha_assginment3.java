import java.util.*;
public class kollojuswetha_assginment3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string1,string2;
		System.out.println("string1:");
		 string1=sc.next();
		System.out.println("string2:");
		 string2 =sc.next();
		 int len1,len2;
		 len1= string1.length();
		 len2= string2.length();
		 String output1 = string2.substring(len2-2,len2)+string1.substring(2,len1-2)+string2.substring(0,2);
		 String output2 = string1.substring(len1-2,len1)+string2.substring(2,len2-2)+string1.substring(0,2);
		 
		 System.out.println("result1 :"+output1);
		 System.out.println("result2 : "+output2);
		 
		 
		
	}

}
