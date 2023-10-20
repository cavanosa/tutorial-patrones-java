package iterator;

import java.util.Iterator;

public class ListNode<T> implements Iterable<Node<T>> {

    private Node<T> head, tail;
    private int size, position;

    public ListNode() {
        size = position = 0;
    }

    public ListNode(Node<T> node) {
        this.head = node;
        this.tail = node;
        position = 0;
        size = 1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addEmpty(T value) {
        Node<T> node = new Node<>(value);
        this.head = node;
        this.tail = node;
        size = 1;
    }

    public void addInit(T value) {
        if (isEmpty()) {
            addEmpty(value);
            return;
        }
        Node<T> node = new Node<>(value);
        node.setNext(head);
        head = node;
        size++;
    }

    public void addEnd(T value) {
        if (isEmpty()) {
            addEmpty(value);
            return;
        }
        Node<T> node = new Node<>(value);
        tail.setNext(node);
        tail = node;
        size++;
    }

    private Node<T> get(int pos) {
        if (pos > size || pos < 0 || isEmpty())
            return null;
        int count = 0;
        Node<T> node = head;
        while (count < pos) {
            node = node.getNext();
            count++;
        }
        return node;
    }


    @Override
    public Iterator<Node<T>> iterator() {
        Iterator<Node<T>> iterator = new Iterator<Node<T>>() {
            @Override
            public boolean hasNext() {
                if (position < size)
                    return true;
                return false;
            }

            @Override
            public Node<T> next() {
                Node<T> next = get(position);
                position++;
                return next;
            }
        };
        return iterator;
    }
}
