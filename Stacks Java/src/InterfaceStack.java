public interface InterfaceStack<T> {
    void push(T valor);
    void staticStack(int size);
    void clear();
    T pop();

    boolean isEmpty();
    boolean isFull();
}
