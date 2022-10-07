package multithreading;

public class m1 extends Thread
	{
	      private Thread thread;
	      private String threadName;

	      m1(String msg)
	      {
	             threadName = msg;
	             System.out.println("Creating thread: " +  threadName );
	      }
	      public void run()
	      {
	             System.out.println("Running thread: " +  threadName );
	             try
	             {
	                   for(int i = 0; i < 5; i++)
	                   {
	                         System.out.println("Thread: " + threadName + ", " + i);
	                         Thread.sleep(50);
	                   }
	             }
	             catch (InterruptedException e)
	             {
	                   System.out.println("Exception in thread: " +  threadName);
	             }
	             System.out.println("Thread " +  threadName + " continue...");
	      }   
	      public void start ()
	      {
	            System.out.println("Start method " +  threadName );
	            if (thread == null)
	            {
	                  thread = new Thread (this, threadName);
	                  thread.start ();
	            }
	      }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        m1 thread1 = new m1( "First Thread");
        thread1.start();
  
        m1 thread2 = new m1( "Second Thread");
        thread2.start();
	}
	
}
