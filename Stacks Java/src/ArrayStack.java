public abstract class ArrayStack<T> implements InterfaceStack<T>{
    protected T[] stack;
    protected int top;
    @Override
    public void staticStack(int tamanho) {
        stack = (T[]) new Object[tamanho];
        int indice = -1;
    }
    @Override
    public void push(T valor) {
        if (top == stack.length - 1) {
            System.out.println("Pilha cheia");
            return;

        }
        stack[++top] = valor;
        System.out.println("Elemento " + valor + " inserido na posição " + top);
    }
    @Override
    public T pop() {
        if (top == -1) {
            System.out.println("Pilha vazia");
            return null;
        }
        T valor = stack[top];
        stack[top] = null;
        top--;
        System.out.println("Elemento " + valor + " removido da posição " + (top + 1));
        return valor;

    }
    @Override
    public void clear() {
        if (top == -1){
            System.out.println("A pilha já está vazia");
            return;
        }
        top = -1;
        System.out.println("Pilha esvaziada");

    }
    @Override
    public boolean isEmpty() {
        return top == -1;
    }
    @Override
    public boolean isFull() {
        return top == stack.length - 1;
    }
}
