class Node {
    int val;
    Node prev;
    Node next;

    public Node(int val) {
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}

class MyLinkedList {
    Node head;
    Node tail;
    int size;

    public MyLinkedList() {
        head = new Node(-1);
        tail = new Node(-1);
        head.next = tail;
        tail.prev = head;
        size = 0;
    }

    public void print() {
        System.out.println();
        Node curr = head.next;
        while (curr != tail) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println();
    }

    public int get(int index) {

        if (index < 0 || index >= size) {
            return -1;
        }
        Node current = head.next;

        int i = 0;
        while (current.next != tail) {
            if (i == index) {
                return current.val;
            }
            i++;
            current = current.next;
        }

        return current.val;
    }

    public void addAtHead(int val) {
        Node newNode = new Node(val);

        newNode.prev = head;
        newNode.next = head.next;

        head.next.prev = newNode;
        head.next = newNode;
        size++;

    }

    public void addAtTail(int val) {
        Node newNode = new Node(val);

        newNode.next = tail;
        newNode.prev = tail.prev;

        tail.prev.next = newNode;
        tail.prev = newNode;
        size++;
    }

    public void addAtIndex(int index, int val) {
        Node current = head.next;
        Node newNode = new Node(val);

        if (index <= size) {

            int i = 0;
            while (i <= index) {
                if (i == index) {

                    current.prev.next = newNode;
                    newNode.prev = current.prev;
                    newNode.next = current;
                    current.prev = newNode;
                }
                i++;
                current = current.next;
            }
            size++;
        }

    }

    public void deleteAtIndex(int index) {

        if (size > 0 && index <= size - 1) {
            Node current = head.next;

            int i = 0;
            while (i <= index) {
                if (i == index) {

                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                i++;
                current = current.next;
            }
            size--;

        }

    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */