package BasicPrograms;

import java.util.Scanner;

public class ArmstrongDemo {

		public static void main(String[] args) {
			
			int r ,sum=0,temp;
			System.out.println("Enter Number");
	         Scanner sc = new Scanner(System.in);
			int n=sc.nextInt();
			temp = n;
			while(n>0)
			{
				r=n%10;
				n=n/10;
				sum=sum+r*r*r;
			}
			if(temp==sum)
				System.out.println("number is an armstrong");
			else
				System.out.println("Not an armstrong");
			
		}



	}


