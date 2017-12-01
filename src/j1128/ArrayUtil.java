package j1128;

public class ArrayUtil {
	private ArrayUtil() {
	}

	public static int max(int[] array) {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		return max;
	}

	public static void bubbleSort(int[] array) {
		for (int i = 1; i <= array.length - 1; i++) {
			for (int j = 0; j < array.length - i; j++) {
				if (array[j] > array[j + 1]) {
					swap(array, j, j + 1);
				}
			}
		}
	}

	
	private static void swap(int[] array, int x, int y) {
		int temp = array[x];
		array[x] = array[y];
		array[y] = temp;
	}
	public static void main(String[] args){
		int[] array = new int[]{3, 4, 1, 67, 5};
		int max = ArrayUtil.max(array);
		System.out.println(max);
		ArrayUtil.bubbleSort(array);
		System.out.println("----");
		for (int i : array) {
		   System.out.print(i + "  ");
		}

	}
}
