



package linked.list.single;



public class LinkedListSingle {

    Node head;
    
    static class Node {
  
        int data;
        Node next;
 
        Node(int x)
        {
            data = x;
            next = null;
        }
            //insert 
    
     public static LinkedListSingle insert(LinkedListSingle list,
                                    int data)
    {
        
        Node newNode = new Node(data);
        newNode.next = null;
  
        
        if (list.head == null) {
            list.head = newNode;
        }
        else {
         
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
 
            last.next = newNode;
        }
  
       
        return list;
        
    }
    }
    
    
    

    
    
    
    public static void main(String[] args) {
      
          LinkedListSingle list = new LinkedListSingle();
          
          list = insert(list, 1);
        
        
    }
    
}
