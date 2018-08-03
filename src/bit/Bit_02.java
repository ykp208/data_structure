package bit;

public class Bit_02 {
	static int setBit(int num, int i) {
		return num | (1 <<i );
	}
	public static void main(String[] args) {
		//5 ==   0101
		//1 << 3 1000
		//or     1101
		//13
		System.out.println(setBit(5, 3));
	}
}
