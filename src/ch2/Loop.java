package ch2;

// 循环结构
public class Loop {
	public static void main(String[] args) {
		// for循环
		int count = 0;
		for(int i=0; i<=100; i++) {
			count += i;
		}
		System.out.println(count);
		
		// while循环
		count = 0;
		int i = 0;
		while(i<=100) {
			count += i;
			i++;
		}
		System.out.println(count);
		
		//do-while循环
		count = 0;
		i = 0;
		do {
			count += i;
			i ++;
		}while(i<=100);
		System.out.println(count);
	}
}
