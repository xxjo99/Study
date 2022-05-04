#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <ctype.h>

#define SIZE 60 // ���� �ִ� ������

char stack[SIZE]; // ���� ����
int top = -1; // top�� -1�� ����

// ������ �ʱ�ȭ�ϴ� �Լ�
void init_stack() {
	top = -1;
}

// ������ ������� Ȯ���ϴ� �Լ�
int isEmpty() {
	return (top <= -1);
}

// ������ push�ϴ� �Լ�
void push(char n) {
	if (top >= SIZE) {
		printf("\n����á���ϴ�.");
		return;
	}
	stack[++top] = n;
}

// ������ pop�ϴ� �Լ�
char pop() {
	if (top <= -1) {
		printf("\n����ֽ��ϴ�.");
		return -1;
	}
	return stack[top--];
}

// top�� ��ȯ�ϴ� �Լ�
char returnTop() {
	if (top <= -1) {
		return -1;
	}
	return stack[top];
}

// ���������� Ȯ���ϴ� �Լ�(+, -, *, /, %)
int isOperator(char n) {
	return (n == '+' || n == '-' || n == '*' || n == '/' || n == '%');
}

// �������� Ȯ��(0 ~ 9)
int isNum(char n) {
	return (n >= '0' && n <= '9');
}

// �������� �켱������ ��ȯ�ϴ� �Լ�( ( -> 0, + and - -> 1, *, /, % -> 2, ) -> 3 ))
int priority(char n) {
	if (n == '(') {
		return 0;
	}
	if (n == '+' || n == '-') {
		return 1;
	}
	if (n == '*' || n == '/' || n == '%') {
		return 2;
	}
	if (n == ')') {
		return 3;
	}

	return -1;
}

// ���������ڸ� ���������ڷ� ��ȯ�ϴ� �Լ�
int postfix(char* infix, char* postfix) { // postf : ���������ڰ� ����ִ� ���ڿ�, infix : ���������ڰ� �����ڿ�
	char* c = infix; // ���������ڷ� ����

	init_stack(); // ���� �ʱ�ȭ

	// $�� ���ö����� �ݺ�
	while (*c != '$') {

		// �����ϰ��
		if (isNum(*c)) {
			do {
				*postfix++ = *c++;
			} while (isNum(*c)); // �������ڵ� �����ϰ��
			*postfix++ = ' '; // ����
		}

		// ( ��� ���ÿ� push
		else if (*c == '(') {
			push(*c);
			c++;
		}

		// )��� ( �� ���ö����� pop
		else if (*c == ')') {
			while (returnTop() != '(') {
				*postfix++ = pop();
				*postfix++ = ' ';
			}
			pop();
			c++;
		}

		// �������� ��� (+, - , *, %, /)
		else if (isOperator(*c)) {

			if (isEmpty()) { // ����ִ�[�� push
				push(*c);
				c++;
			}

			else { // �����Ͱ� �ִٸ�

				if (priority(*c) > priority(returnTop())) { // top�� �켱�������� ������ �켱������ ���ٸ� push
					push(*c);
					c++;
				}

				// �켱������ ���ų� ���ٸ� pop
				else {
					*postfix++ = pop();
					*postfix++ = ' ';
					push(*c);
					c++;
				}

			}
		}

		// �� ���� �����ϰ��
		else {
			printf("���ڸ� �߸� �Է��߽��ϴ�.\n");
			return 0;
		}

	}

	// �����ִ� ������ ����
	while (!isEmpty()) {
		*postfix++ = pop();
		*postfix++ = ' ';
	}

	// \0 ����(�����Ⱚ ����� �ȵǱ�����)
	*postfix = '\0';
	return 1;
}

/*---------------- ���������� ������ ��� ------------------------*/

int evalStack[SIZE]; // ����� ���� stack
int evalTop = -1; // ����� ���� top����
int evalCheck = 0; // chk�� ���� �ڸ��� �Ǵ�
int evalPop() { // ����� ���� pop�Լ�
	return (evalStack[evalTop--]);
}

// ����� ���� push�Լ�
int evalPush(int n) {

	if (evalCheck == 1) {
		int num;
		num = evalPop();
		evalStack[++evalTop] = n + 10 * num;
	}
	else if (evalCheck == 0) {
		evalStack[++evalTop] = n;
		evalCheck = 1;
	}
}

int main()
{
	while (1) {
		char inf[60]; // ���������ڰ� �� �迭
		char postf[60]; // ���������ڰ� �� �迭
		char* end = "END-OF-INPUT";

		printf("�Է½�Ʈ�� (�������� $�� �Է����ּ���.) : ");
		scanf("%s", inf);

		// check�� end�� ���ٸ� ����
		int check = strcmp(inf, end);
		if (check == 0) {
			exit(1);
		}

		int result = postfix(inf, postf);
		if (result) {
			printf("postfix ���� : ");
			printf("%s\n", postf);

			// ����ǥ��� ���
			char ch; // postf�� ���Ҹ� �ϳ��� ������ �����ϴ� ����
			int i = 0, op1, op2;
			while ((ch = postf[i++]) != '\0') { // \0�� �ƴҶ����� �ݺ�
				if (isdigit(ch)) { // ���ڶ��
					evalPush(ch - '0'); // char���� int�� ��ȯ�� ����
				}
				else if (ch == ' ') { // ����
					evalCheck = 0; // evalCheck�� 0���� �ʱ�ȭ
				}
				else // �����ڶ��
				{
					evalCheck = 0; // 0���� �ʱ�ȭ
					// �ι� ����
					op2 = evalPop();
					op1 = evalPop();
					// �����ڸ� Ȯ���� ���
					switch (ch)
					{
					case '+': evalPush(op1 + op2); break;
					case '-': evalPush(op1 - op2); break;
					case '*': evalPush(op1 * op2); break;
					case '/': evalPush(op1 / op2); break;
					case '%': evalPush(op1 % op2); break;
					default:
						printf("����\n");
						return 0;
					}
				}
			}

			printf("�����: %d\n", evalStack[evalTop]);

		}

	}

	return 0;
}