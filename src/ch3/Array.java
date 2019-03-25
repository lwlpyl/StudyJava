package ch3;

// 数组
public class Array {
	public static void main(String[] args) {
		// 定义、初始化
		int[] a =  new int[4];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		int[] b = {4,5,6};
		
		// 默认值
		System.out.println("a[3] = " + a[3]);
		
		// 长度
		System.out.println("数组a的长度：" + a.length);
		
		// 可写遍历
		for (int i=0; i<b.length; i++) {
			System.out.print(b[i]);
		}
		
		// 只读遍历
		for (int x : b) {
			System.out.print(x);
		}
		
		// 复制
		System.arraycopy(a, 0, b, 0, b.length);
		for (int x : b) {
			System.out.print(x);
		}
	}
}
