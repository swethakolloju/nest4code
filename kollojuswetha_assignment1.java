import java.util.Scanner;
public class kollojuswetha_assignment1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
	    float price1,price2,price3,tax;
	    System.out.println("price 1 :");
		price1= sc.nextFloat();
		 System.out.println("price 2 :");
		price2=sc.nextFloat();
		 System.out.println("price 3 :");
		price3=sc.nextFloat();
		 System.out.println("tax % :");
		tax=sc.nextFloat();
		float sumOfPrices = price1+price2+price3;
		float tax_all = (tax/100)*sumOfPrices;
		float finalAmount = tax_all+sumOfPrices;
		System.out.println("Final Amount : "+finalAmount);
	
		

	}

}
