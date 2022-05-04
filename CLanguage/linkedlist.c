#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>
#include<stdlib.h>
#include<string.h>

typedef struct NODE* list_ptr;
typedef  struct NODE {
	char data[4];
	struct NODE* link;
} NODE;

void insert(list_ptr ptr, char data[4], int position) {
	list_ptr input = NULL;
	list_ptr temp = ptr;
	int i;

	input = (list_ptr)malloc(sizeof(NODE));

	strcpy(input->data, data);

	for (i = 2; i < position + 1; i++) {
		temp = temp->link;
	}
	input->link = temp->link;
	temp->link = input;
}

void delete(list_ptr ptr, int position) {
	list_ptr temp = ptr;


	int i;

	for (i = 2; i < position + 1; i++) {
		temp = temp->link;
	}
	temp->link = temp->link->link;
	if (temp->link->data == NULL) {
		printf("리스트가 비었습니다.\n");
	}
}

void print_list(list_ptr ptr) {

	printf("삽입된 리스트 :");

	for (; ptr; ptr = ptr->link)
		printf(" %s", ptr->data);
	printf("\n");

}


int main() {
	NODE* ptr;

	ptr = (NODE*)malloc(sizeof(NODE));
	strcpy(ptr->data, " ");
	ptr->link = NULL;
	while (1) {
		int a;

		printf("----리스트---- \n");
		print_list(ptr);
		printf("1.삽입 ");
		printf("2.삭제 ");
		printf("3.종료\n");

		printf("번호 선택 : ");
		scanf("%d", &a);

		if (a == 1) { // 추가
			char str[4];
			int num;
			printf("데이터 입력 : ");
			scanf("%s", &str);
			printf("몇번째 노드에 추가시킬건가요? : ");
			scanf("%d", &num);
			insert(ptr, str, num);

			printf("\n");
		}

		else if (a == 2) { // 삭제
			char str[4];
			int num;

			printf("몇번째 노드를 삭제시킬건가요? : ");
			scanf("%d", &num);
			delete(ptr, num);
			printf("\n");
		}

		else if (a == 3) {
			printf("종료합니다.\n");
			exit(1);
		}
	}
}