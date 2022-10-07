package linkedlist;



public class cll {
	
	
	public class node{
		int data;
		node next;

		public node(int data) {
		this.data=data;
		}
		
	}
	
	public node head=null;
	public node tail=null;
	
    public void add(int data) {    
            
        node newNode = new node(data);    
               
        if(head == null) {    

            head = newNode;    
            tail = newNode;   
            newNode.next = head;
        }    
        else {    
 
            tail.next = newNode;       
            tail = newNode;
            tail.next = head;
        }    
    }    
        
   
    public void display() {    
       
        node current = head;    
            
        if(head == null) {    
            System.out.println("List is empty");    
            return;    
        }    
        System.out.println("Nodes of singly linked list: "); 
        do {
        	System.out.println(" "+ current.data);
        	current=current.next;
        }while(current != head);
        System.out.println();    
    }    
        


	public static void main(String[] args) {
		// TODO Auto-generated method stub
        cll cl = new cll();  
      
        cl.add(1);  
        cl.add(2);  
        cl.add(3);  
        cl.add(4);  
        
        cl.display();  
		

	}


}
