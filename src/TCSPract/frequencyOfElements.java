package TCSPract;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class frequencyOfElements {
	
	public void frequencyOfElement(int [] arr) {
		Map<Integer,Integer> ic=new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			ic.put(arr[i], ic.getOrDefault(arr[i], 0)+1);
		}
		System.out.println(ic);
		
	}
	
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	
	
	//half ascending sort half descending sort
	public void asedecSort(int arr[]) { 
		Arrays.sort(arr);
		
		int temp[]=arr.clone();
		printArray(temp);
		
		int j=arr.length/2;
		for(int i=temp.length-1;i>temp.length/2-1;i--) {
			
			arr[j]=temp[i];
			j++;
			
			
		}
		System.out.println("\nafter rearrange....\n");
		printArray(arr);
		System.out.println("\nafter clone....\n");
		printArray(temp);
		
	}
	
    // Function to reverse a part of the array
    public static int[] reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

    // Function to rotate the array
    public static void rotateArray(int[] arr, int N, int K) {
        // Normalize K in case it's greater than N
        K = K % N;

        System.out.println("actual");
        printArray(arr);
        
        System.out.println("\nreverse");
        printArray(reverse(arr, 0, N - 1));
        // Step 1: Reverse the entire array
//        reverse(arr, 0, N - 1);
        
        // Step 2: Reverse the first K elements
        System.out.println("\nfirst k reverse");
        printArray( reverse(arr, 0, K - 1));
        
        // Step 3: Reverse the remaining N-K elements
        System.out.println("\nn-k reverse");
        printArray(reverse(arr, K, N - 1));
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,7,3,9,11,4,17};
		frequencyOfElements fe=new frequencyOfElements();
//		fe.frequencyOfElement(arr);
//		fe.asedecSort(arr);
		fe.rotateArray(arr, arr.length, 2);

	}

}
