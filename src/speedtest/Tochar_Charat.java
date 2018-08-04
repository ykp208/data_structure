package speedtest;

public class Tochar_Charat {
	

	int getHashCode(String key) {
		int hashcode = 0;
		for(char c: key.toCharArray()) {
			hashcode +=c;
		}
		return hashcode/16;
	}
	
	
	
	int charat(String key , int i) {
		
		return (key.charAt(0) & ~(1 << i))/16; 
	}
	
	
	
	public static void main(String[] args) {
		
		Tochar_Charat tc =	new Tochar_Charat(); 
		
		
		
		long start = System.currentTimeMillis();
		for(int i =0 ;i < 100000;i++) {
			tc.getHashCode("ppppppppppppppppppppppppppppppppppppp");
		}
		long endtime = System.currentTimeMillis();
		System.out.println((endtime - start)/1000.0f);
		
		
		
		long start1 = System.currentTimeMillis();
		for(int i =0 ;i < 100000;i++) {
			tc.charat("ppppppppppppppppppppppppppppppppppppp",6);
		}
		long endtime1 = System.currentTimeMillis();
		System.out.println((endtime1 - start1)/1000.0f);
		
	}
}
