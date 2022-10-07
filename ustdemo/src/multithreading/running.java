package multithreading;

public class running extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
        System.out.println("Main methods");
        running  obj = new running();
        //set the thread name2
        obj.setName("\nThreadName ");
        //calling run () method
        obj.start();

        ThreadGroup currentGroup = Thread.currentThread().getThreadGroup();
        int numThreads = currentGroup.activeCount();
        Thread[] lstThreads = new Thread[numThreads];
        currentGroup.enumerate(lstThreads);
        //System.out.println(currentThread);
        for (int i =1;i< numThreads ; i++)
        {
              System.out.println("Number of thread: "+i + "  " + lstThreads[i].getName());
        }

        //checking the current running thread
        Thread currentThread = Thread.currentThread();
        System.out.println("Current running thread: "+currentThread);
		
	}

}
