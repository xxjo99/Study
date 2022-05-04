#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define SIZE 100

struct element {
    char* data;
    struct element* next;
};
struct element* rear;

void init_queue(void)
{
    rear = NULL;
}

void enqueue(char* data)
{
    struct element* queue = (struct element*)malloc(sizeof(struct element));
    char* inputData = (char*)malloc(strlen(data) + 1);

    strcpy(inputData, data);
    queue->data = inputData;

    if (rear == NULL) {
        queue->next = queue;
    }
    else
    {
        queue->next = rear->next;
        rear->next = queue;
    }
    rear = queue;
}

int dequeue(char* name)
{
    struct element* ptr;
    char* cp;

    if (!rear) {
        printf("비어있음\n");
        return -1;
    }

    ptr = rear->next;
    cp = ptr->data;

    if (ptr == rear) {
        rear = NULL;
    }
    else {
        rear->next = ptr->next;
    }

    free(ptr);
    strcpy(name, cp);
    free(cp);
    return 0;
}

void print_queue(void)
{
    struct element* ptr, * head;

    if (!rear) {
        printf("비어있음\n");
        return;
    }

    head = ptr = rear->next;
    int i = 1;

    do {
        printf("%d. %s\n", i, ptr->data);
        ptr = ptr->next;
        i++;
    } while (ptr != head);
}

int main()
{
    char queue[SIZE];

    init_queue();

    while (1) {
        printf("1: 삽입 2: 삭제 3: 출력 4: 종료 : ");

        if (fgets(queue, SIZE, stdin) == NULL) {
            break;
        }

        if (queue[0] == '1') {
            printf("데이터 입력: ");

            if (fgets(queue, SIZE, stdin) == NULL) {
                break;
            }

            int len = strlen(queue);

            if (queue[len - 1] == '\n') {
                queue[len - 1] = '\0';
            }

            enqueue(queue);
        }
        else if (queue[0] == '2') {
            if (dequeue(queue) != -1) {
                printf("삭제된 데이터 :%s\n", queue);
            }
        }
        else if (queue[0] == '3') {
            print_queue();
        }
        else if (queue[0] == '4') {
            break;
        }
        else {
            printf("잘못된 입력\n");
        }
    }

    exit(0);
}