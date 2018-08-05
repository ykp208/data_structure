package algorithm;

import java.util.ArrayList;

public class Divisor_Sort {

	 public int[] solution(int[] arr, int divisor) {
	     
		 ArrayList<Integer> array =new ArrayList<>();
		 array.add(0, 0);
		 for(int a: arr) {
			 
			 if(a/divisor>0) {
				 
				array.add(a);
			}
		}
			 
		 
		 
		 
		 
		 
		 
		 
		 
		 if(array.size()==1) array.add(-1);
		 
		 int[] answer = new int[array.size()-1];
		 
		 for(int i = 0;i<answer.length;i++) {
			 answer[i]=array.get(i+1);
		 }
		 
	      return answer;
	  }
	 
	 public static void main(String[] args) {
		Divisor_Sort ds = new Divisor_Sort();
		int arr[]= {2, 36, 1, 3};
		
		int[] tt = ds.solution(arr, 1);
		for(int a: tt) System.out.println(a);
	}
}
