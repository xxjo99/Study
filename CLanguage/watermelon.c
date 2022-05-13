#define _CRT_SECURE_NO_WARNINGS

#define m 6
#define n 4

#include<stdio.h>

// queue의 좌표(x, y)
struct node { 
	int x;
	int y;
} queue[100];

int waterMelon[100][100] = {0,}; // 수박을 담을 배열 1일경우 익음, 0일경우 익지않음
int day[100][100] = {0,}; // 일수 체크

// 방향 설정 우 : 1, 0 좌 : -1, 0 하 : 0, -1 상 : 0, 1 
int var[2][4] = { 
	{1, -1, 0, 0}, 
	{0, 0, 1, -1} };

int count = 0; // 익지않은 수박체크
int front = 0, rear = 1; // 큐 front, rear 설정

int BFS() {
	int a, b;

	while (++front < rear) { // 큐가 끝날때까지
		// 처음 while루프에서 front : 1, rear : 2

		for (int i = 0; i < 4; i++) {

			// queue의 front 좌표와 var배열의 방향을 더해서 좌표 설정
			a = queue[front].x + var[0][i];
			b = queue[front].y + var[1][i];

			// a와 b의 범위가 수박박스 범위 내 && 해당 수박좌표가 0일경우
			if (a >= 1 && a <= m && b >= 1 && b <= n && waterMelon[b][a] == 0) {
				waterMelon[b][a] = 1; // 해당 수박을 1호 바꿈
				day[b][a] = day[queue[front].y][queue[front].x] + 1; // day 증가(1부터 시작)
				queue[rear].x = a;
				queue[rear++].y = b;
				count--; // count 1감소
			}
		}
	}

	// 수박이 모두 익었다면 (count = 0일경우)
	if (count == 0) {
		return day[queue[rear - 1].y][queue[rear - 1].x]; // day-1값 리턴 (9 - 1)
	}
	// 그렇지 않다면
	else {
		return -1;
	}
}

int main() {

	// i와 j가 1부터 시작하는 이유는 수박의 좌표와 방향판단을 쉽게하기위해
	for (int i = 1; i <= n; i++) {
		for (int j = 1; j <= m; j++) {

			// 수박 저장
			if (i == 4 && j == 6) {
				int a = waterMelon[i][j] = 1;
				printf("%d ", a);
			}
			else {
				int a = waterMelon[i][j] = 0;
				printf("%d ", a);
			}

			// 0인 수박이 있다면 count증가
			if (waterMelon[i][j] == 0) {
				count++;
			}
			// 1인 수박의 좌표를 큐에 대입후 rear 1증가
			else if (waterMelon[i][j] == 1) {
				queue[rear].x = j;
				queue[rear++].y = i;
			}
		}
		printf("\n");
	}
	printf("%d", BFS());
}