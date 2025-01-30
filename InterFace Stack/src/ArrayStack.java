import java.util.EmptyStackException;

public class ArrayStack<E> implements Stack<E> {
    private E[] stack;
    private int top;
    private int capacity;

    @SuppressWarnings("unchecked")
    public ArrayStack(int capacity) {
        this.capacity = capacity;
        stack = (E[]) new Object[capacity];
        this.top = -1;

    }
    private E[] array;

    @Override
    public void push(E element) {
        if (top == capacity - 1) {
            throw new
                    StackOverflowException("Stack Overflow: Cannot push" + element +
                    " stack is full");
        }
        stack[++top] = element;

    }

    @Override
    public E pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new
                    StackUnderflowException("Stack Underflow: Cannot pop, empty stack");
        }
        E element = stack[top--]= null;
        return element;
    }

    @Override
    public E peek() throws EmptyStackException {
        if (isEmpty()) {
            throw new
                    StackUnderflowException("Stack Underflow: Cannot peek, empty stack");
        }
        return stack[top];
    }

    @Override
    public boolean isEmpty() {

        return top == -1;
    }

    @Override
    public int size() {
        return top + 1;
    }
}
