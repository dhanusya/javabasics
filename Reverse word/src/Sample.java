import java.util.Scanner;

public class Sample {
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
	   System.out.println("enter the string");
		String input=sc.next();
		String[] b=input.split("//");
		//System.out.println(input);
		for(int i=input.length()-1;i>=0;i--){
			System.out.println(b[i]);
			
		}
		
	}

}
