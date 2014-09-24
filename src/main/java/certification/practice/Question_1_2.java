package certification.practice;

public class Question_1_2 {
	public static void main(String[] args) {
		short a1 = 6;
		new Question_1_2().go(a1);
		new Question_1_2().go(new Integer(7));
	}

	private void go(Short a1) {
		System.out.println("S");
	}
	private void go(Long a1) {
		System.out.println("L");
	}
	private void go(int a1) {
		System.out.println("i");
	}
	private void go(Number a1) {
		System.out.println("N");
	}
}
