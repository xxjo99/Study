#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>
#include <string.h>
#include <stdlib.h>

#define STUDENT_ID 500 // �л�ID 2000~2499 (500��)
#define COURSE_ID 35 // �ڽ�ID 100~134 (35��)

int studentID, courseNum;   // �л�ID, �ڽ�
char instr[24]; // in���Ͽ��� �о�� ���ڿ� ����
char input;		// in���Ͽ��� �о�� A or D
FILE *fp1, *fp2; // ���� ���� ������

// ����ü ����
typedef struct enroll_s* node_ptr;
typedef struct enroll_s {
	int stdnum;  // �л�ID
	int course_num;	// �ڽ�ID
	node_ptr left;
	node_ptr right;
} enroll_s;

// ���������� ��� �л����� ID�� ����
node_ptr course[COURSE_ID];
// �ش� �л�ID�� ��� COURSE_ID ����
node_ptr students[STUDENT_ID];

/*
return 0 : ����
return 1 : �ߺ����
return 2 : �̵��
return 3 : ��ȿ���� �ʴ� �ڽ�ID
return 4 : ��ȿ���� �ʴ� �л�ID
return 5 : AȤ�� D�� �ƴ�
return 6 : ERR�� �� ���� �ʱ�ȭ
*/

// ����
int insert() {
	node_ptr new_node, pre_node; // ���ο���, �����
	int si, cn, temp; // cn : �ڽ���ȣ ũ��, si: �л�id ũ��
	si = studentID - 2000; // studentid : 0~499
	cn = courseNum - 100; // coursenum : 0~34

	new_node = malloc(sizeof(enroll_s));
	new_node->stdnum = studentID; // �л�id ����
	new_node->course_num = courseNum; // �ڽ���ȣ ����
	new_node->left = NULL;
	new_node->right = NULL;

	// students ���尪�� 0�ϰ�� newnode ���� (�ش� �л��� ��� ����)
	if (students[si] == 0) {
		students[si] = new_node;
	} 
	// ���ο� �л��� �� �л��� �������
	else if (students[si]->course_num == new_node->course_num) {
		return 1;
	}
	// �׿�
	else {
		pre_node = students[si];   // �� ��忡 newnode ����
		while (1) {
			//�ǳ��� ����
			if (pre_node->left == NULL) {
				new_node->left = NULL;
				pre_node->left = new_node;
				break;
			}
			// ���ο� studentId�� ���� studentId���� ������� ���ο� ��带 �� ���̿� ����
			else if ((new_node->stdnum) < (pre_node->left->stdnum)) {
				new_node->left = pre_node->left;
				pre_node->left = new_node;
				break;
			}
			// ���ο� courseId�� ���� courseId�� �������
			else if (new_node->course_num == pre_node->left->course_num) {
				return 1;
			}
			// �������� �̵�
			else {
				pre_node = pre_node->left;
			}
		}
	}

	// course ���尪�� 0�̸� newnode���� (���� ������ �������) 
	if (course[cn] == 0) {
		course[cn] = new_node;
	}
	// �׿�
	else {
		pre_node = course[cn]; // �� ��忡 newnode����

		while (1) {
			// �ǿ����ʿ� ���ο� ��� ����
			if (pre_node->right == NULL) {
				pre_node->right = new_node;
				new_node->right = NULL;
				break;
			}
			//���ο� studentId�� ���� studentId���� ������� ���ο� ��带 �� ���̿� ����
			else if (pre_node->right->stdnum > new_node->stdnum){
				new_node->right = pre_node->right;
				pre_node->right = new_node;
				break;
			}
			pre_node = pre_node->right; //���������� �̵�
		}

	}

	return 0;
}

// ����
int del() {
	int si, cn;
	node_ptr delnode, prenode;
	si = studentID - 2000;
	cn = courseNum - 100;
	prenode = students[si];

	// students ���尪�� 0�ϰ��
	if (students[si] == 0) {
		return 2;
	}

	// students ���尪�� studentID�� �������
	if (students[si]->stdnum == studentID) {
		students[si] = students[si]->right;
		delnode = prenode; // ������� = �����
	}
	// students���尪�� studentID���� Ŭ���
	else if ((students[si]->stdnum) > studentID) {
		return 2;
	}
	// �׿�
	else {
		delnode = prenode->left;
		// NULL�϶�����
		while (delnode) {
			//delnode�� ������ �й��� ������
			if (delnode->course_num == courseNum) {
				prenode->left = delnode->left;
			}
			else {
				prenode = delnode;
				delnode = delnode->left;
			}
		}
		return 2;
	}

	prenode = course[cn];
	// course���� 0�ϰ��
	if (course[cn] == 0) {
		return 2;
	}

	// course�� studentID�� �������
	if (course[cn]->stdnum == studentID) {
		course[cn] = course[cn]->right;
		delnode = prenode; // ���� ���� �����
	}
	// course_num�� ���� courseNum ���� Ŭ���
	else if ((course[cn]->course_num) > courseNum) {
		return 2;
	}
	// �׿�
	else {
		delnode = prenode->right;
		while (delnode) { 
			if (delnode->stdnum == studentID) {
				prenode->right = delnode->right;
			}
			else {
				prenode = delnode;
				delnode = delnode->left;
			}
		}
	}

	free(delnode);
	return 0;
}

// ����
int return_Error1 = 0; // �ߺ����
int return_Error2 = 0; // �̵��
int return_Error3 = 0; // ��ȿ���� �ʴ� �ڽ�ID
int return_Error4 = 0; // ��ȿ���� �ʴ� �л�ID
int return_Error5 = 0; // AȤ�� D�� �ƴ�
int _return_Error = 0; // ERR�� �� ���� �ʱ�ȭ

int return_Error(int ERR0) {
	switch (ERR0)
	{

	case 0: break;
	case 1: {
		return_Error1++;
		fprintf(fp2, "%d %d %c ", studentID, courseNum, input);
		fprintf(fp2, "\t ** �ߺ� ��� ** \n");
		break; 
	}
	case 2: {
		return_Error2++;
		fprintf(fp2, "%d %d %c ", studentID, courseNum, input);
		fprintf(fp2, "\t ** �̵�� ** \n");
		break;
	}
	case 3: {
		return_Error3++;
		fprintf(fp2, "%d %d %c ", studentID, courseNum, input);
		fprintf(fp2, "\t ** ��ȿ���� �ʴ� �ڽ� ID ** \n");
		break;
	}
	case 4: {
		return_Error4++;
		fprintf(fp2, "%d %d %c ", studentID, courseNum, input);
		fprintf(fp2, "\t ** ��ȿ���� �ʴ� �л� ID ** \n");
		break;
	}
	case 5: {
		return_Error5++;
		fprintf(fp2, "%d %d %c ", studentID, courseNum, input);
		fprintf(fp2, "\t ** ��A�� Ȥ�� ��D���� �ƴ� ** \n");
		break;
	}

	}
	return 0;
}

// studentID, courseNum�� �ùٸ� ������ Ȯ��
int validNum() {
	studentID = courseNum = 0;
	studentID = stdnumReturn(4, 8); //studentID�� 4~8��
	courseNum = courseReturn(15, 18); // courseNum�� 15~18��
	input = instr[24];  // A or D�� 25��

	// ��ȿ���� �ʴ� �ڽ� ID
	if ((courseNum < 100) || (courseNum >= 100 + COURSE_ID)) {
		return 3;
	}

	// ��ȿ���� �ʴ� �л� ID
	if ((studentID < 2001) || (studentID >= 2000 + STUDENT_ID)) {
		return 4;
	}

	// A or D�� �ƴҰ��
	if (input != 'A' && input != 'D') {
		return 5;
	}

	return 0;
}

// �ڸ���(3or4�ڸ�)�� ���� ����
int squr(int a, int b) {
	int c = 1, i;
	for (i = 0; i != b - 1; i++) {
		c = c * a;
	}
	return c;
}

// �ڽ�ID(���ڸ�) return
int courseReturn(int start, int end) {
	int t = 3; // 3�ڸ�
	int n, op, course = 0;

	// ���ڸ� char������ �޾� ���
	for (int i = start; i != end; i++) {
		n = instr[i] - '0';
		op = squr(10, t);
		t--;
		course = course + op * n;
		n = 0;
	}

	return course;
}

// �л�ID(���ڸ�) return
int stdnumReturn(int start, int end) {
	int t = 4;
	int n, op, stdnum = 0;  //�й��� 4�ڸ� �̹Ƿ� t=4

	for (int i = start; i != end; i++) {
		n = instr[i] - '0';
		op = squr(10, t);
		t--;
		stdnum = stdnum + op * n;
		n = 0;
	}

	return stdnum;
}

// ���
void print_list(node_ptr list, int n) {
	node_ptr a, b;
	int t, i = 0;

	a = list; // ����� ���
	b = list->right; // ���� ���

	while (1) {

		if (a->right != NULL) {
			// ����� ����� stdnum�� ������� stdnum���� Ŭ���
			if (a->stdnum > b->stdnum) {
				t = a->stdnum; // ����� ��� stdnum ����
				a->stdnum = b->stdnum; // �� stdnum ���ο� stdnum���� ����
				b->stdnum = t;  // ����� stdnum�� ������� stdnum����
				a->right = b;
			}
			// ����ҳ���� stdnum�� ������庸�� �۰� ������尡 ����Ű�� ���� NULL�� �ƴҰ�� �������� �̵�
			else if (a->stdnum < b->stdnum || b->right != NULL) {
				a = a->right;
				b = b->right;
			}
		}
		else break;
	}

	// 0�ϰ��
	if (n == 0) {
		for (; list; list = list->right) {
			fprintf(fp2, " %d", list->stdnum);  //id_num ���
		}
	}
	fprintf(fp2, "\n");
}

int main() {
	int line = 0; // ���� ���μ�
	int validReg = 0; // ��ȿ�� ���
	int d = 0; // ���
	int count = 0; // �ݺ�

	char* infilename = "input.txt";
	char* outfilename = "output.txt";

	char buf[50];

	// ���� �б⿡ �����������
	if ((fp1 = fopen(infilename, "r")) != NULL) {
		printf("�����б� ����\n");
	}
	// �׷����������
	else {
		printf("����\n");
		return 1;
	}

	// �ʱ�ȭ
	for (count = 0; count != STUDENT_ID; count++) {
		students[count] = NULL;
	}
	for (count = 0; count != COURSE_ID; count++) {
		course[count] = NULL;
	}

	fp2 = fopen(outfilename, "w");
	// in���Ͽ��� ���ڿ� �޾ƿ�
	while (fgets(buf, 30, fp1)) {
		line++; // ���μ� ����
		strcpy(instr, buf);
		_return_Error = validNum(); // �ùٸ� ������ Ȯ��

		// 0�ϰ�� ����
		if (_return_Error != 0) {
			return_Error(_return_Error);
			continue;
		}

		// A or D
		switch (input)
		{
		case 'A': {
			// ��ϵ��������
			if (insert())	return_Error(1);
			else validReg++; // ��ϵ������� validReg++
			break;
		}
		case 'D': {
			// ��ϵ����� �������
			if (del())	return_Error(2);
			// ��ϵ��������
			else {
				d++; // ��� ����
				fprintf(fp2, "%d %d %c ", studentID, courseNum, input); fprintf(fp2, "\t ** ���� �Ϸ� ** \n");
			}
			break;
		}

		}
	}

	// ����
	fprintf(fp2, "\n(1) ���� ����\n");
	fprintf(fp2, "�ߺ� ��� : %d\n", return_Error1);
	fprintf(fp2, "�̵�� : %d\n", return_Error2);
	fprintf(fp2, "��ȿ���� �ʴ� �ڽ� ID : %d\n", return_Error3);
	fprintf(fp2, "��ȿ���� �ʴ� �л� ID : %d\n", return_Error4);
	fprintf(fp2, "��A�� Ȥ�� ��D���� �ƴ� : %d\n", return_Error5);

	fprintf(fp2, "\n(2) Ŭ�� ���\n");
	for (count = 0; count < COURSE_ID; count++) {
		if (course[count] != NULL) {
			fprintf(fp2, "%d : ", course[count]->course_num);
			print_list(course[count], 0);
		}
	}

	fprintf(fp2, "\n(3) �Է¿� ���� ����\n");
	fprintf(fp2, "���� ���� ��: %d\n", line);
	fprintf(fp2, "��ȿ ��� ��: %d\n", validReg);
	fprintf(fp2, "��� ��: %d", d);

	fclose(fp1);
	fclose(fp2);
	return 0;
}