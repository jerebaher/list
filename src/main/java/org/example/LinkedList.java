package org.example;

public class LinkedList {
    Node head = null;

    public void addStart(Object object){
        if (isEmpty()){
            head = new Node(object);
        }else {
            Node node = new Node(object);
            node.next = head;
            head = node;
        }
    }

    public void addEnd(Object object){
        if (isEmpty()){
            head = new Node(object);
        }else{
            Node pointer = head;
            while (pointer.next != null){
                pointer = pointer.next;
            }
            pointer.next = new Node(object);
        }
    }

    public void deleteNode(Object object){
        if (isEmpty()) return;
        if (head.object == object){
            head = head.next;
            return;
        }
        Node pointer = head;
        while (pointer.next != null){
            if (pointer.next.object != object){
                pointer = pointer.next;
            }else {
                pointer.next = pointer.next.next;
            }
        }
    }

    public void showList(){
        if (isEmpty()) {
            System.out.print("Empty list.");
        }else {
            Node pointer = head;
            while (pointer != null){
                System.out.println("\n"+pointer.object.toString());
                pointer = pointer.next;
            }
        }
    }

    public boolean isEmpty(){
        return head == null;
    }
}
