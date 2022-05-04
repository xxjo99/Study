#include <stdio.h>
#include <stdlib.h>

typedef int element;
typedef struct node node_ptr;

typedef struct node {
	node_ptr* llink;
	element item;
	node_ptr* rlink;
} node;

void dinsert(node_ptr** node, element item)
{
	node_ptr* newnode = (node_ptr*)malloc(sizeof(node_ptr));
	newnode->item = item;

	if ((*node)->rlink == NULL && (*node)->llink == NULL) {
		newnode->rlink = *node;
		newnode->llink = *node;
		(*node)->llink = newnode;
		(*node)->rlink = newnode;
		(*node) = newnode;
	}

	else {
		newnode->llink = (*node);
		newnode->rlink = (*node)->rlink;
		(*node)->rlink->llink = newnode;
		(*node)->rlink = newnode;
		(*node) = newnode;
	}
}

void ddlete(node_ptr* node, int position)
{
	node_ptr* temp = node;

	int i;
	for (i = 0; i < position + 1; i++) {
		temp = temp->rlink;
	}

	temp->llink->rlink = temp->rlink;
	temp->rlink->llink = temp->llink;
	free(temp);
}

void print_dlist(node_ptr* phead) {
	node_ptr* curr = phead->rlink;
	while (curr->item != phead->item) {
		if (curr->item != 0) {
			printf("%d-> ", curr->item);
		}
		curr = curr->rlink;
	}
	printf("%d\n", phead->item);
}

int main() {
	printf("ÀÌÁß¿¬°á¸®½ºÆ®\n");
	node_ptr* head = (node_ptr*)malloc(sizeof(node_ptr));
	head->llink = NULL;
	head->rlink = NULL;

	//2~20
	int i;
	for (i = 2; i <= 20; i += 2) {
		dinsert(&head, i);
	}
	print_dlist(head);

	//1»ðÀÔ
	dinsert(&(head->rlink), 1);
	print_dlist(head);

	//21»ðÀÔ
	dinsert(&head, 21);
	print_dlist(head);

	//11À» 18µÚ¿¡ »ðÀÔ
	node_ptr* cur = head->rlink;
	while (cur->item != head->item) {

		cur = cur->rlink;
		if (cur->item == 18) {
			node_ptr* newnode;
			newnode = (node_ptr*)malloc(sizeof(node_ptr));
			newnode->item = 11;
			newnode->llink = cur;
			newnode->rlink = cur->rlink;
			cur->rlink->llink = newnode;
			cur->rlink = newnode;
		}
	}
	print_dlist(head);

	free(head);
}