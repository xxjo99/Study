#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>
#include <string.h>
#include <malloc.h>

FILE* fp1, * fp2;

// ��� ����
typedef struct node* node_ptr;
typedef struct node {
	node_ptr left;
	node_ptr right;
	int componentNum; // ������Ʈ ��ȣ
	char name[21]; // ������Ʈ �̸�
	int stock; // ���
	int re_order; // ���ֹ�����
} node;

// ������Ʈ �߰�
void add_Component(node_ptr* rootNode, node_ptr addComponent, FILE* fp2) {
	node_ptr parentNode = NULL; // �θ���
	node_ptr curNode = *rootNode; // ������ 
	int comNum; //������Ʈ ��ȣ ����

	// ������Ʈ ��ȣ�� ������ �ʰ��������
	if (addComponent->componentNum < 100001 || addComponent->componentNum > 999999) {
		fprintf_s(fp2, "%d  ������Ʈ ��ȣ ����(������ ��������, N) \n", addComponent->componentNum);
		return;
	}

	// ���� ������Ʈ�� �����ϴ��� Ȯ��
	while (curNode != NULL) {

		// �����Ѵٸ�
		if (addComponent->componentNum == curNode->componentNum) {
			comNum = curNode->componentNum;
			fprintf_s(fp2, "%d  ������Ʈ ��ȣ �ߺ�, N\n", comNum);
			return;
		}
		// �׷����ʴٸ� curNode = parentNode (��Ʈ��尡 �ȴ�)
		parentNode = curNode;

		// curNode�� newComponent(���ο� ������Ʈ)���� �۴ٸ�
		if (addComponent->componentNum > curNode->componentNum) {
			curNode = curNode->right;
		}
		// curNode�� newComponent���� ũ�ٸ�
		else if (addComponent->componentNum < curNode->componentNum) {
			curNode = curNode->left;
		}
	}

	// �θ���� ����
	// �θ��尡 ���ٸ�
	if (parentNode == NULL) {
		*rootNode = addComponent;
	}
	// newComponent�� component��ȣ�� parentNode�� component���� ũ�ٸ�
	else if (addComponent->componentNum > parentNode->componentNum) {
		parentNode->right = addComponent;
	}
	// �׿�
	else {
		parentNode->left = addComponent;
	}

}

// ������Ʈ ����
void del_Component(node_ptr* rootNode, int delComponent, FILE* fp2) {
	node_ptr delComNum = *rootNode; // ������ ������Ʈ�� ��� ����
	node_ptr parentNode = NULL; // comNum �θ���
	node_ptr childNode = NULL; // comNum �ڽĳ��

	// ����Ʈ���� �ּҰ� Ž���� ���
	node_ptr minChild;
	node_ptr minParent;

	// ������ componentNum�� ���� ��� Ž��(BST).
	while (delComNum != NULL && delComNum->componentNum != delComponent) {
		parentNode = delComNum;

		// componentNum�� �θ����� componentNum���� ũ�ٸ�
		if (delComponent > parentNode->componentNum) {
			delComNum = parentNode->right;
		}
		// �׷����ʴٸ�
		else if (delComponent < parentNode->componentNum) {
			delComNum = parentNode->left;
		}
	}

	// ���� delComNum�� NULL�̶�� (������ ������Ʈ ����X)
	if (delComNum == NULL) {
		fprintf_s(fp2, "%d ������ ������Ʈ�� ����, D\n", delComponent);
		return;
	}

	// delComNum�� �ڽĳ��(childNode)�� �������
	if (delComNum->left == NULL && delComNum->right == NULL) {
		// ���� �θ� ��尡 NULL�� �ƴ϶��
		if (parentNode != NULL) {
			if (parentNode->left == delComNum) {
				parentNode->left = NULL;
			}
			else {
				parentNode->right = NULL;
			}
		}
		else { // �׷��� �ʴٸ�, ������ ��� = ��Ʈ���
			*rootNode = NULL;
		}
	}

	// delComNum�� ����Ʈ���� �ϳ��ϰ��
	else if ((delComNum->left == NULL) || (delComNum->right == NULL)) {

		if (delComNum->left != NULL) {
			childNode = delComNum->left;
		}
		else {
			childNode = delComNum->right;
		}

		//�θ��尡 NULL�� �ƴҰ�� delComNum�� �θ��忡 delComNum�� �ڽĳ�带 ����
		if (parentNode != NULL) { // delComNum�� ���ʿ� ����
			if (parentNode->left == delComNum) {
				parentNode->left = childNode;
			}
			else { // delComNum�� �����ʿ� ����
				parentNode->right = childNode;
			}
		}
		else { // �θ� ��尡 NULL�ϰ�� rootNode = childNode
			*rootNode = childNode;
		}
	}

	//delComNum�� ����Ʈ���� �ΰ��ϰ��
	else {

		// ������ ����Ʈ���� ���� ���� �� Ž��
		minParent = delComNum;
		minChild = delComNum->right;
		while (minChild->left != NULL) {
			minParent = minChild;
			minChild = minChild->left;
		}

		// minParent�� left�� minChild�� �������
		if (minParent->left == minChild) {
			minParent->left = minChild->right;
		}
		// �׷����������
		else {
			minParent->right = minChild->right;
		}

		delComNum->componentNum = minChild->componentNum;
		delComNum = minChild;
	}

	free(delComNum);
}

// ������Ʈ�� ��� üũ
void comAmount(node_ptr item, int inventory, FILE* fp2) {
	if (item) {
		// ����� 0���� �������
		if (item->stock + inventory < 0) {
			fprintf_s(fp2, "%d ����� ������� ����\n", item);
			return;
		}
		item->stock = item->stock + inventory;
	}
}

// ���
void printCom(node_ptr rootNode, FILE* fp2) {
	if (rootNode != NULL) {

		printCom(rootNode->left, fp2);
		fprintf_s(fp2, "%d  %s  %d  %d     ", rootNode->componentNum, rootNode->name, rootNode->stock, rootNode->re_order);

		// ����� ���ֹ� ���غ��� �������
		if (rootNode->stock < rootNode->re_order) {
			fprintf_s(fp2, "*���ֹ� �ʿ�*");
		}
		fprintf_s(fp2, "\n");

		printCom(rootNode->right, fp2);
	}
}

// componentNumŽ��
node_ptr search(node_ptr rootNode, int componentNum, FILE* fp2) {

	// root�� NULL�� �ƴҰ�� �ݺ�
	while (rootNode != NULL) {

		// ���ϴ� componentNum�� ã���� ���
		if (componentNum == rootNode->componentNum) {
			return rootNode;
		}
		// ã�� componentNum�� ��Ʈ�� componentNum���� �������
		else if (componentNum < rootNode->componentNum) {
			rootNode = rootNode->left; // ���� ����Ʈ���� �̵�
		}
		// ã�� componentNum�� ��Ʈ�� componentNum���� Ŭ���
		else if ((componentNum > rootNode->componentNum)) {
			rootNode = rootNode->right; // ������ ����Ʈ���� �̵�
		}
	}

	// ������Ʈ ��ȣ�� �������
	fprintf_s(fp2, "%d   ������Ʈ ��ȣ ����\n", componentNum);
	return NULL;
}

int main()
{
	node_ptr item = NULL;
	node_ptr newnode = NULL;
	int* num;

	int comNum, inv, reorder; // ������Ʈ��ȣ, ���, ���ֹ�����

	int comNumarr[10] = { 0, }; // component��ȣ ����
	char comNamearr[20] = { 0 }; //component�̸�����
	int invarr[3] = { 0, }; // inventory ����
	int reorderarr[3] = { 0, }; // reorder ����
	char data; // ���ĺ� ����
	char buf[50] = { 0, };  // ���پ� �����ؼ� ���� �迭

	fp1 = fopen("input.txt", "r");
	fp2 = fopen("output.txt", "w");

	while (!feof(fp1)) {

		// ���ο� ��� �Ҵ�, �ʱ�ȭ
		newnode = malloc(sizeof(node));
		newnode->left = NULL;
		newnode->right = NULL;
		fgets(buf, 50, fp1);
		data = buf[0];
		comNum = 0, inv = 0, reorder = 0;

		// data�� ���� �а� ��ɾ� �Ǵ�
		switch (data) {
		case 'N':  //������Ʈ �߰� 
			// 3~8�� ������Ʈ ��ȣ
			for (int i = 2; i < 8; i++) {
				// ���� ���ڰ� �������� �ѱ�
				if (buf[i] == ' ') {
					i++;
				}
				// �׷��� �������
				else {
					comNumarr[i] = buf[i] - '0';

					for (int j = i - 2; j < 5; j++) {
						comNumarr[i] = comNumarr[i] * 10;
					}

					comNum += comNumarr[i];
				}
			}

			int j = 0;
			// 10~29�� ������Ʈ �̸�(����)
			for (int i = 9; i < 28; i++) {
				comNamearr[j] = buf[i];
				j++;
			}

			j = 0;
			// 31~35�� �ʱ� ��� Ȥ�� �߰�/������ ��
			for (int i = 30; i < 35; i++) {
				if (buf[i] == ' ') {
					i++;
				}
				if (buf[i] >= '0') {
					invarr[j] = buf[i] - '0';
					j++;
				}
			}
			int n = j;
			for (int k = 0; k < n; k++) {
				for (int i = 1; i < j; i++) {
					invarr[k] = invarr[k] * 10;
					j--;
				}
				inv += invarr[k];
			}

			// 41~45 ���ֹ� ����
			for (int i = 40; i < 45; i++) {
				if (buf[i] == ' ') {
					i++;
				}
				if (buf[i] > '0') {
					reorderarr[j] = buf[i] - '0';
					j++;
				}
			}
			n = j;
			for (int k = 0; k < n; k++) {
				for (int i = 1; i < j; i++) {
					reorderarr[k] = reorderarr[k] * 10;
					j--;
				}
				reorder += reorderarr[k];
			}

			// ��� �а� fp2�� ����
			newnode->componentNum = comNum;
			strcpy_s(newnode->name, 20, comNamearr);
			newnode->stock = inv;
			newnode->re_order = reorder;
			add_Component(&item, newnode, fp2);
			break;

		case 'D':  //������Ʈ ���� (��ȣ�� Ȯ���ϸ� ��)
			for (int i = 2; i < 8; i++) {

				if (buf[i] == ' ') {
					i++;
				}
				else {
					j = i;
					comNumarr[i] = buf[i] - '0';

					for (j = i - 2; j < 5; j++) {
						comNumarr[i] = comNumarr[i] * 10;
					}

					comNum += comNumarr[i];
				}
			}

			newnode->componentNum = comNum;
			del_Component(&item, comNum, fp2);
			break;

		case 'A':  //��� �߰� (��ȣ�� ���� Ȯ��)
			for (int i = 2; i < 9; i++) {
				if (buf[i] == ' ') {
					i++;
				}
				else {
					j = i;
					comNumarr[i] = buf[i] - '0';

					for (j = i - 2; j < 5; j++) {
						comNumarr[i] = comNumarr[i] * 10;
					}
					comNum += comNumarr[i];
				}
			}

			j = 0;
			for (int i = 30; i < 35; i++) {
				if (buf[i] == ' ') {
					i++;
				}
				if (buf[i] > '0') {
					invarr[j] = buf[i] - '0';
					j++;
				}
			}
			n = j;
			for (int k = 0; k < n; k++) {
				for (int i = 1; i < j; i++) {
					invarr[k] = invarr[k] * 10;
					j--;
				}
				inv += invarr[k];
			}

			newnode->componentNum = comNum;
			comAmount(search(item, comNum, fp2), inv, fp2);
			break;

		case 'R': //��� ���� (��ȣ�� ���� Ȯ��)
			for (int i = 2; i < 8; i++) {
				if (buf[i] == ' ') {
					i++;
				}
				else {
					j = i;
					comNumarr[i] = buf[i] - '0';

					for (j = i - 2; j < 5; j++) {
						comNumarr[i] = comNumarr[i] * 10;
					}
					comNum += comNumarr[i];
				}
			}

			j = 0;
			for (int i = 30; i < 35; i++) {
				if (buf[i] == ' ') {
					i++;
				}
				if (buf[i] > '0') {
					invarr[j] = buf[i] - '0';
					j++;
				}
			}
			n = j;
			for (int k = 0; k < n; k++) {
				for (int i = 1; i < j; i++) {
					invarr[k] = invarr[k] * 10;
					j--;
				}
				inv += invarr[k];
			}

			newnode->componentNum = comNum;
			comAmount(search(item, comNum, fp2), inv * -1, fp2);
			break;

		case 'P':  //��� �ý��� ���
			printCom(item, fp2);
			break;

		case 'X':  //���α׷� ����
			exit(1);
			break;

		}
	}

}