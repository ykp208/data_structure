package algorithm;

import java.util.ArrayList;

public class kaka1 {
	public static void main(String[] args) {
		int [] arr1 = {9, 20, 28, 18, 11};
		int [] arr2 = {30, 1, 21, 17, 28};
		
		//{"#####","# # #","### #","#  ##","#####"}
		ArrayList<String> result = new ArrayList<>();
		for(int i = 0; i < 5;i ++) {
			
			int arr = arr1[i] | arr2[i];
			System.out.println(Integer.toBinaryString(arr));
			String tt ="";
			int toto =1;
			for(int j =0; j < 5; j++ ) {
				tt = ((arr & toto) > 0?"#" : " ")+tt;
				toto = toto  << 1 ;
			}
			result.add(tt);
		}
		
		
		System.out.println(result);
	}
	
	
}
