
public class Run {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("---Extends Thread class Example---");
		ThreadEg te = new ThreadEg(50);
		te.start();
		Thread.sleep(500);
		System.out.println();
		System.out.println("---Implements Runnable class Example---");
		RunnableEg re = new RunnableEg();
		Thread t = new Thread(re);
		t.start();
	}
}

/*
******************************************************************************
Output:
---Extends Thread class Example---
50 is not a Prime No.

---Implements Runnable class Example---
Enter the no.
23
23 is a Prime No.

******************************************************************************
*/