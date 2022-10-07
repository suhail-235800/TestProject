package multithreading;

public class priorities extends Thread {

	 public void run()
     {
           System.out.println("run() method");
           String threadName = Thread.currentThread().getName();
           Integer threadPrio = Thread.currentThread().getPriority();
           System.out.println(threadName + " has priority " + threadPrio);
     }
     public static void main(String[] args) throws InterruptedException
     {
           priorities t1 = new priorities();
           priorities t2 = new priorities();
           priorities t3 = new priorities();

           t1.setPriority(Thread.MAX_PRIORITY);
           t2.setPriority(Thread.MIN_PRIORITY);
           t3.setPriority(Thread.NORM_PRIORITY);
 
           t1.start();
           t2.start();
           t3.start();
     }

}
