#define _CRT_SECURE_NO_WARNINGS

#include<stdio.h>
#include<stdlib.h>
#include<malloc.h>

typedef struct node
{
	char data[20];
	struct node* next;
} Stack;

Stack* push(Stack* top)
{
	Stack* p;
	p = (Stack*)malloc(sizeof(Stack));
	if (p == NULL)
	{
		printf("비어있음");
	}
	else
	{
		printf("데이터 입력: ");
		scanf("%s", p->data);
		p->next = top;
		top = p;
	}
	return(top);
}

Stack* pop(Stack* top)
{
	Stack* p;
	if (top == NULL)
	{
		printf("비어있음\n");
	}
	else
	{
		printf("제거한 데이터: %s\n", top->data);
		top = top->next;
	}
	return(top);
}

void printStack(Stack* top)
{
	int i = 1;
	if (top == NULL)
	{
		printf("비어있음");
	}
	else
	{
		while (top != NULL)
		{
			printf("%d. %s\n", i, top->data);
			top = top->next;
			i++;
		}
	}
}

int main()
{
	Stack* top = NULL;
	int ch, x, c = 0;

	do
	{
		printf("1:삽입, 2:삭제, 3:출력 4:종료 : ");
		scanf("%d", &ch);
		switch (ch)
		{
		case 1:
			top = push(top);
			break;
		case 2:
			top = pop(top);
			break;
		case 3:
			printStack(top);
			break;
		case 4:
			printf("종료\n");
			exit(0);
		default:
			printf("잘못된 값\n");
			break;
		}
	} while (ch != 4);
}

