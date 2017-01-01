
public class ThreadEg extends Thread {
	int no,flag=1;

	public ThreadEg(int number) {
		this.no = number;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 2; i <= no / 2; i++) {
			if (no % i == 0) {
				System.out.println(no + " is not a Prime No.");
				flag = 0;
				break;
			}
		}
		if(flag==1)
		System.out.println(no + " is a Prime No.");

	}

}
