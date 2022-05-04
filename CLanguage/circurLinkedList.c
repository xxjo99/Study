#include <stdio.h>
#include <stdlib.h>

typedef  struct list_node {
	int data;
	struct list_node* link;
} list_ptr;

void insert_front(list_ptr** pptr, int data) {
	list_ptr* node = (list_ptr*)malloc(sizeof(list_ptr));
	node->data = data;

	if (!(*pptr)) {
		*pptr = node;
		node->link = node;
	}

	else {
		node->link = (*pptr)->link;
		(*pptr)->link = node;
	}
}

void insert_rear(list_ptr** pptr, int data) {
	list_ptr* node = (list_ptr*)malloc(sizeof(list_ptr));
	node->data = data;

	if (!(*pptr)) {
		*pptr = node;
		node->link = node;
	}
	else {
		node->link = (*pptr)->link;
		(*pptr)->link = node;
		*pptr = node;
	}
}

void print_list(list_ptr* phead) {
	list_ptr* p = phead->link;

	while (p->data != phead->data) {
		printf("%d-> ", p->data);
		p = p->link;

	}
	printf("%d\n", phead->data);
}

int main() {
	list_ptr* ptr = (list_ptr*)malloc(sizeof(list_ptr));
	ptr = NULL;

	printf("원형연결리스트\n");

	// 2~20
	int i;
	for (i = 2; i <= 20; i += 2) {
		insert_rear(&ptr, i);
	}
	print_list(ptr);

	//1삽입
	insert_front(&ptr, 1);
	print_list(ptr);

	//21삽입
	insert_rear(&ptr, 21);
	print_list(ptr);

	// 11을 18뒤 삽입
	list_ptr* cur = ptr->link;
	while (cur->data != ptr->data) {
		cur = cur->link;
		if (cur->data == 18) {
			list_ptr* newnode = (list_ptr*)malloc(sizeof(list_ptr));
			newnode->data = 11;
			newnode->link = cur->link;
			cur->link = newnode;
		}
	}
	print_list(ptr);

	free(ptr);
}