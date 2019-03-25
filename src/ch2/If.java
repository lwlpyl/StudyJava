package ch2;

// 分支结构
public class If {
	public static void main(String[] args) {
		int year = 2008;
		if(isLeapYear(year)) {
			System.out.println("是闰年");
		} else {
			System.out.println("不是闰年");
		}
	}
	
	// 判断是不是闰年
	public static boolean isLeapYear(int year) {
		if( (year%4==0 && year%100!=0) || (year%400==0) ) {
			return true;
		}
		return false;
	}
}
