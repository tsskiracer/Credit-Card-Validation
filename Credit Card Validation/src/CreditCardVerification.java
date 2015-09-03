import java.util.Scanner;
public class CreditCardVerification
	{

		public static void main(String[] args)
			{
				Scanner davisIsAJerk = new Scanner(System.in);
				System.out.println("Please input a 16 digit credit card number.");
				long myArray[] = new long [16];
				long cC = davisIsAJerk.nextInt(); 
				
				long x = cC*2;
				for (int i = 0; i<myArray.length; i+=2)
					{
						if (x>9)
							{
								myArray[i]=cC%10;
								cC/=10;
							}
					if (sum cC%10 == 0)
						
						
						
					}
				for (int j = 1; j<myArray.length; j+=2)
					{
						
					}

			}

	}
