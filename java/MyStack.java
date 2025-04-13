import java.util.NoSuchElementException;

public class MyStack<T extends Comparable<T>> {
    private final MyList<T> list;

    public MyStack() {
        this.list = new MyArrayList<>();
    }

    public void push(T item) {
        list.addLast(item);
    }

    public T pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        return list.removeLast();
    }

    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        return list.getLast();
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public int size() {
        return list.size();
    }
}