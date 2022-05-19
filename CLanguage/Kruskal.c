#include <stdio.h>

#define MAX_VERTICES 100
#define INF 1000
#define MAX_ELEMENT 100

#define TRUE 1
#define FALSE 0

char* strArr[5] = { "울산", "상주", "대전", "이천", "서울" };
int parent[MAX_VERTICES];
int num[MAX_VERTICES];

typedef struct
{
    int key;
    int u;
    int v;
} element;

typedef struct
{
    element heap[MAX_ELEMENT];
    int heap_size;
} HeapType;


void init(HeapType* h)
{
    h->heap_size = 0;
}

void set_init(int n)
{
    for (int i = 0; i < n; i++)
    {
        parent[i] = -1;
        num[i] = 1;
    }
}

int is_empty(HeapType* h)
{
    if (h->heap_size == 0)
        return TRUE;
    else
        return FALSE;
}

void set_union(int s1, int s2)
{
    if (num[s1] < num[s2])
    {
        parent[s1] = s2;
        num[s2] += num[s1];
    }
    else
    {
        parent[s2] = s1;
        num[s1] += num[s2];
    }
}

int set_find(int vertex)
{
    int p, s, i = -1;

    for (i = vertex; (p = parent[i]) >= 0; i = p);

    s = i;
    for (i = vertex; (p = parent[i]) >= 0; i = p) parent[i] = s;

    return s;
}

void insert_min_heap(HeapType* h, element item)
{
    int i = ++(h->heap_size);

    while ((i != 1) && (item.key < h->heap[i / 2].key))
    {
        h->heap[i] = h->heap[i / 2];
        i /= 2;
    }
    h->heap[i] = item;
}

void insert_heap_edge(HeapType* h, int u, int v, int weight)
{
    element e;
    e.u = u;
    e.v = v;
    e.key = weight;
    insert_min_heap(h, e);
}

element delete_min_heap(HeapType* h)
{
    int parent, child;
    element item, temp;

    item = h->heap[1];
    temp = h->heap[(h->heap_size)--];

    parent = 1;
    child = 2;

    while (child <= h->heap_size)
    {
        if ((child < h->heap_size) && (h->heap[child].key) > h->heap[child + 1].key)
            child++;

        if (temp.key <= h->heap[child].key)
            break;

        h->heap[parent] = h->heap[child];
        parent = child;
        child *= 2;
    }

    h->heap[parent] = temp;
    return item;
}

void insert_all_edges(HeapType* h)
{
    insert_heap_edge(h, 1, 2, 160);
    insert_heap_edge(h, 1, 3, 230);
    insert_heap_edge(h, 1, 4, 320);
    insert_heap_edge(h, 2, 3, 100);
    insert_heap_edge(h, 2, 4, 150);
    insert_heap_edge(h, 3, 4, 140);
    insert_heap_edge(h, 4, 5, 60);
}

void kruskal(int n)
{
    int edge_accepted = 0;
    HeapType h;
    int uset, vset;
    element e;

    init(&h);
    insert_all_edges(&h);
    set_init(n);

    int result = 0;
    printf("<Kruskal's algorithm>\n\n");
    while (edge_accepted < (n - 1))
    {
        e = delete_min_heap(&h);
        uset = set_find(e.u);
        vset = set_find(e.v);

        if (uset != vset)
        {
            printf("(%s, %s) %d \n", strArr[e.u - 1], strArr[e.v - 1], e.key);
            edge_accepted++;
            set_union(uset, vset);
            result += e.key;
        }
    }

    printf("\n총 경로 비용 : %d\n", result);
}

void main()
{
    kruskal(5);
}
