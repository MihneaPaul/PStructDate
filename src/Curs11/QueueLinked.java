package Curs11;

import Curs8_9.Node;

public class QueueLinked<T> implements MyQueue<T> {
    private Node<T> front; // primu care intra si primul sters
    private Node<T> back; // cel care intra in coada

    public void enqueue(T e){
        Node<T> nodNou = new Node<>();
        nodNou.elem = e;
        nodNou.urm = null;

        if(isEmpty()){
            this.front = nodNou;
            this.back = nodNou;
        } else {
            Node<T> nodCurent = this.front;
            while(nodCurent.urm != null){
                nodCurent = nodCurent.urm;
            }
            nodCurent.urm = nodNou;
            this.back = nodNou;
        }

    }

    public void dequeue(){
        this.front = this.front.urm;
    }

    public boolean isEmpty(){
        if(this.front == null) return true;
        else return false;
    }

    public T getElement(){
        if(this.front != null)
        return this.front.elem;
        else throw new IllegalStateException("Queue is empty");
    }

    public class Node<T>{
        public T elem;
        public Node <T> urm;
    }
}
