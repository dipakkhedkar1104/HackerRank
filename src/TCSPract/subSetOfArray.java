package TCSPract;

import java.util.HashMap;

public class subSetOfArray {
	
	//check arr1 is subset of arr2 or not
	public boolean checkSubset(int arr1[], int arr2[]) {
		
		int l1=arr1.length;
		int l2=arr2.length;
		
		HashMap<Integer, Boolean> map=new HashMap<>();
		
		
		if(l1>l2) {
			System.out.println("arr1 has more elements than the arr2, cant be subset");
			return false;
		}
		
		//for empty array (no need but to avoid unnessesory iterations)
		if (l1 ==0) {
			System.out.println("arr1 is empty so its subset of arr2");
            return true;
        }
		for(int i=0;i<l2;i++) {
			map.put(arr2[i], true);
		}
		for(int i=0;i<l1;i++) {
			if(!(map.containsKey(arr1[i]))) { 
				System.out.println("arr1 is not ss of arr2");
				return false;
				
				
			}
				
		
		}
	
		return true;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {};
		int arr2[]= {2,3,4,1,6,5};
		subSetOfArray ss=new subSetOfArray()
;
		boolean Checked=ss.checkSubset(arr1, arr2);
		if(Checked) {
			System.out.println("arr1 is subset of arr2");
		}
		else {
			System.out.println("not subset");
		}
		
	}

}
