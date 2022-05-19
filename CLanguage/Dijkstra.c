#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>

#define MAX 999999
#define INF 999999

#define TRUE 1
#define FALSE 0

char* strArr[5] = { "���", "����", "����", "��õ", "����" };

int city[5][5] = { 
	{0, 160, 230, 320, INF}, //���
	{160, 0, 100, 150, INF}, //����
	{230, 100, 0, 140, 190}, //����
	{320, 150, 140, 0, 60}, //��õ
	{INF, INF, 190, 60, 0}, //����
};

int distance[5]; //���� �������κ����� �ִ� ��� �Ÿ�
int found[5]; //�湮�� ���� ǥ��
int check[5];//�� �������� ���� ������ ǥ��
int path[5][5]; //�ִܰŸ� �������� ��ġ�� ������ ����

void path_init(int path[][5]) {
	for (int i = 0; i < 5; i++) 
		for (int j = 0; j < 5; j++)
			path[i][j] = INF;
}

// �ִܰŸ��� �ִ� ������ ã�� �Լ�
int choose(int distance[], int n, int found[]) {
	int min = MAX;
	int minpos = -1;
	for (int i = 0; i < n; i++)
		if (distance[i] < min && !found[i]) {
			min = distance[i];
			minpos = i;
		}

	return minpos;
}

//�ִ� ��� �˰���
void shortest_path(int start, int n) {

	for (int i = 0; i < n; i++) {//�ʱ�ȭ
		distance[i] = city[start][i];
		found[i] = FALSE;
		check[i] = 1;
		path[i][0] = start;
	}

	found[start] = TRUE;
	distance[start] = 0;

	for (int i = 0; i < n - 2; i++) {
		int a = choose(distance, n, found);
		found[a] = TRUE;

		for (int j = 0; j < n; j++) {

			if (!found[j]) {
				if (distance[a] + city[a][j] < distance[j]) {

					if (i == 0) {
						path[j][check[j]] = a;
						check[j]++;
					}
					else {
						for (int k = 0; k < (check[a] + 1); k++) {
							path[j][k] = path[a][k];
							path[j][k + 1] = a;
							check[j]++;
						}
					}

					distance[j] = distance[a] + city[a][j];
				}
			}
		}
	}
}

void main() {
	path_init(path);
	shortest_path(0, 5);

	printf("<Djkstra's SP algoritsm>\n\n");
	for (int i = 1; i < 5; i++) {
		printf("%s -> %s : %d \n", strArr[0], strArr[i], distance[i]);
	}

}