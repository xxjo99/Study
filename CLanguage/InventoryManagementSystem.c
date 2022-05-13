#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>
#include <string.h>
#include <malloc.h>

FILE* fp1, * fp2;

// 노드 정의
typedef struct node* node_ptr;
typedef struct node {
	node_ptr left;
	node_ptr right;
	int componentNum; // 컴포넌트 번호
	char name[21]; // 컴포넌트 이름
	int stock; // 재고량
	int re_order; // 재주문수준
} node;

// 컴포넌트 추가
void add_Component(node_ptr* rootNode, node_ptr addComponent, FILE* fp2) {
	node_ptr parentNode = NULL; // 부모노드
	node_ptr curNode = *rootNode; // 현재노드 
	int comNum; //컴포넌트 번호 저장

	// 컴포넌트 번호의 범위가 초과했을경우
	if (addComponent->componentNum < 100001 || addComponent->componentNum > 999999) {
		fprintf_s(fp2, "%d  컴포넌트 번호 에러(범위가 맞지않음, N) \n", addComponent->componentNum);
		return;
	}

	// 같은 컴포넌트가 존재하는지 확인
	while (curNode != NULL) {

		// 존재한다면
		if (addComponent->componentNum == curNode->componentNum) {
			comNum = curNode->componentNum;
			fprintf_s(fp2, "%d  컴포넌트 번호 중복, N\n", comNum);
			return;
		}
		// 그렇지않다면 curNode = parentNode (루트노드가 된다)
		parentNode = curNode;

		// curNode가 newComponent(새로운 컴포넌트)보다 작다면
		if (addComponent->componentNum > curNode->componentNum) {
			curNode = curNode->right;
		}
		// curNode가 newComponent보다 크다면
		else if (addComponent->componentNum < curNode->componentNum) {
			curNode = curNode->left;
		}
	}

	// 부모노드와 연결
	// 부모노드가 없다면
	if (parentNode == NULL) {
		*rootNode = addComponent;
	}
	// newComponent의 component번호가 parentNode의 component보다 크다면
	else if (addComponent->componentNum > parentNode->componentNum) {
		parentNode->right = addComponent;
	}
	// 그외
	else {
		parentNode->left = addComponent;
	}

}

// 컴포넌트 삭제
void del_Component(node_ptr* rootNode, int delComponent, FILE* fp2) {
	node_ptr delComNum = *rootNode; // 삭제할 컴포넌트의 노드 저장
	node_ptr parentNode = NULL; // comNum 부모노드
	node_ptr childNode = NULL; // comNum 자식노드

	// 서브트리의 최소값 탐색할 노드
	node_ptr minChild;
	node_ptr minParent;

	// 삭제할 componentNum을 갖는 노드 탐색(BST).
	while (delComNum != NULL && delComNum->componentNum != delComponent) {
		parentNode = delComNum;

		// componentNum이 부모노드의 componentNum보다 크다면
		if (delComponent > parentNode->componentNum) {
			delComNum = parentNode->right;
		}
		// 그렇지않다면
		else if (delComponent < parentNode->componentNum) {
			delComNum = parentNode->left;
		}
	}

	// 만약 delComNum이 NULL이라면 (삭제할 컴포넌트 존재X)
	if (delComNum == NULL) {
		fprintf_s(fp2, "%d 삭제할 컴포넌트가 없음, D\n", delComponent);
		return;
	}

	// delComNum의 자식노드(childNode)가 없을경우
	if (delComNum->left == NULL && delComNum->right == NULL) {
		// 만약 부모 노드가 NULL이 아니라면
		if (parentNode != NULL) {
			if (parentNode->left == delComNum) {
				parentNode->left = NULL;
			}
			else {
				parentNode->right = NULL;
			}
		}
		else { // 그렇지 않다면, 삭제할 노드 = 루트노드
			*rootNode = NULL;
		}
	}

	// delComNum의 서브트리가 하나일경우
	else if ((delComNum->left == NULL) || (delComNum->right == NULL)) {

		if (delComNum->left != NULL) {
			childNode = delComNum->left;
		}
		else {
			childNode = delComNum->right;
		}

		//부모노드가 NULL이 아닐경우 delComNum의 부모노드에 delComNum의 자식노드를 연결
		if (parentNode != NULL) { // delComNum가 왼쪽에 존재
			if (parentNode->left == delComNum) {
				parentNode->left = childNode;
			}
			else { // delComNum가 오른쪽에 존재
				parentNode->right = childNode;
			}
		}
		else { // 부모 노드가 NULL일경우 rootNode = childNode
			*rootNode = childNode;
		}
	}

	//delComNum의 서브트리가 두개일경우
	else {

		// 오른쪽 서브트리의 가장 작은 값 탐색
		minParent = delComNum;
		minChild = delComNum->right;
		while (minChild->left != NULL) {
			minParent = minChild;
			minChild = minChild->left;
		}

		// minParent의 left가 minChild와 같을경우
		if (minParent->left == minChild) {
			minParent->left = minChild->right;
		}
		// 그렇지않을경우
		else {
			minParent->right = minChild->right;
		}

		delComNum->componentNum = minChild->componentNum;
		delComNum = minChild;
	}

	free(delComNum);
}

// 컴포넌트의 재고량 체크
void comAmount(node_ptr item, int inventory, FILE* fp2) {
	if (item) {
		// 재고량이 0보다 작을경우
		if (item->stock + inventory < 0) {
			fprintf_s(fp2, "%d 재고량이 충분하지 않음\n", item);
			return;
		}
		item->stock = item->stock + inventory;
	}
}

// 출력
void printCom(node_ptr rootNode, FILE* fp2) {
	if (rootNode != NULL) {

		printCom(rootNode->left, fp2);
		fprintf_s(fp2, "%d  %s  %d  %d     ", rootNode->componentNum, rootNode->name, rootNode->stock, rootNode->re_order);

		// 재고량이 재주문 수준보다 낮을경우
		if (rootNode->stock < rootNode->re_order) {
			fprintf_s(fp2, "*재주문 필요*");
		}
		fprintf_s(fp2, "\n");

		printCom(rootNode->right, fp2);
	}
}

// componentNum탐색
node_ptr search(node_ptr rootNode, int componentNum, FILE* fp2) {

	// root가 NULL이 아닐경우 반복
	while (rootNode != NULL) {

		// 원하는 componentNum을 찾았을 경우
		if (componentNum == rootNode->componentNum) {
			return rootNode;
		}
		// 찾는 componentNum이 루트의 componentNum보다 작을경우
		else if (componentNum < rootNode->componentNum) {
			rootNode = rootNode->left; // 왼쪽 서브트리로 이동
		}
		// 찾는 componentNum이 루트의 componentNum보다 클경우
		else if ((componentNum > rootNode->componentNum)) {
			rootNode = rootNode->right; // 오른쪽 서브트리로 이동
		}
	}

	// 컴포넌트 번호가 없을경우
	fprintf_s(fp2, "%d   컴포넌트 번호 에러\n", componentNum);
	return NULL;
}

int main()
{
	node_ptr item = NULL;
	node_ptr newnode = NULL;
	int* num;

	int comNum, inv, reorder; // 컴포넌트번호, 재고량, 재주문수준

	int comNumarr[10] = { 0, }; // component번호 저장
	char comNamearr[20] = { 0 }; //component이름저장
	int invarr[3] = { 0, }; // inventory 저장
	int reorderarr[3] = { 0, }; // reorder 저장
	char data; // 알파벳 저장
	char buf[50] = { 0, };  // 한줄씩 저장해서 읽을 배열

	fp1 = fopen("input.txt", "r");
	fp2 = fopen("output.txt", "w");

	while (!feof(fp1)) {

		// 새로운 노드 할당, 초기화
		newnode = malloc(sizeof(node));
		newnode->left = NULL;
		newnode->right = NULL;
		fgets(buf, 50, fp1);
		data = buf[0];
		comNum = 0, inv = 0, reorder = 0;

		// data의 값을 읽고 명령어 판단
		switch (data) {
		case 'N':  //컴포넌트 추가 
			// 3~8열 컴포넌트 번호
			for (int i = 2; i < 8; i++) {
				// 읽은 문자가 비었을경우 넘김
				if (buf[i] == ' ') {
					i++;
				}
				// 그렇지 않을경우
				else {
					comNumarr[i] = buf[i] - '0';

					for (int j = i - 2; j < 5; j++) {
						comNumarr[i] = comNumarr[i] * 10;
					}

					comNum += comNumarr[i];
				}
			}

			int j = 0;
			// 10~29열 컴포넌트 이름(설명)
			for (int i = 9; i < 28; i++) {
				comNamearr[j] = buf[i];
				j++;
			}

			j = 0;
			// 31~35열 초기 재고량 혹은 추가/삭제될 양
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

			// 41~45 재주문 수준
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

			// 모두 읽고 fp2에 쓰기
			newnode->componentNum = comNum;
			strcpy_s(newnode->name, 20, comNamearr);
			newnode->stock = inv;
			newnode->re_order = reorder;
			add_Component(&item, newnode, fp2);
			break;

		case 'D':  //컴포넌트 삭제 (번호만 확인하면 됨)
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

		case 'A':  //재고량 추가 (번호와 개수 확인)
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

		case 'R': //재고량 제거 (번호와 개수 확인)
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

		case 'P':  //목록 시스템 출력
			printCom(item, fp2);
			break;

		case 'X':  //프로그램 끝냄
			exit(1);
			break;

		}
	}

}