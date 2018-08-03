package bit;

public class Bit_03 {
	static int clearBit(int num, int i) {
		return num & ~(1 << i);
	}
	public static void main (String[] arg0) {
		// 9  == 1001
		//1 << 3 == 1000
		//~1000 == 0111
		//       1001
		//		 0111
		//		 0001
		System.out.println(clearBit(9, 3));
		
		String pp ="good game";
		char tt = pp.charAt(0);
		char toto = pp.charAt(pp.length()-1);
		System.out.println(tt);
		System.out.println((int)tt);
		System.out.println(clearBit((int)tt, 6));
		
		System.out.println("-------------------");
		System.out.println(toto);
		System.out.println((int)toto);
		System.out.println(clearBit((int)toto, 6));

	}
}
