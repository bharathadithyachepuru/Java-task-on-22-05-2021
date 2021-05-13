package reviews;

class MultiTask implements Runnable
{

@Override
public void run() {
 
	for(int i=0;i<=5;i++) {
		
System.out.println("MyThread");

}
  }
    }

public class MultiThreadingByImplementingRunnableInterface {

	public static void main(String[] args) {
		
		Mythread t1=new Mythread();
		 
		 Thread t2=new Thread(t1);
		 
		 t2.start();
		 
		 for(int i=0;i<=5;i++)
		 {
		 System.out.println("Main Thread");
		 }

	}

}
