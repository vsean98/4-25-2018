package yes;

import java.util.Scanner;

public class Yes {

	public static void main(String[] args) {
int sum=0;
		Scanner scan=new Scanner(System.in);
        System.out.println("Key in 10 different numbers");
        int [] numbe=new int [10];
           for(int i=0; i<numbe.length; i++) {
	
	
	
	numbe[i]=scan.nextInt();
	
	
	
	sum=numbe[i]+sum;
	
	
	System.out.println(sum);
	
	
	}

}
}