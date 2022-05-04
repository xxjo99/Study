#include <stdio.h>
#include <stdlib.h>
//BST  루트노드를 기준으로 왼쪽은 작은 숫자, 오른쪽은 큰 숫자
typedef struct TreeNode* tree_ptr;
typedef struct TreeNode {
	int key;
	struct TreeNode* left;
	struct TreeNode* right;

} TreeNode;

void insert_node(TreeNode** root, int key) {
	TreeNode* p, * q, * n;

	p = *root;
	q = NULL;

	while (p != NULL) {
		if (key == p->key) return;
		q = p;
		if (key < p->key) p = p->left;
		else p = p->right;
	}

	n = (TreeNode*)malloc(sizeof(TreeNode));
	if (n == NULL) return;

	n->key = key;
	n->left = n->right = NULL;

	if (q != NULL) {
		if (key < q->key)
			q->left = n;
		else {
			q->right = n;

		}
	}
	else *root = n;

}
void delete_node(TreeNode* node, int key) {
	TreeNode* p, * child, * succ, * succ_p, * t;

	TreeNode* temp = NULL;
	TreeNode* prev_node = NULL;
	p = NULL; t = node;

	if (t->key == key && t->left == NULL) {

		t->key = t->right->key;
		t->left = t->right->left;
		t->right = NULL;
		return;
	}

	while (t != NULL && t->key != key) {
		p = t;
		t = (key < t->key) ? t->left : t->right;
	}

	if (t == NULL) {
		printf("key is not in the tree");
		return;
	}

	else if ((t->left == NULL) && (t->right == NULL)) {

		if (p->left == t)
			p->left = NULL;
		else   p->right = NULL;
	}
	else if ((t->left == NULL) || (t->right == NULL)) {

		child = (t->left != NULL) ? t->left : t->right;
		if (p->left == t)
			p->left = child;
		else {
			p->right = child;

		}
	}
	else {

		succ = t->right;
		succ_p = NULL;
		while (succ->left != NULL) {
			succ_p = succ;
			succ = succ->left;
		}
		if (succ_p->left == succ)
			succ_p->left = succ->right;
		else
			succ_p->right = succ->right;
		t->key = succ->key;
		t = succ;
	}

	free(t);
}

// 전위순회
void preorder(TreeNode* ptr) {
	if (ptr) {
		printf("%d ", ptr->key);
		preorder(ptr->left);
		preorder(ptr->right);
	}
}

// 중위순회
void inorder(TreeNode* ptr) {
	if (ptr) {
		inorder(ptr->left);
		printf("%d ", ptr->key);
		inorder(ptr->right);
	}
}

// 후위순회
void postorder(TreeNode* ptr) {
	if (ptr) {
		postorder(ptr->left);
		postorder(ptr->right);
		printf("%d ", ptr->key);
	}
}

int main() {
	TreeNode* item;
	printf("전위 : 루트-왼쪽-오른쪽\n");
	printf("중위 : 왼쪽-오른쪽-루트\n");
	printf("후위 : 왼쪽-오른쪽-루트\n\n");

	item = (TreeNode*)malloc(sizeof(TreeNode));

	item = NULL;

	insert_node(&item, 1);
	insert_node(&item, 9);
	insert_node(&item, 2);
	insert_node(&item, 8);
	insert_node(&item, 3);
	insert_node(&item, 7);
	insert_node(&item, 4);
	insert_node(&item, 6);
	insert_node(&item, 5);
	TreeNode* iroot = item;
	printf("1, 9, 2, 8, 3, 7, 4, 6, 5 삽입\n");

	printf("전위순회 : ");
	preorder(iroot);
	printf("\n");
	printf("중위순회 : ");
	inorder(iroot);
	printf("\n");
	printf("후위순회 : ");
	postorder(iroot);
	printf("\n\n");

	delete_node(item, 1);
	delete_node(item, 2);
	delete_node(item, 3);
	delete_node(item, 4);
	delete_node(item, 5);
	TreeNode* droot = item;
	printf("1, 2, 3, 4, 5 제거\n");

	printf("전위순회 : ");
	preorder(droot);
	printf("\n");
	printf("중위순회 : ");
	inorder(droot);
	printf("\n");
	printf("후위순회 : ");
	postorder(droot);
}