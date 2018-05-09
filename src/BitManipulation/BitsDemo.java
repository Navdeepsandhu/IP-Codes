package BitManipulation;

public class BitsDemo {
	public static void main(String[] args) {
		// int num= 25 & 9;
		// System.out.println(num);

		// 11011
		int num = 27;
		int pos = 3;
		int bitmask = 1 << pos;
		bitmask = ~(bitmask);
		System.out.println((bitmask & num));
		// if((bitmask & num)==bitmask) {
		// System.out.println(pos+" bit is set");
		// }else {
		// System.out.println(pos+" bit is unset");
		// }

	}

}
