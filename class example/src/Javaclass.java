import java.util.Scanner;

public class Javaclass
{
	public static void main(String args[])
	{
		oops i=new oops();
		i.add();
	}
}
class oops
{
	int a;
       int b;
       public void add()
       {
		Scanner s=new Scanner(System.in);
				System.out.println("enter the values of a and b");
				a= s.nextInt();
				b=s.nextInt();
				System.out.println(a+b+a+b);
				
				
	}
}
