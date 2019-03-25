package ch4;

enum Light {Red, Yellow, Green};

public class Ch4 {
	public static int num; 
	
	public static void main(String[] args) {
		System.out.println(num); // 静态成员变量有默认值
		
		// 接口的使用
		Collection c = new FIFOQueue();
		c.add(num);
		
		// 枚举
		Light light = Light.Red;
		switch(light) {
		case Red:
			System.out.println("red");
			break;
		case Yellow:
			System.out.println("yellow");
			break;
		case Green:
			System.out.println("Green");
			break;
		default:
			break;
		}
		
	}
	
	
}