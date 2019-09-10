package Lab1;

public class Util {
	public static void reverse(int[] arr) {
		for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
			int t = arr[i];
			arr[i] = arr[j];
			arr[j] = t;
		}
	}

	public static int[] reversed(int[] arr) {
		int[] rev = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			rev[i] = arr[arr.length - 1 - i];
		}
		return rev;
	}

	public static int sumOfPositives(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > 0) {
				sum += arr[i];
			}
		}
		return sum;
	}
}
