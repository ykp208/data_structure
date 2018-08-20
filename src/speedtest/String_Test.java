package speedtest;

import java.util.ArrayList;
import java.util.List;

public class String_Test {

public static void main(String[] args) {
	

		String str = "0123456789";
		
		List<String> list = new ArrayList<>(100);
		long realSize = 0;
		for (int i = 1; i < 100000000; i++) {
		  String data = "0123456789" + str;
		  list.add(data);
		  realSize += data.getBytes().length;
		  if (i % 10000 == 0)
		    System.out.println("dataCount=" + i + ",dataSize=" + realSize);
		}
	
	

		long start2 = System.currentTimeMillis();
		
		
		List<String> list1 = new ArrayList<>(100);
		long realSize1 = 0;
		for (int i = 1; i < 100000000; i++) {
		  String data = new String("01234567890123456789"); // 요기 한줄만 다릅니다.
		  list1.add(data);
		  realSize1 += data.getBytes().length;
		  if (i % 10000 == 0) 
		   System.out.println("dataCount=" + i + ",dataSize=" + realSize);
		}
	
		
		
		long end2 = System.currentTimeMillis();
		System.out.println((end2-start2)/1000.0f);


}	


}
