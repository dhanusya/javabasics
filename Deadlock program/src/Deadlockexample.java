
public class Deadlockexample {
	public void method1() {
        synchronized (String.class) {
            System.out.println("Aquired lock on String.class object");

            synchronized (Integer.class) {
                System.out.println("Aquired lock on Integer.class object");
            }
        }
    }
    public void method2() {
        synchronized (Integer.class) {
            System.out.println("Aquired lock on Integer.class object");

            synchronized (String.class) {
                System.out.println("Aquired lock on String.class object");
            }
        }
    }
    public static void main(String args[])
    {
    	Deadlockexample a=new Deadlockexample();
    a.method1();	
    System.out.println();
    }
/*This creates potential deadlock, if one thread holds String lock
 and other holds Integer lock and they wait for each other, forever.*/
}
