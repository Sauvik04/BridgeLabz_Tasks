class GenericNode<T> {
    T data;
    GenericNode<T> next;

    GenericNode(T data) {
        this.data = data;
        this.next = null;
    }
}

class GenericLinkedList<T extends Comparable<T>> {

    private GenericNode<T> head;
    private int size = 0;
    public void insertFirst(T data) {
        GenericNode<T> newNode = new GenericNode<>(data);
        newNode.next = head;
        head = newNode;
        size++;
    }
    public void append(T data) {
        GenericNode<T> newNode = new GenericNode<>(data);

        if (head == null) {
            head = newNode;
            size++;
            return;
        }

        GenericNode<T> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        size++;
    }
    public void insertAfter(T key, T data) {
        GenericNode<T> temp = head;

        while (temp != null) {
            if (temp.data.equals(key)) {
                GenericNode<T> newNode = new GenericNode<>(data);
                newNode.next = temp.next;
                temp.next = newNode;
                size++;
                return;
            }
            temp = temp.next;
        }
    }

    public void pop() {
        if (head == null) return;
        head = head.next;
        size--;
    }
    public void popLast() {
        if (head == null) return;

        if (head.next == null) {
            head = null;
            size--;
            return;
        }

        GenericNode<T> temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
        size--;
    }
    public boolean search(T key) {
        GenericNode<T> temp = head;

        while (temp != null) {
            if (temp.data.equals(key)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    public void delete(T key) {

        if (head == null) return;

        if (head.data.equals(key)) {
            head = head.next;
            size--;
            return;
        }

        GenericNode<T> temp = head;

        while (temp.next != null) {
            if (temp.next.data.equals(key)) {
                temp.next = temp.next.next;
                size--;
                return;
            }
            temp = temp.next;
        }
    }
    public void sortedInsert(T data) {
        GenericNode<T> newNode = new GenericNode<>(data);

        if (head == null || head.data.compareTo(data) > 0) {
            newNode.next = head;
            head = newNode;
            size++;
            return;
        }

        GenericNode<T> temp = head;

        while (temp.next != null && temp.next.data.compareTo(data) < 0) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    public void display() {
        GenericNode<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public int size() {
        return size;
    }
}

public class Day14Assignment1 {
    public static void main(String[] args) {
        GenericLinkedList<Integer> list = new GenericLinkedList<>();
        list.insertFirst(70);
        list.insertFirst(30);
        list.insertFirst(56);
        list.display();
        list.insertAfter(30, 40);
        list.display();
        System.out.println("Search 30: " + list.search(30));
        list.pop();
        list.display();
        list.popLast();
        list.display();
        list.delete(40);
        list.display();
        System.out.println("Size: " + list.size());
        GenericLinkedList<Integer> sortedList = new GenericLinkedList<>();
        sortedList.sortedInsert(56);
        sortedList.sortedInsert(30);
        sortedList.sortedInsert(40);
        sortedList.sortedInsert(70);
        sortedList.display();
    }
}