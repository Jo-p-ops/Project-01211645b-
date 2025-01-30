import java.util.EmptyStackException;

public interface Stack <E>{
    void push(E element);
    E pop() throws EmptyStackException;
    E peek() throws EmptyStackException;
    boolean isEmpty();
    int size();
}
class StackUnderflowException extends RuntimeException {
    public StackUnderflowException(String message) {
        super(message);
    }
}
class StackOverflowException extends RuntimeException {
    public StackOverflowException(String message) {
        super(message);
    }
}
