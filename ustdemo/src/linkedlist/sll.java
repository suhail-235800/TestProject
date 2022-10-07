package linkedlist;

public class sll {
	
	
	class node{
		int data;
		node next;

		public node(int data) {
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
        }    
        else {    
 
            tail.next = newNode;       
            tail = newNode;    
        }    
    }    
        
   
    public void display() {    
       
        node current = head;    
            
        if(head == null) {    
            System.out.println("List is empty");    
            return;    
        }    
        System.out.println("Nodes of singly linked list: ");    
        while(current != null) {    
  
            System.out.print(current.data + " ");    
            current = current.next;    
        }    
        System.out.println();    
    }    
        
	
	public static void main(String[] args) {
		

        sll sList = new sll();    
        
      
        sList.addNode(1);    
        sList.addNode(2);    
        sList.addNode(3);    
        sList.addNode(4);     
        sList.display();    
	}

}
