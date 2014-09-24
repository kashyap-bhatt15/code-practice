package certification.practice;

public class Question_1_1 extends Thread {
	static Thread t1, t2, t3;
	public static void main(String[] args) {
		t1 = new Thread(new Question_1_1());
		t2 = new Thread(new Question_1_1());
		t3 = new Thread(new Question_1_1());
		t1.start();
		t2.start();
		t3.start();
	}
	public void run() {
		for(int i = 0; i < 500; i++) {
			System.out.print(Thread.currentThread().getId() + " ");
			if(i == 250)
				try {
					System.out.println("**" + t1.getId() + "**");
					t1.sleep(600);
				}
			catch (Exception e) {
			}
		}
	}
}
