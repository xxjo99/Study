#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>
#include <string.h>
#include <stdlib.h>

#define SIZE 100

// 반환할 구조체
typedef enum 
{
	lparen, rparen, plus, minus, times, divide, mod, eos, operand
} precedence;
typedef precedence element;

precedence stack[SIZE];
int top = -1;

// 우선순위 l -> r -> +,- -> *,/,% -> " "
static int isp[] = { 0, 19, 12, 12, 13, 13, 13, 0 }; 
static int icp[] = { 20, 19, 12, 12, 13, 13, 13, 0 };
char iexpr[100];
char pexpr[100];

// 꽉찼을시 종료
void stack_full()
{
	exit(1);
}

// 비었을시 종료
element stack_empty()
{
	exit(1);
}

// 삽입
void push(int* top, element item)
{
	if (*top >= SIZE - 1) {
		return stack_full();
	}
	stack[++*top] = item;
}

// 삭제
element pop(int* top)
{
	if (*top == -1) {
		return stack_empty();
	}
	return stack[(*top)--];
}

// operand or operator 확인 후 반환
precedence get_token(char* symbol, int* n)
{
	*symbol = iexpr[(*n)++];
	switch (*symbol) {
		case '(': return lparen;
		case ')': return rparen;
		case '+': return plus;
		case '-': return minus;
		case '/': return divide;
		case '*': return times;
		case '%': return mod;
		case '\0': return eos;
		default: return operand;
	}
}

// token에 맞는 operand or operator 출력
void print_token(precedence token)
{
	static int index = 0;
	char c;

	switch (token) {
	case plus: c = '+'; break;
	case minus: c = '-'; break;
	case divide: c = '/'; break;
	case times: c = '*'; break;
	case mod: c = '%'; break;
	case eos: c = '\0'; break;
	default: c = token;
	}

	pexpr[index++] = c;
}

// 변환
void infix_to_postfix(void)
{
	char symbol;
	precedence token;
	int n = 0, top = 0;
	stack[top] = eos;

	for (token = get_token(&symbol, &n); token != eos; token = get_token(&symbol, &n)) {
		if (token == operand) { // 피연산자일경우
			print_token(symbol);
		}
		else if (token == rparen) { // )일경우
			// (나올때까지 token을 pop & 출력
			while (stack[top] != lparen) {
				print_token(pop(&top));
			}
			pop(&top); // (제거
		}
		else {
			while (isp[stack[top]] >= icp[token]) {
				print_token(pop(&top));
			}
			push(&top, token);
		}
	}

	// 끝날때까지
	while ((token = pop(&top)) != eos) {
		print_token(token);
	}
	print_token(eos);

	strcpy(iexpr, pexpr);
	puts(iexpr);
}

// 계산
int eval(void)
{
	precedence token;
	char symbol;
	int op1, op2, n = 0, top = -1;
	token = get_token(&symbol, &n);
	while (token != eos) {
		if (token == operand) {
			push(&top, symbol - '0');
		}
		else {			
			op2 = pop(&top);
			op1 = pop(&top);
			switch (token) {
				case plus: push(&top, op1 + op2); break;
				case minus: push(&top, op1 - op2); break;
				case times: push(&top, op1 * op2); break;
				case divide:push(&top, op1 / op2); break;
				case mod: push(&top, op1 % op2); break;
			}
		}
		token = get_token(&symbol, &n);
	}
	return pop(&top);
}

int main(void)
{
	printf("중위계산식 : ");
	scanf("%s", iexpr);
	printf("후위계산식 : ");
	infix_to_postfix();
	printf("결과 : %d\n", eval());
	return 0;
}