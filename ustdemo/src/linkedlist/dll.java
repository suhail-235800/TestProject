package linkedlist;


public class dll {
	
	
	class node{
		
		node prev;
		int data;
		node next;

		public node(int data) {
			
		this.prev=null;
		this.data=data;
		this.next=null;
		}
		
	}
	
	public node head=null;
	public node tail=null;
	
    public void addNode(int data) {    
            
        node newNode = new node(data);    
               
        if(head == null) {    

            head = newNode;    
            tail = newNode;    
            head.prev=null;
        }    
        else {    
 
        	
            tail.next = newNode;   
            newNode.prev = tail;
            tail = newNode;
            tail.next = null;
        }    
    }    
        
   
    public void display() {    
       
        node current = head;    
            
        if(head == null) {    
            System.out.println("List is empty");    
            return;    
        }    
        System.out.println("Nodes of linked list: ");    
        while(current != null) {    
  
            System.out.print(current.data + " ");    
            current = current.next;    
        }    
        System.out.println();    
    }    

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        dll dList = new dll();    
        
        
        dList.addNode(1);    
        dList.addNode(2);    
        dList.addNode(3);    
        dList.addNode(4);     
        dList.display();  	
		
		
	}

}
