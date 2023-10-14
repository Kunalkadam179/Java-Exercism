import java.lang.reflect.Array;
import java.util.NoSuchElementException;

public class SimpleLinkedList<T> {
    private Item last;
    private int size;
    public SimpleLinkedList() {
    }
    public SimpleLinkedList(T[] values) {
        for (T item : values) {
            push(item);
        }
    }
    public void push(T input) {
        last = new Item(input, last);
        size++;
    }
    public T pop() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        T result = last.value;
        last = last.prev;
        size--;
        return result;
    }
    public int size() {
        return size;
    }
    public T[] asArray(Class<T> tClass) {
        T[] result = (T[]) Array.newInstance(tClass, size);
        for (int i = 0; i < result.length; i++) {
            result[i] = pop();
        }
        return result;
    }
    public void reverse() {
        SimpleLinkedList reverseList = new SimpleLinkedList();
        while (size > 0) {
            reverseList.push(pop());
        }
        last = reverseList.last;
        size = reverseList.size();
    }
    class Item {
        private T value;
        private Item prev;
        public Item(T value, Item prev) {
            this.value = value;
            this.prev = prev;
        }
    }
}