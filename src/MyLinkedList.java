public class MyLinkedList {
    private Node head;
    private int size;
    public MyLinkedList() {
        head = null;
        size = 0;
    }
    public boolean isEmpty() {
        if(size == 0)return true;
        return false;
    }

    public void append(int data) {
        Node newNode = new Node(data);
        boolean isFirstNode = head == null;
        if(isFirstNode)head = newNode;
        else {
            Node current = head;
            while(current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

         size++;

    }

    public int size() {
        return size;

    }

    public int get(int index) {
        if(index < 0 || index == size)throw new IndexOutOfBoundsException();
        Node currentNode = head;
        for(int i = 0; i < index; i++){
            currentNode = currentNode.next;
        }

    return currentNode.data;
    }

    public void prepend(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void deleteAt(int index) {
        if(index < 0 || index == size)throw new IndexOutOfBoundsException();
        if(index == 0)head = head.next;
        else {
            Node currentNode = head;
            for (int j = 0; j < index - 1; j++) {
                currentNode = currentNode.next;
            }
            currentNode.next = currentNode.next.next;
        }
     size--;
    }

    public void delete(int value) {
        Node currentNode = head;
        int index = 0;
        for(int i = 0; i < size; i++) {
            currentNode = currentNode.next;
            if(currentNode.data == value) {
                this.deleteAt(i);
                index = 1;
                break;
            }
            else throw new IllegalArgumentException("Value is not valid");
        }

    }

    public int find(int value) {
        int answer = -1;
        Node currentNode = head;
        for(int index = 0; index < size; index++) {
            currentNode = currentNode.next;
            if(currentNode.data == value) {
                answer = index + 1;
                return answer;
            }
        }
        if(answer == -1)throw new IndexOutOfBoundsException();
        return answer;
    }

    public void insert(int value, int index) {
        if(index < 0 || index >= size)throw new IndexOutOfBoundsException();
        if(index == 0) {
            Node newNode = new Node(value);
            newNode.next = head;
            head = newNode;
            size++;
        }

            Node currentNode = head;
            for(int i = 0; i < index - 1 ; i++) {
                currentNode = currentNode.next;
            }
            Node newNode = new Node(value);
            newNode.next = currentNode.next;
            currentNode.next = newNode;

            size++;


    }
}
