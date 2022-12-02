package org.example;

public class Node {
    public Object object;
    public Node next = null;

    public Node(Object object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "Node{" +
                "object=" + object +
                ", next=" + next +
                '}';
    }
}
