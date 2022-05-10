package queue_Stack;

import java.util.Arrays;

public class MyCircularQueue {

	int[] queue;
	int start;
	int end;
	int k;

	public MyCircularQueue(int k) {
		this.k = k;
		queue = new int[k];
		start = 0;
		end = 0;
		Arrays.fill(queue, -1);
	}

	public boolean enQueue(int value) {
		if (end == start && queue[end] != -1) {
			return false;
		}
		queue[end++] = value;
		if (end == k) {
			end = 0;
		}
		return true;
	}

	public boolean deQueue() {
		if (queue[start] == -1) {
			return false;
		}
		queue[start++] = -1;
		if (start == k) {
			start = 0;
		}
		return true;
	}

	public int Front() {
		return queue[start];
	}

	public int Rear() {
		return end == 0 ? queue[k - 1] : queue[end - 1];
	}

	public boolean isEmpty() {
		return start == end && queue[end] == -1;
	}

	public boolean isFull() {
		return start == end && queue[end] != -1;
	}

	public static void main(String[] args) {
		// Design Circular Queue
		String[] input = { "MyCircularQueue", "enQueue", "enQueue", "enQueue", "enQueue", "Rear", "isFull", "deQueue",
				"enQueue", "Rear" };
		int[] input2 = { 3, 1, 2, 3, 4, 4 };
		MyCircularQueue q = new MyCircularQueue(input2[0]);
		int count = 1;

		for (int i = 1; i < input.length; i++) {
			String a = input[i];

			switch (a) {

			case "enQueue":
				System.out.println(q.enQueue(input2[count]));
				count++;
				break;

			case "deQueue":
				System.out.println(q.deQueue());
				break;

			case "Front":
				System.out.println(q.Front());
				break;

			case "Rear":
				System.out.println(q.Rear());
				break;

			case "isEmpty":
				System.out.println(q.isEmpty());
				break;

			case "isFull":
				System.out.println(q.isFull());
				break;
			}

		}

	}

}
