package com.infy.genericclass;

class GenericStack<E> {
	public final static int INITIAL_CAPACITY = 10;
	private E[] elements;
	private int size;

	// Construct a stack with the default initial capacity
	public GenericStack() {
		elements = (E[]) new Object[INITIAL_CAPACITY];
		size = -1;
	}

	// Push a new element into the top of the stack
	public void push(E value) {

		elements[++size] = value;
		// return elements[size++] = value;
	}

	// Return and remove the top element from the stack
	public E pop() {
		return elements[size--];
	}

	// Checks whether stack is empty or not
	public boolean isEmpty() {
		return (size == -1);
	}

	// Checks whether stack is full or not
	public boolean isFull() {
		return (size == INITIAL_CAPACITY - 1);
	}

}
