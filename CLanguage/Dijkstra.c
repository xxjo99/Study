#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>

#define MAX 999999
#define INF 999999

#define TRUE 1
#define FALSE 0

char* strArr[5] = { "울산", "상주", "대전", "이천", "서울" };

int city[5][5] = { 
	{0, 160, 230, 320, INF}, //울산
	{160, 0, 100, 150, INF}, //상주
	{230, 100, 0, 140, 190}, //대전
	{320, 150, 140, 0, 60}, //이천
	{INF, INF, 190, 60, 0}, //서울
};

int distance[5]; //시작 정점으로부터의 최단 경로 거리
int found[5]; //방문한 정점 표시
int check[5];//한 정점으로 가는 정점을 표시
int path[5][5]; //최단거리 정점까지 거치는 노드들을 저장

void path_init(int path[][5]) {
	for (int i = 0; i < 5; i++) 
		for (int j = 0; j < 5; j++)
			path[i][j] = INF;
}

// 최단거리에 있는 정점을 찾는 함수
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

//최단 경로 알고리즘
void shortest_path(int start, int n) {

	for (int i = 0; i < n; i++) {//초기화
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