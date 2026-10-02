class LinkedList {
    Node head;
    public LinkedList() {
        head = null;
    }

    public int get(int index) {
        Node temp = head;
        int i = 0;
        int element = -1;

        while(temp != null && temp.next != null){
            if(index == i)
            {
                element = temp.data;
                break;
            }
            i++;
            temp = temp.next;
        }
        return element;
    }

    public void insertHead(int val) {
        Node newNode = new Node();
        newNode.data = val;
        newNode.next = head;
        head = newNode;
    }

    public void insertTail(int val) {
        Node newNode = new Node();
        newNode.data = val;
        newNode.next = null;
        
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public boolean remove(int index) {
        Node temp = head;
        Node tempPrev = null;
        int i = 0;
        int element = -1;

        while(temp.next != null){
            if(index == i)
            {
               break;
            }
            i++;
            tempPrev = temp;
            temp = temp.next;
            
        }
        if(temp == null || i > index) return false;
        if(tempPrev != null)
            tempPrev.next = temp.next;
        return true;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> res = new ArrayList<>();
        Node temp = head;

        while(temp != null){
            res.add(temp.data);
            temp = temp.next;
        }
        return res;
    }
}
class Node {
    int data;
    Node next;
}