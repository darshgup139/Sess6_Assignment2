import java.util.Scanner;

public class RunnableEg implements Runnable {
	int no, flag=1;
	Scanner inputR = new Scanner(System.in);

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Enter the no.");
		no = inputR.nextInt();
		for (int i = 2; i <= no / 2; i++) {
			if (no % i == 0) {
				System.out.println(no + " is not a Prime No.");
				flag = 0;
				break;
			}
		}
		if (flag == 1)
			System.out.println(no + " is a Prime No.");
	}

}
