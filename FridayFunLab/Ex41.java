package FridayFunLab;

public class Ex41 {
	public static void main(String[] args) {

		for (int i = 1, k = 1; i < 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((k++) + " ");
			}
			System.out.println();
		}

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(0 + " ");
			}
			System.out.println();
		}
	}
}
