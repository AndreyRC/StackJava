public class Main {
    public static void main(String[] args) {
        ArrayStack<Integer> pilha = new ArrayStack<>() {};

        pilha.staticStack(5);

        System.out.println("A pilha está vazia? " + pilha.isEmpty());
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        pilha.push(40);
        pilha.push(50);

        pilha.push(60);

        System.out.println("A pilha está cheia? " + pilha.isFull());

        pilha.pop();
        pilha.pop();

        System.out.println("A pilha está cheia? " + pilha.isFull());

        pilha.clear();

        System.out.println("A pilha está vazia? " + pilha.isEmpty());
    }
}
