package Sort;

public class Sort {
	//  插入排序
	public static void insertSort(int a[]) {
		for(int i=1; i<a.length; i++) {
			int temp = a[i];
			int j=0;
			while(temp>a[j]) {
				j++;
			}
			int k;
			for(k=i; k>=j+1; k--) {
				a[k] = a[k-1];
			}
			a[k] = temp;
		}
	}
	
	// 选择排序
	public static void selectSort(int a[]) {
		for(int i=0; i<a.length-1; i++) {
			int min = a[i];
			int mini = i;
			for(int j=i+1; j<a.length; j++) {
				if(a[j]<min) {
					min = a[j];
					mini = j;
				}
			}
			if(mini!=i) {
				int t = a[i];
				a[i] = min;
				a[mini] = t;
			}
		}
	}
	
	// 冒泡排序
	public static void maoPaoSort(int a[]) {
		for(int i=0; i<a.length-1; i++) {
			for(int j=0; j<a.length-1-i; j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		 int a[] = {5,3,4,1,2};
		 //Sort.insertSort(a);
		 //Sort.selectSort(a);
		 Sort.maoPaoSort(a);
		 for(int i=0; i<a.length; i++) {
			 System.out.println(a[i]);
		 }
		
	}
}
