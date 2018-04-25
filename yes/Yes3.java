package yes;

import java.util.Scanner;

public class Yes3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
        System.out.println("Key in 5 different numbers");
        int [] numbe1=new int [5];
        
        System.out.println("Enter different numbers");
        
        for (int j=0; j<numbe1.length; j++)
        {
        	
        	numbe1[j] = scan.nextInt(); 
        }
        
        System.out.println("Please check the numbers if they are divisible by 4 & 5 but greater than 10");
        
           for(int i=0; i<numbe1.length; i++) {
           
		if ((numbe1[i]%5==0) && (numbe1[i]%4==0) && (numbe1[i]>10)) 
		{
		
		System.out.println(numbe1[i]);
		
		}
		else 
		{
		System.out.println("anwser not found");
		
	}

}

}
}
