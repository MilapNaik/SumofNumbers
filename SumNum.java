/* THIS CODE IS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING 
 * A TUTOR OR CODE WRITTEN BY OTHER STUDENTS. Milap Naik */

import java.util.Scanner;
  
public class SumNum
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner( System.in );
		System.out.print("Enter an addition expression: ");
		
		String j = input.nextLine();
		int sum = 0;
    
		for (int i = 0; i < j.length(); i++) {
			if (Character.isDigit(j.charAt(i))) {
				int l = 0;
				String num = "";
				while (Character.isDigit(j.charAt(i+l))){
					num += j.charAt(i+l);
					if ((i+l) == j.length()-1)
						break;
					l++;
				}
				i = i+l;
        
				int number = Integer.parseInt(num);
				sum = sum + number;
			} 
		}
		System.out.println("Sum is: " + sum);
		input.close();
	}
}
      
    
