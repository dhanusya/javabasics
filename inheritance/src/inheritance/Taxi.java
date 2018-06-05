package inheritance;

public class Taxi extends Car{
	public Taxi(){
		System.out.println("Taxi cons");
	}
	public Taxi(int n){
		System.out.println("Taxi 2 cons");
	}
	public static void main(String args[]){
		Car c=new Taxi();
	}
}
