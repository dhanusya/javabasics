
public class Sample {
		public static void main(String args[]){
		Sample e=new Sample();
		e.isMultiple(10,20);
		System.out.println(e.isMultiple(10,20));
		}
		public boolean isMultiple(int first , int second)
	{
		return first % second == 0 ? true : false;
	}
}
	
	