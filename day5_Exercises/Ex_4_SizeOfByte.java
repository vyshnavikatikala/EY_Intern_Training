package day5;

public class Ex_4_SizeOfByte {
       public static void main(String[] args) {
		byte b = 127;      // byte can hold the values from -128 to 127 only
		byte b1 = -128;
		byte b2 = 250;     // error - this is an integer and cannot be converted into byte
		byte b3 = -130;
	}
}
