
public class IsEven {
	public static void main(String args[]) {	
	IsEven s=new IsEven();
	s.IsEven(10);
	System.out.println(s.IsEven(10));
}	
	public boolean IsEven(int n){
		if(n%2==0)
			return true;
		else 
			return false;		
	}
	}
