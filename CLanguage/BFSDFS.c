#include <stdio.h>

int Graph[1001][1001] = { 0 };
int DFSvisit[1001] = { 0 };
int BFSvisit[1001] = { 0 };
int queue[1001];

void DFS(int v, int N) {
    int i;

    DFSvisit[v] = 1;
    printf("%d ", v);
    for (i = 1; i <= N; i++) {
        if (Graph[v][i] == 1 && DFSvisit[i] == 0) {
            DFS(i, N);
        }
    }

    return;
}

void BFS(int v, int N) {
    int front = 0, rear = 0, Pop, i;

    printf("%d ", v);
    queue[0] = v;
    rear++;
    BFSvisit[v] = 1;

    while (front < rear) {
        Pop = queue[front];
        front++;

        for (i = 1; i <= N; i++) {
            if (Graph[Pop][i] == 1 && BFSvisit[i] == 0) {
                printf("%d ", i);
                queue[rear] = i;
                rear++;
                BFSvisit[i] = 1;
            }
        }
    }

    return;
}

int main() {
    int n = 7;
    int m = 6;
    int start = 1;

    Graph[1][2] = 1;
    Graph[1][5] = 1;
    Graph[2][1] = 1;
    Graph[2][3] = 1;
    Graph[2][5] = 1;
    Graph[3][2] = 1;
    Graph[4][7] = 1;
    Graph[5][1] = 1;
    Graph[5][2] = 1;
    Graph[5][6] = 1;
    Graph[6][5] = 1;
    Graph[7][4] = 1;

    for (int i = 1; i <= 7; i++) {
        printf("V%d ---> ", i);
        for (int j = 1; j <= 7; j++) {
            int a = Graph[i][j];
            if (a == 1) {
                printf("%d ", j);
            }
        }
        printf("\n\n");
    }

    printf("<깊이 우선탐색 초기 정점>\n");
    printf("첫번째 탐색 노드 : %d\n", start);
    DFS(start, n);
    printf("\n\n");

    printf("<너비 우선탐색 초기 정점>\n");
    printf("첫번째 탐색 노드 : %d\n", start);
    BFS(start, n);

    return 0;
}
