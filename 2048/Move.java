package J2048;

public class Move {

	int[][] arr = new int[4][4];
	boolean[][] arr2 = new boolean[4][4];

	// �ʱ� ����
	void init() {
		System.out.println("���� ����");
		int i = (int) (Math.random() * 4);
		int j = (int) (Math.random() * 4);
		int k = ((int) (Math.random() * 2) + 1) * 2;
		arr[i][j] = k;
		arr2[i][j] = true;

		while (true) {
			i = (int) (Math.random() * 4);
			j = (int) (Math.random() * 4);
			k = ((int) (Math.random() * 2) + 1) * 2;
			
			if (arr2[i][j] == false) {
				arr[i][j] = k;
				arr2[i][j] = true;
				break;
			}
			
		}
	}

	Move() {
		init();
	}

	// ȭ�����
	void display() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++)
				System.out.printf("%3d ", arr[i][j]);
			System.out.println();
		}
		System.out.println();
	}

	// ���ڰ� ���ٸ� ���Ѵ�.
	void add(int[][] arr, int i, int j, int k, int l) {
		if (arr[i][j] == arr[k][l]) {
			arr[i][j] = arr[i][j] + arr[k][l];
			arr[k][l] = 0;
			arr2[k][l] = false;
		}
	}

	// ���ڸ��� 0�̶�� �����δ�.
	void shift(int[][] arr, int i, int j, int k, int l) {
		if (arr[i][j] == 0) {
			arr[i][j] = arr[k][l];
			arr2[i][j] = true;
			arr[k][l] = 0;
			arr2[k][l] = false;
		}
	}

	// ������ ��ġ�� ��ȣ ����
	void generate() {
		while (true) {
			int i = (int) (Math.random() * 4);
			int j = (int) (Math.random() * 4);

			if (arr2[i][j] == false) {
				arr[i][j] = 2;
				arr2[i][j] = true;
				break;
			}

		}
	}
	
	
	
	// -------------------�̵�
	
	// ����
	void left() {
		int k, l;

		// �������� �̵�
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				k = i;
				l = j;

				while (l >= 0) {
					shift(arr, k, l, k, l + 1);
					l--;
				}

			}
		}

		// ���ϱ�
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				add(arr, i, j, i, j + 1);
			}
		}

		// ���� �� �ٽ� �̵�
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				k = i;
				l = j;

				while (l >= 0) {
					shift(arr, k, l, k, l + 1);
					l--;
				}

			}
		}

		generate(); // ���ο� ���� ����
		System.out.println("left");
		display(); // ȭ�� ���
		
	}
	
	// ������
	void right() {
		int k, l;

		// ���������� �̵�
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr.length - 1; j > 0; j--) {
				k = i;
				l = j;

				while (l < arr.length) {
					shift(arr, k, l, k, l - 1);
					l++;
				}

			}
		}

		// ���ϱ�
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr.length - 1; j > 0; j--) {
				add(arr, i, j, i, j - 1);
			}
		}

		// ���� �� �ٽ� �̵�
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr.length - 1; j > 0; j--) {
				k = i;
				l = j;

				while (l < arr.length) {
					shift(arr, k, l, k, l - 1);
					l++;
				}

			}
		}
		
		generate(); // ���ο� ���� ����
		System.out.println("right");
		display(); // ȭ�� ���
		
	}

	// ��
	void up() {
		int k, l;

		// ���� �̵�
		for (int j = 0; j < arr.length; j++) {
			for (int i = 1; i < arr.length; i++) {
				k = i;
				l = j;

				while (k > 0) {
					shift(arr, k - 1, l, k, l);
					k--;
				}

			}
		}

		for (int j = 0; j < arr.length; j++) {
			for (int i = 1; i < arr.length; i++) {
				add(arr, i - 1, j, i, j);
			}
		}

		for (int j = 0; j < arr.length; j++) {
			for (int i = 1; i < arr.length; i++) {
				k = i;
				l = j;

				while (k > 0) {
					shift(arr, k - 1, l, k, l);
					k--;
				}

			}
		}
		
		generate(); // ���ο� ���� ����
		System.out.println("up");
		display(); // ȭ�� ���
		
	}
	
	// �Ʒ�
	void down() {
		int k, l;
		for (int j = 0; j < arr.length; j++) {
			for (int i = arr.length - 2; i >= 0; i--) {
				k = i;
				l = j;
				while (k < arr.length - 1) {
					shift(arr, k + 1, l, k, l);
					k++;
				}
			}
		}

		for (int j = 0; j < arr.length; j++) {
			for (int i = arr.length - 2; i >= 0; i--) {
				add(arr, i + 1, j, i, j);
			}
		}

		for (int j = 0; j < arr.length; j++) {
			for (int i = arr.length - 2; i >= 0; i--) {
				k = i;
				l = j;
				while (k < arr.length - 1) {
					shift(arr, k + 1, l, k, l);
					k++;
				}
			}
		}
		
		generate(); // ���ο� ���� ����
		System.out.println("down");
		display(); // ȭ�� ���

	}

}