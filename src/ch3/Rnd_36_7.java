package ch3;

import java.util.Arrays;

// 36选7
public class Rnd_36_7 {
	public static void main(String[] args) {
		int[] a = new int[7];
		
		for(int i=0; i<a.length; i++) {
			oneNum:
			while(true) {
				a[i] = (int)(Math.random()*36) + 1;
				for(int j=0; j<i; j++) {
					if (a[j] == a[i]) {
						continue oneNum;
					}
				}
				break;
			}
		}
		
		Arrays.sort(a); // 升序排列
		
		for (int num : a) {
			System.out.println(num);
		}
	}
}
