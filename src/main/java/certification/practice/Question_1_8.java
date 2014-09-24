package certification.practice;

class SuperClass {
	static String os = "";
	void doStuff() {
		os += "super ";
		System.out.println(os);
	}
}

public class Question_1_8 extends SuperClass {
	public static void main(String[] args) {
		new Question_1_8().go();
	}

	void go() {
		SuperClass s = new Question_1_8();
		Question_1_8 c = (Question_1_8) s;
		c.doStuff();
		s.doStuff();
		this.doStuff();
		super.doStuff();
		//c.super.doStuff();
		//s.super.doStuff();
		//this.super.doStuff();
		
	}
	
	void doStuff() {
		os += "cool";
		System.out.println(os);
	}
}
