import java.io.File;
import java.io.IOException;

import java.util.Scanner;

public class CreditCardValidationfromFile{
	static long origcC;
	public static void main(String[] args) throws IOException
		{
			Scanner file = new Scanner(new File("ccnumbers.txt"));
			System.out.println("Please input a 16 digit credit card number.");							
			while (file.hasNext())
				{
				long myArray[] = new long [16];
				origcC = file.nextLong(); 
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
					System.out.println(File + " This card is valid");
				}
				else
					System.out.println(File +" This card is invalid");
					
				
			file.close();


			}

	}
