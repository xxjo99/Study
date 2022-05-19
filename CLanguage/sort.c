#include <stdio.h>
#include <string.h>

void swap(int* xp, int* yp) {
	int temp = *xp;
	*xp = *yp;
	*yp = temp;
}

void printArray(int arr[], int size) {
	int i;
	for (i = 0; i < size; i++) {
		printf("%d  ", arr[i]);
	}
	printf("\n");
}

int bubble_Sort(int arr[], int size) {
	int flag = 1;
	int count = 0;

	for (int i = size - 1; flag > 0; i--) {
		flag = 0;
		for (int j = 0; j <i; j++) {

			if (arr[j] > arr[j + 1]) {
				swap(&arr[j], &arr[j + 1]);
				flag = 1;
			}

		}
		count++;
		printArray(arr, size);
	}

	return count;

}

int insertion_Sort(int arr[], int size) {
	int count = 0;

	for (int i = 1; i < size; i++) {
		int key = arr[i];
		int j = i - 1;

		while (j >= 0 && arr[j] > key) {
			arr[j + 1] = arr[j];
			j = j - 1;
		}

		arr[j + 1] = key;

		count++;
		printArray(arr, size);
	}

	return count;

}

int shell_Sort(int arr[], int size) {
	int count = 0;

	for (int i = size / 2; i > 0; i /= 2) {

		for (int j = 0; j < i; j ++) {

			for (int k = i + j; k < size; k += i) {
				int l = arr[k];
				int m = k;

				while (m > i - 1 && arr[m - i] > l) {
					arr[m] = arr[m - i];
					m -= i;
				}
				arr[m] = l;
			}

		}

		count++;
		printArray(arr, size);
	}

	return count;

}

int main() {
	int arr[] = { 11, 10, 33, 22, 55, 9, 99, 81, 15, 27 };
	int size = sizeof(arr) / sizeof(arr[0]);
	printf("---------- Original data ----------\n");
	printArray(arr, size);
	printf("\n");

	printf("---------- Bubble Sorted data ----------\n");
	printf("swap : %d번\n\n", bubble_Sort(arr, size));

	int arr1[] = { 11, 10, 33, 22, 55, 9, 99, 81, 15, 27 };
	printf("---------- insertion Sorted data ----------\n");
	printf("swap : %d번\n\n", insertion_Sort(arr1, size));

	int arr2[] = { 11, 10, 33, 22, 55, 9, 99, 81, 15, 27 };
	printf("---------- shell Sorted data ----------\n");
	printf("swap : %d번", shell_Sort(arr2, size));

	return 0;
}