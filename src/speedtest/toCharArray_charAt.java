package speedtest;



class tochar{
	
	
	int setHashCode(String ch) {
		
		int hashcode =0;
		for(char hash: ch.toCharArray()) {
			hashcode =+ hash;
		}
		return hashcode/16;
	}
	

	int chang(String str, int i) {
	
		return (int)(str.charAt(0)) & ~(1 << i);
	}
	
}

public class toCharArray_charAt {

	
	public static void main(String[] args) {
		
		
		tochar to = new tochar();
		
		
		long startTime = System.currentTimeMillis();
		for(int i=0 ; i < 100000;i++) {
			to.setHashCode("ffffffgggggggggggggggggfffffff");
		}
		long endTime = System.currentTimeMillis();
		System.out.println((endTime -startTime)/1000.0f);
		
		
		long startTime1 = System.currentTimeMillis();
		for(int i=0 ; i < 100000;i++) {
			to.chang(("ffffffgggggggggggggggggfffffff"),6);
		}
		long endTime1 = System.currentTimeMillis();
		System.out.println((endTime1 -startTime1)/1000.0f);
	}
}
