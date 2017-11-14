package Curs11;

public interface Queue<T> {

    public void enqueue(T e);
    public void dequeue();
    public boolean isEmpty();
    public T getElement();

}
