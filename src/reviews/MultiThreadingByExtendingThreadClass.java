package reviews;

class Mythread extends Thread {

	@Override
	public void run() {
		
 for(int i=0;i<=5;i++) {
	 
System.out.println("MyThread");
}

	}
}

public class MultiThreadingByExtendingThreadClass {

	public static void main(String[] args) {
		
		
		 Mythread t1=new Mythread();
		 t1.start();
		
		  for(int i=0;i<=5;i++)
		 {
		 System.out.println("Main Thread");

	}

}
}
