package ch2;

// 多重分支
public class Switch {
	public static void main(String[] args) {
		char grade = 'C';
		switch(grade) {
		case 'A':
			System.out.println("91~100");
			break;
		case 'B':
			System.out.println("81~90");
			break;
		case 'C':
			System.out.println("71~80");
			break;
		case 'D':
			System.out.println("61~70");
			break;
		default:
			System.out.println("error!");
		}
	}
}
