#include <stdio.h>
#include <stdlib.h>

#define MAX_ELEMENT 200

typedef struct {
	int key;
} element;

typedef struct {
	element heap[MAX_ELEMENT];
	int heap_size;
} HeapType;

// 생성
HeapType* create() {
	return (HeapType*)malloc(sizeof(HeapType));
}
// 초기화
void init(HeapType* h) {
	h->heap_size = 0;
}

// 삽입
void insert_max_heap(HeapType* h, element item) {
	int i;
	i = ++(h->heap_size);

	while ((i != 1) && (item.key > h->heap[i / 2].key)) {
		h->heap[i] = h->heap[i / 2];
		i /= 2;
	}
	h->heap[i] = item;
}

// 삭제
element delete_max_heap(HeapType* h) {
	int parent, child;
	element item, temp;

	item = h->heap[1];
	temp = h->heap[(h->heap_size)--];
	parent = 1;
	child = 2;

	while (child <= h->heap_size) {

		if ((child < h->heap_size) && (h->heap[child].key) < h->heap[child + 1].key) {
			child++;
		}

		if (temp.key >= h->heap[child].key) break;

		h->heap[parent] = h->heap[child];
		parent = child;
		child *= 2;
	}

	h->heap[parent] = temp;
	return item;
}

int main(void) {
	// 힙 원소 생성
	element he1 = {10};
	element he2 = {5};
	element he3 = {30};
	element he4 = {25};
	element he5 = {20};
	element he6 = {3};

	element de4, de5, de6;
	HeapType* heap;

	// 생성&초기화
	heap = create();
	init(heap);

	// 삽입
	insert_max_heap(heap, he1);
	insert_max_heap(heap, he2);
	insert_max_heap(heap, he3);
	insert_max_heap(heap, he4);
	insert_max_heap(heap, he5);
	insert_max_heap(heap, he6);

	// 삭제
	for (int i = 0; i < 6; i++) {
		element deh = delete_max_heap(heap);
		if (i != 5) {
			printf("%d -> ", deh.key);
		}
		else {
			printf("%d", deh.key);
		}
	}

	free(heap);
	return 0;
}