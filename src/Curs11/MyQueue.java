package Curs11;

public interface MyQueue<T> {

    public void enqueue(T e);
    public void dequeue();
    public boolean isEmpty();
    public T getElement();

}
