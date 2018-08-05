package algorithm;

import java.util.ArrayList;
import java.util.List;

public class Comparison_townum {

	private int[] solution1(int []arr) {
        
        ArrayList<Integer> arrylist = new ArrayList<>();
        for(int i = 0;i < arr.length;i++){
        	if(i+1==arr.length) {
        		arrylist.add(arr[i]);
        	}else {
	            if(arr[i]!=arr[i+1]){
	                arrylist.add(arr[i]);
	  
	            }
        	}
        }
        
        
        int[] answer =new int[arrylist.size()];
        
        for(int i =0;i<answer.length;i++) {
        	answer[i] = arrylist.get(i);	 
        }

        return answer;
	}
	
	private int[] solution2(int []arr) {
        ArrayList<Integer> tempList = new ArrayList<Integer>();
        int preNum = 10;
        for(int num : arr) {
            if(preNum != num)
                tempList.add(num);
            preNum = num;
        }       
        int[] answer = new int[tempList.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = tempList.get(i).intValue();
        }
        return answer;
    }
	
	public int[] solution3(int []arr) {
        StringBuilder sb = new StringBuilder();
        int size = arr.length;
        sb.append(arr[0]);
        for(int i=1; i<size; i++){
            if(arr[i-1]!=arr[i]) sb.append(arr[i]);
        }
        String[] array = sb.toString().split("");
        size = array.length;
        int[] answer = new int[size];
        for(int i=0; i<size; i++){
            answer[i] = Integer.parseInt(array[i]);
        }
        return answer;
    }
	
	public int[] solution4(int []arr) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] != arr[i - 1])
                list.add(arr[i]);
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++)
            answer[i] = list.get(i);

        return answer;
    }
	
	public static void main(String[] args) {
		int [] arr = {1, 1, 3, 3, 0, 1, 1};
		Comparison_townum ct = new Comparison_townum();
		
		long start1 = System.currentTimeMillis();
		for(int i =0;i<100000;i++)
		ct.solution1(arr);
		long end1 =System.currentTimeMillis();
		
		System.out.println((end1 - start1)/1000.0f);
		
		long start2 = System.currentTimeMillis();
		for(int i =0;i<100000;i++) 
		 ct.solution2(arr);
		long end2 =System.currentTimeMillis();
		
		System.out.println((end2 - start2)/1000.0f);
		
		
		long start3 = System.currentTimeMillis();
		for(int i =0;i<100000;i++) 
		 ct.solution3(arr);
		long end3 =System.currentTimeMillis();
		
		System.out.println((end3 - start3)/1000.0f);
		
		
		long start4 = System.currentTimeMillis();
		for(int i =0;i<100000;i++) 
		 ct.solution4(arr);
		long end4 =System.currentTimeMillis();
		
		System.out.println((end4 - start4)/1000.0f);
		
		
	}
}
