public class Main {
    public static void main(String[] args) {
        Stack<Integer>stack = new
                ArrayStack<>(5);
        try {
            stack.push(10);
            stack.push(20);
            stack.push(30);

            System.out.println("Stack size:" + stack.size());
            System.out.println("Top element:" + stack.peek());
            System.out.println("Popped element:" + stack.pop());
            System.out.println("Top element after pop:" + stack.pop());
            System.out.println("Is stack empty?:" + stack.isEmpty());

            stack.pop();
            stack.pop();

            stack.pop();
        }catch (StackOverflowException e){
            System.err.println(e.getMessage());
        }catch (StackUnderflowException e){
            System.err.println(e.getMessage());
        }
    }
}