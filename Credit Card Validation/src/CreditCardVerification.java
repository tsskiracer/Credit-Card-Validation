import java.util.Scanner;
public class CreditCardVerification {

	public static void main(String[] args) {
		Scanner davisIsAJerk = new Scanner(System.in);
		System.out.println("Please input a 16 digit credit card number.");
		long myArray[] = new long [16];
		long cC = davisIsAJerk.nextLong(); 
		
		
		for (int i = 15; i>=0; i--){
			if (i%2==0){
				if((cC%10)>=5){
					long x=(cC%10)*2;
					long y=(x/10);
					long z=(x%10);						
					myArray[i]=(y+z);}
				else{
					myArray[i]=(cC%10)*2;}
			}
			else{
				myArray[i]=cC%10;
				}
			cC/=10;
			}
		long sum=0;
		for (long fred:myArray){
			
			sum+=fred;
		}		
		if (sum%10==0){
			System.out.println("The card is valid.");}
		else{
			System.out.println("The card is invalid");}
	}

}