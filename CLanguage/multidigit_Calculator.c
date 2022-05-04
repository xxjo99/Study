#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <ctype.h>

#define SIZE 60 // 스택 최대 사이즈

char stack[SIZE]; // 스택 정의
int top = -1; // top을 -1로 설정

// 스택을 초기화하는 함수
void init_stack() {
	top = -1;
}

// 스택이 비었는지 확인하는 함수
int isEmpty() {
	return (top <= -1);
}

// 데이터 push하는 함수
void push(char n) {
	if (top >= SIZE) {
		printf("\n가득찼습니다.");
		return;
	}
	stack[++top] = n;
}

// 데이터 pop하는 함수
char pop() {
	if (top <= -1) {
		printf("\n비어있습니다.");
		return -1;
	}
	return stack[top--];
}

// top을 반환하는 함수
char returnTop() {
	if (top <= -1) {
		return -1;
	}
	return stack[top];
}

// 연산자인지 확인하는 함수(+, -, *, /, %)
int isOperator(char n) {
	return (n == '+' || n == '-' || n == '*' || n == '/' || n == '%');
}

// 숫자인지 확인(0 ~ 9)
int isNum(char n) {
	return (n >= '0' && n <= '9');
}

// 연산자의 우선순위를 반환하는 함수( ( -> 0, + and - -> 1, *, /, % -> 2, ) -> 3 ))
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

// 중위연산자를 후위연산자로 변환하는 함수
int postfix(char* infix, char* postfix) { // postf : 중위연산자가 들어있는 문자열, infix : 후위연산자가 들어갈문자열
	char* c = infix; // 중위연산자로 설정

	init_stack(); // 스택 초기화

	// $가 나올때까지 반복
	while (*c != '$') {

		// 숫자일경우
		if (isNum(*c)) {
			do {
				*postfix++ = *c++;
			} while (isNum(*c)); // 다음문자도 숫자일경우
			*postfix++ = ' '; // 띄어쓰기
		}

		// ( 라면 스택에 push
		else if (*c == '(') {
			push(*c);
			c++;
		}

		// )라면 ( 가 나올때까지 pop
		else if (*c == ')') {
			while (returnTop() != '(') {
				*postfix++ = pop();
				*postfix++ = ' ';
			}
			pop();
			c++;
		}

		// 연산자의 경우 (+, - , *, %, /)
		else if (isOperator(*c)) {

			if (isEmpty()) { // 비어있다[면 push
				push(*c);
				c++;
			}

			else { // 데이터가 있다면

				if (priority(*c) > priority(returnTop())) { // top의 우선순위보다 연산자 우선순위가 높다면 push
					push(*c);
					c++;
				}

				// 우선순위가 같거나 낮다면 pop
				else {
					*postfix++ = pop();
					*postfix++ = ' ';
					push(*c);
					c++;
				}

			}
		}

		// 그 외의 문자일경우
		else {
			printf("문자를 잘못 입력했습니다.\n");
			return 0;
		}

	}

	// 남아있는 데이터 제거
	while (!isEmpty()) {
		*postfix++ = pop();
		*postfix++ = ' ';
	}

	// \0 저장(쓰레기값 출력이 안되기위해)
	*postfix = '\0';
	return 1;
}

/*---------------- 후위연산자 변경후 계산 ------------------------*/

int evalStack[SIZE]; // 계산을 위한 stack
int evalTop = -1; // 계산을 위한 top변수
int evalCheck = 0; // chk를 통해 자리수 판단
int evalPop() { // 계산을 위한 pop함수
	return (evalStack[evalTop--]);
}

// 계산을 위한 push함수
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
		char inf[60]; // 중위연산자가 들어갈 배열
		char postf[60]; // 후위연산자가 들어갈 배열
		char* end = "END-OF-INPUT";

		printf("입력스트링 (마지막에 $를 입력해주세요.) : ");
		scanf("%s", inf);

		// check가 end와 같다면 종료
		int check = strcmp(inf, end);
		if (check == 0) {
			exit(1);
		}

		int result = postfix(inf, postf);
		if (result) {
			printf("postfix 형태 : ");
			printf("%s\n", postf);

			// 후위표기법 계산
			char ch; // postf의 원소를 하나씩 가져와 저장하는 변수
			int i = 0, op1, op2;
			while ((ch = postf[i++]) != '\0') { // \0이 아닐때까지 반복
				if (isdigit(ch)) { // 숫자라면
					evalPush(ch - '0'); // char에서 int로 변환후 저장
				}
				else if (ch == ' ') { // 띄어쓰기
					evalCheck = 0; // evalCheck를 0으로 초기화
				}
				else // 연산자라면
				{
					evalCheck = 0; // 0으로 초기화
					// 두번 제거
					op2 = evalPop();
					op1 = evalPop();
					// 연산자를 확인후 계산
					switch (ch)
					{
					case '+': evalPush(op1 + op2); break;
					case '-': evalPush(op1 - op2); break;
					case '*': evalPush(op1 * op2); break;
					case '/': evalPush(op1 / op2); break;
					case '%': evalPush(op1 % op2); break;
					default:
						printf("오류\n");
						return 0;
					}
				}
			}

			printf("계산결과: %d\n", evalStack[evalTop]);

		}

	}

	return 0;
}