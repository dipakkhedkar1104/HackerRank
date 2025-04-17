package com.practice.intv;

import java.util.Stack;

public class ReverseArray1 {
	

    
    public boolean isAlphabet(char c){
        if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
            return true;
        }
        else {
            return false;
        }
    }
    
    public void reverseAlphabet(char arr[], int size) {
        
        int left = 0;
        int right = size - 1;
        
        while (left < right) {
            if (!isAlphabet(arr[left])) {
                left++;
            } else if (!isAlphabet(arr[right])) {
                right--;
            } else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
 
    public static void main(String[] args) {
        ReverseArray1 ar = new ReverseArray1();
        char arr[] = {'a', 'b', '$', 'c','%','*','d'};
        ar.reverseAlphabet(arr, arr.length);
        
        // Printing the reversed array
        for (char c : arr) {
            System.out.print(c + " ");
        }
//    	Stack<Integer> stack=new Stack<>();
//    	stack.push(1);
//    	stack.pop();
////    	stack.push("dipak");
//    	System.out.println(stack);
    }
}
