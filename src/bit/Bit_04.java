package bit;

public class Bit_04 {

	static int clearLeftBits(int num, int i) {
		return num & ((i << 1) -1 );
	}
	public static void main(String[] a) {
		//1100010
		
		System.out.println(
					clearLeftBits((int)'a', 8));
		
		System.out.println((int)'a');
		
		System.out.println(clearLeftBits(8, 3));
	}
}	
