package practice.LinkedList;

public class LL {
    private Node head;;
    private Node tail;
    private int size;
    public LL(){
        this.size=0;
    }

    // methods of   public LL which access the structure of Node

    // display
    public void display(){
        Node temp=head;             //here we use temp as we cannot change the value of head in while the value of head will reach to tail
        while(temp!=null){              // thus destroy the structure,     WE DON'T CHANGE THE HEAD, UNTIL WE NEED TO CHANGE THE STRUCTURE OF LL
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }

    //takes the node to given index and returns that node
    public Node get(int index){
        Node temp=head;
        for(int i=1;i<index-1;i++)temp=temp.next;
        return temp;

    }


    // Fin the element in the given ll
    public int find(int value){
        Node temp=head;
        int count=0;
        while(temp!=null){
            if(temp.value==value){
                return count;
                //return Node;
                // we can also return the node, but the node value will be just the address of next node thus not readable
            }
            count++;
            temp=temp.next;
        }
        return -1;
        //return null;
    }


    // INSERT USING RECURSION




    public void insertFirst(int val){
        Node  node=new Node(val);
        node.next=head;
        head=node;

        // if the ll is empty
        if(tail==null){
            tail=head;
        }
        size+=1;
    }
    // we use tail thus, here time complexity is constant
    public void insertLast(int val){
        if (tail==null) {
            insertFirst(val);
            return;
        }
        Node node= new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }
    // if we don't have value of tail; need to travel the temp(having value of head) till the end of ll and add the new node there
    //time complexity O(n)


    // insert at n
    public void insert(int val,int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node temp=get(index);

        Node node=new Node(val,temp.next);      // temp.next passes the next value of the nth element and adds the no with its next value
        temp.next=node;
        size++;
    }

   // Delete at First
    public int deleteFirst(){
        int val=head.value;
        head=head.next;
        if(head==null){     // if it's ll was of only one element
                tail=null;
        }
        size--;
        return val;
    }

    //Time Complexity is O(n)
    public int deleteLast(){
        //reach to second last item
        if(size<=1) return deleteFirst();
        Node secondlast = get(size-2);
        int val= tail.value;
        secondlast.next=null;
        return val;
    }

    public int delete(int index){
        if(index<=1) return deleteFirst();
        if(index==size-1) return deleteLast();
        Node temp=get(index-1);
        int val=temp.next.value;

        temp.next=temp.next.next;
        return val;
    }



    // Structure of Node and initializing the values
    private class Node{
        private int value;
        private Node next;      // next is ptr a reff variable that points into the next object

        public Node(int value){
            this.value=value;
        }
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }
}
