#define _CRT_SECURE_NO_WARNINGS

#define m 6
#define n 4

#include<stdio.h>

// queue�� ��ǥ(x, y)
struct node { 
	int x;
	int y;
} queue[100];

int waterMelon[100][100] = {0,}; // ������ ���� �迭 1�ϰ�� ����, 0�ϰ�� ��������
int day[100][100] = {0,}; // �ϼ� üũ

// ���� ���� �� : 1, 0 �� : -1, 0 �� : 0, -1 �� : 0, 1 
int var[2][4] = { 
	{1, -1, 0, 0}, 
	{0, 0, 1, -1} };

int count = 0; // �������� ����üũ
int front = 0, rear = 1; // ť front, rear ����

int BFS() {
	int a, b;

	while (++front < rear) { // ť�� ����������
		// ó�� while�������� front : 1, rear : 2

		for (int i = 0; i < 4; i++) {

			// queue�� front ��ǥ�� var�迭�� ������ ���ؼ� ��ǥ ����
			a = queue[front].x + var[0][i];
			b = queue[front].y + var[1][i];

			// a�� b�� ������ ���ڹڽ� ���� �� && �ش� ������ǥ�� 0�ϰ��
			if (a >= 1 && a <= m && b >= 1 && b <= n && waterMelon[b][a] == 0) {
				waterMelon[b][a] = 1; // �ش� ������ 1ȣ �ٲ�
				day[b][a] = day[queue[front].y][queue[front].x] + 1; // day ����(1���� ����)
				queue[rear].x = a;
				queue[rear++].y = b;
				count--; // count 1����
			}
		}
	}

	// ������ ��� �;��ٸ� (count = 0�ϰ��)
	if (count == 0) {
		return day[queue[rear - 1].y][queue[rear - 1].x]; // day-1�� ���� (9 - 1)
	}
	// �׷��� �ʴٸ�
	else {
		return -1;
	}
}

int main() {

	// i�� j�� 1���� �����ϴ� ������ ������ ��ǥ�� �����Ǵ��� �����ϱ�����
	for (int i = 1; i <= n; i++) {
		for (int j = 1; j <= m; j++) {

			// ���� ����
			if (i == 4 && j == 6) {
				int a = waterMelon[i][j] = 1;
				printf("%d ", a);
			}
			else {
				int a = waterMelon[i][j] = 0;
				printf("%d ", a);
			}

			// 0�� ������ �ִٸ� count����
			if (waterMelon[i][j] == 0) {
				count++;
			}
			// 1�� ������ ��ǥ�� ť�� ������ rear 1����
			else if (waterMelon[i][j] == 1) {
				queue[rear].x = j;
				queue[rear++].y = i;
			}
		}
		printf("\n");
	}
	printf("%d", BFS());
}