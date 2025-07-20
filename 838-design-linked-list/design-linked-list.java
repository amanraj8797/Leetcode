class MyLinkedList {

    class Node {

        int val;
        Node next;

        Node(int val) {
            this.val = val;
            next = null;
        }
    }

    Node head;
    int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }
    
    public int get(int index) {

        if(index < 0 || index >= size) return -1;

        Node temp = head;

        for(int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp.val;        
    }
    
    public void addAtHead(int val) {

        size++;

        Node newNode = new Node(val);

        newNode.next = head;
        head = newNode;
        
    }
    
    public void addAtTail(int val) {

        size++;
        Node temp = head;

        Node newNode = new Node(val);

        if(head == null) {
          head = newNode;
          return;
        }  

        while(temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        
    }
    
    public void addAtIndex(int index, int val) {

        if (index < 0 || index > size) {
            return; 
        }

        if(index == 0) {
            addAtHead(val);
            return;
        }else if(index == size) {
            addAtTail(val);
            return;
        }

        size++;

        int count = 0;

        Node newNode = new Node(val);

        Node temp = head;

        for(int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        
    }
    
    public void deleteAtIndex(int index) {

        if (index < 0 || index >= size) return;

        size--;

        if(index == 0) {
            head = head.next;
            return;
        }

        Node temp = head;
        for(int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        
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