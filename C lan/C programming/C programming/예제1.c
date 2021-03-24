#include <stdio.h>
#include <stdlib.h>

typedef struct __list {
	struct __node* head;
	struct __node* tail;
} linked_list;

typedef struct __node {
	int data;
	struct __node* next;
} node;

void create_node(linked_list* l, int temp_data) {
	node* new_node = (node*)malloc(sizeof(node));
	new_node->data = temp_data;
	new_node->next = NULL;
	if (l->head == NULL && l->tail == NULL) {
		l->head = l->tail = new_node;
	}
	else {
		l->tail->next = new_node;
		l->tail = new_node;
	}
}

int main3() {
	linked_list* l = (linked_list*)malloc(sizeof(linked_list));
	l->head = NULL;
	l->tail = NULL;
}