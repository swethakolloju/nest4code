import java.util.Scanner;
public class kollojuswetha_Assignment2 {
	public static float heightConvertor(int feet,int inch) {
		float heightIncm = (float) ((feet*12+inch)*2.54);
		return heightIncm;
	
	}
	public static float weightConvertor(int weight) {
		float  weightInpounds = (float) (weight*2.2);
		return weightInpounds;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int feet = sc.nextInt();
		int inch = sc.nextInt();
		int weight = sc.nextInt();
		float heightincm = heightConvertor(feet,inch);
		float weightinpounds = weightConvertor(weight);
		System.out.println("Height in cm :"+heightincm);
		System.out.println("Weight in pounds :"+weightinpounds);
		

	}
	

}
