package test;

public class LinkedListTest<T> {

    public Node head;
    public Node tail;

    public void addFirstElement(T str){
       Node<T> newNode = new Node<T>(str);
       if(head == null){
           head = newNode;
           tail = newNode;
       }else{
           tail.next = newNode;
           tail = newNode;
       }
    }




    class Node<T>{

        T str;
        Node<T> next;

        public Node(T str){
            this.str = str;
            this.next = null;
        }


    }



}
