package com.practice.intv;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    public int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int result = 0;
        Map<Integer, Integer> remainderMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int mod = ar.get(i) % k;
            System.out.println("mod"+i+":"+mod);
            int complement = (k - mod) % k;
            System.out.println("complement"+i+":"+complement);
            result += remainderMap.getOrDefault(mod, 0);
            System.out.println("getOrDefault(complement, 0)= "+remainderMap.getOrDefault(complement, 0));
            System.out.println("Result"+i+":"+result);
            remainderMap.put(mod, remainderMap.getOrDefault(complement, 0) + 1);
            System.out.println("map"+i+":"+remainderMap);
            System.out.println("------------------------------------------------");
        }

        return result;
    }
}

public class divisible_sum {


	

	public static void main(String[] args) {
		
		List<Integer> ls = Arrays.asList(2, 6,4,3,5,1);
		
		Result rs=new Result();
		int res=rs.divisibleSumPairs(6, 5, ls);
		System.out.println(res);
		
		

	}

}
