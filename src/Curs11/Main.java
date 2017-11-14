package Curs11;

public class Main {
    public static void main(String[] args) {
        QueueLinked<Integer> q = new QueueLinked<>();
        QueueLinked<String> q2 = new QueueLinked<>();
        q2.enqueue("a");
        q2.enqueue("c");
        q2.enqueue("b");
        System.out.println(q2.getElement());
        q2.dequeue();
        System.out.println(q2.getElement());
        q2.dequeue();
        System.out.println(q2.getElement());
        q2.dequeue();
        System.out.println(q2.getElement());
//        System.out.println(q.getElement());
//        q.enqueue(1);
//        System.out.println(q.getElement());
//        q.enqueue(2);
//        System.out.println(q.getElement());
//        q.enqueue(3);
//        System.out.println(q.getElement());
//        System.out.println("Now dequeue:");
//        q.dequeue();
//        System.out.println(q.getElement());
//        q.dequeue();
//        System.out.println(q.getElement());
////        q.dequeue();
//        System.out.println(q.getElement());
    }
}
