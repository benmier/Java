import java.util.concurrent.ThreadLocalRandom;

class Quicksort {
// Set up a call to the actual Quicksort method.
	static void qsort(int items[]) {
		qs(items, 0, items.length - 1);
	}
// A recursive version of Quicksort for characters.
	private static void qs(int items[], int left, int right) {
		int i, j;
		int x, y;
		i = left; j = right;
		x = items[(left + right) / 2];
		do {
			while ((items[i] < x) && (i < right)) i++;
			while ((x < items[j]) && (j > left)) j--;
			if (i <= j) {
				y = items[i];
				items[i] = items[j];
				items[j] = y;
				i++; j--;
			}
		} while (i <= j);
		if (left < j) qs(items, left, j);
		if (i < right) qs(items, i, right);
	}
}
class QSDemo {
	public static void main(String args[]) {
		int a[] = new int[100000000];
		int i;
		for(i=0; i<100000000; i++)
			a[i] = ThreadLocalRandom.current().nextInt(0,100000001);
		System.out.print("Original array: ");
		for (i = 0; i < 20; i++)
			System.out.print(a[i]+", ");
		System.out.println();
// now, sort the array
		Quicksort.qsort(a);
		System.out.print("Sorted array: ");
		for (i = 0; i < 20; i++)
			System.out.print(a[i]+", ");
	}
}