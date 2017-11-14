package Curs11;

public class QueueCircular implements MyQueue<Integer> {
    private int capacity;
    private int front;
    private int end;
    private int[] elements;

    public QueueCircular() {
        this.capacity = 10;
        this.front = -1;
        this.end = -1;
        elements = new int[capacity];
    }

    public boolean isEmpty(){
        return this.front == -1;
    }

    public Integer getElement(){
        if(this.front != -1) return this.elements[this.front];
        else throw new IllegalStateException("Queue is empty");
    }

    public void dequeue(){
        if(this.front != -1){
            int elemSters = this.elements[this.front];
            if(this.front == this.end){
                this.front = -1;
                this.end = -1;
            } else if(this.front == this.capacity - 1) {
                this.front = 0;
            } else {
//                elements[this.front] = 0;
                this.front ++;
            }
//            return elemSters;
        }
//        return Integer.MIN_VALUE;
    }

    public void enqueue(Integer e){
        if(this.front == -1){
            this.elements[0] = e;
            this.front = 0;
            this.end = 0;
//            return this.elements[0];
        } else if((this.front == 0 && this.end == capacity-1) || this.end == this.front-1){
            int[] elemNou = new int[capacity*2];
            for(int i=0;i<this.capacity;i++){
                elemNou[i] = this.elements[(this.front+1)%capacity];
            }

            this.elements = elemNou;
            this.front = 0;
            this.end = capacity-1;
            this.capacity *= 2;
        }

        if(this.end != this.capacity-1){
            this.elements[this.end+1] = e;
            this.end++;
        } else {
            this.elements[0] = e;
            this.end = 0;
        }
//        return e;
    }

}
