package insertionSort_插入排序;

public class P4_3 {
	
	static final int SIZE = 10;
	
	static void insertionSort(int[] a) {
		int i,j,t,h;
		for(i=1;i<a.length;i++) {
			t = a[i];                         //待插入的数
			j = i-1;
			while(j>=0 && t<a[j]) {           //依次比较，比待插入数大的数依次右移
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = t;                       //需要插入数的位置
			
			System.out.print("第"+i+"步排序结果：");
			for(h=0;h<a.length;h++) {
				System.out.print(" "+a[h]);
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] shuzu = new int[SIZE];
		int i;
		for(i=0;i<SIZE;i++){
			shuzu[i] = (int)(100+Math.random()*(100+1));   //初始化数组
		}
		
		System.out.println("排序前的数组：");
		for(i=0;i<SIZE;i++) {
			System.out.print(shuzu[i]+" ");
		}
		System.out.println("");
		
		insertionSort(shuzu);
		
		System.out.println("排序后的数组：");
		for(i=0;i<SIZE;i++) {
			System.out.print(shuzu[i]+" ");
		}
		System.out.println("");
	}

}
