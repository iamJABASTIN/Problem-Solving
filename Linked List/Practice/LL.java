public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = tail = node;
        } else {
            node.next = head;
            head = node;
        }

        size++;
    }

    public void insertLast(int value) {
        Node node = new Node(value);
        if (tail == null) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void display() {
        if (head == null) {
            System.out.println("The LinkedList is empty!!");
            return;
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            }
        }
    }

    public void displayFirst() {
        if (head != null) {
            System.out.println("\n" + head.value);
        }
    }

    public void displayLast() {
        if (tail != null) {
            System.out.println("\n" + tail.value);
        }
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}