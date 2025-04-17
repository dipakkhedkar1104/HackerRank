package TCSPract;

import java.util.ArrayList;
import java.util.List;

public class reverseArray {
	
	public void reverse(int [] arr) {
		int n=arr.length;
		int front=0;
		int rear=n-1;
		
		while(front <rear) {
			int temp=arr[front];
			arr[front]=arr[rear];
			arr[rear]=temp;
			front++;
			rear--;
		}
		for(int i=0;i<n;i++) {
		System.out.print(arr[i]+" ");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime=System.nanoTime();
		int [] arr= {1};
		reverseArray ra=new reverseArray();
		ra.reverse(arr);
		
		long endTime=System.nanoTime();
		System.out.println((endTime-startTime)*Math.pow(10, -9));
		

	}

}
