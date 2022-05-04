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
		printf("����Ʈ�� ������ϴ�.\n");
	}
}

void print_list(list_ptr ptr) {

	printf("���Ե� ����Ʈ :");

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

		printf("----����Ʈ---- \n");
		print_list(ptr);
		printf("1.���� ");
		printf("2.���� ");
		printf("3.����\n");

		printf("��ȣ ���� : ");
		scanf("%d", &a);

		if (a == 1) { // �߰�
			char str[4];
			int num;
			printf("������ �Է� : ");
			scanf("%s", &str);
			printf("���° ��忡 �߰���ų�ǰ���? : ");
			scanf("%d", &num);
			insert(ptr, str, num);

			printf("\n");
		}

		else if (a == 2) { // ����
			char str[4];
			int num;

			printf("���° ��带 ������ų�ǰ���? : ");
			scanf("%d", &num);
			delete(ptr, num);
			printf("\n");
		}

		else if (a == 3) {
			printf("�����մϴ�.\n");
			exit(1);
		}
	}
}