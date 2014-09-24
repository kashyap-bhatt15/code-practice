package certification.practice;

import certification.practice.Numinor.Members;

public class Question_1_3 {

	public static void main(String[] args) {
		int h0 = Numinor.Members.HOBBITS.getHeight();
		//int h1 = Numinor.Members.getHeight();
		int h2 = Members.HOBBITS.getHeight();
		// int h3 = Members.getHeight();

	}

}

class Numinor {
	enum Members {
		HOBBITS(48), ELVES(74), DWARVES(50);
		int height;
		Members(int h) {
			height = h;
		}
		int getHeight() {
			return height;
		}
	}
}
